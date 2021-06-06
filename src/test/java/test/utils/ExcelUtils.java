package test.utils;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import test.pojo.CaseInfo;

import java.io.FileInputStream;

import java.util.List;

public class ExcelUtils {
    public static void main(String[] args) throws Exception {
        read(0,1);
    }
    //read() 方法对sheet 页进行传参，会使读 excel变的更加灵活些
    public static Object[] read(int startSheetindex,int setSheetNum) throws Exception {

        //加载excel文件
        FileInputStream fis=new FileInputStream("src/test/resources/cases_v1.xls");
        //创建easypoi导入参数（easypoi的专属导入参数，easyPOI 有对应的类 导入 ImportParams 类）
        ImportParams params=new ImportParams();  //直接new 之后，有默认设置的
        params.setStartSheetIndex(startSheetindex);
        params.setSheetNum(setSheetNum);
        //importExcel(excel文件流对象，excel映射实体类.class,easypoi导入参数)
        List<CaseInfo> caseInfoList=ExcelImportUtil.importExcel(fis, CaseInfo.class,params);//方法的返回值应该是什么？
        for (CaseInfo caseInfo:caseInfoList){
            System.out.println(caseInfo);
        }
        Object[] object=caseInfoList.toArray();

        fis.close();

        return object;

    }
}
