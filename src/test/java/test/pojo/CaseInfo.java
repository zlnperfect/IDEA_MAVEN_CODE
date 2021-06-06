package test.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class CaseInfo {
    //CaseId(用例编号)	Name(接口名)	Type(接口提交类型)	Url(接口地址)	Desc(用例描述)	Params(参数)	Content-Type
    @Excel(name="CaseId(用例编号)")
    private int caseId;
    @Excel(name = "Url(接口地址)")
    private String url;
    @Excel(name="Desc(用例描述)")
    private String desc;
    @Excel(name="Params(参数)")
    private String params;
    @Excel(name="Content-Type")
    private String type;

    @Override
    public String toString() {
        return "CaseInfo{" +
                "caseId=" + caseId +
                ", url='" + url + '\'' +
                ", desc='" + desc + '\'' +
                ", params='" + params + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getCaseId() {
        return caseId;
    }

    public String getUrl() {
        return url;
    }

    public String getDesc() {
        return desc;
    }

    public String getParams() {
        return params;
    }

    public String getType() {
        return type;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public void setType(String type) {
        this.type = type;
    }
}
