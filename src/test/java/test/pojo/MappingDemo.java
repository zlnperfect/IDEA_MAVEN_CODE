package test.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class MappingDemo {
    //CaseId	Name	Url	Type
    @Excel(name="CaseId")
    private int caseId;
    @Excel(name="Name")
    private int name;
    @Excel(name="Url")
    private int url;

    public int getCaseId() {
        return caseId;
    }

    public int getName() {
        return name;
    }

    public int getUrl() {
        return url;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setUrl(int url) {
        this.url = url;
    }
}
