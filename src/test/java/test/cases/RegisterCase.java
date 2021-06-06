package test.cases;

import org.testng.annotations.DataProvider;
import test.pojo.CaseInfo;
import test.utils.ExcelUtils;
import test.utils.HttpUtil;

import java.util.HashMap;
import java.util.Map;

public class RegisterCase {
    public void test(CaseInfo caseInfo){
        String params=caseInfo.getParams();
        String contentType=caseInfo.getType();
        String url=caseInfo.getUrl();
        String type=caseInfo.getType();

        //注册接口进行测试
        Map<String,Object> headers=new HashMap<String, Object>();
        headers.put("X-Lemonban-Media-Type","lemonban.v1");
        headers.put("Content-Type","application/json");
        String body=null;

        if("post".equalsIgnoreCase(type)){
//            body= HttpUtil.
        }
    }

    @DataProvider
    public Object[] datas() throws Exception {
        //1.从用excel读取用例信息,并返回一个一维数组
        return ExcelUtils.read(0,1);
    }
}
