package com.jsont;

import java.util.List;
import java.util.Map;

public class China {
    private String name;
    private List<Map<String,String>> provinces;

    public String getName() {
        return name;
    }

    public List<Map<String, String>> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Map<String, String>> provinces) {
        this.provinces = provinces;
    }

    public void setName(String name) {
        this.name = name;
    }


}
