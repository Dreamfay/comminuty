package com.woniuxy.community.pojos;

public class GetCountBean {
    private String typeName;
    private Integer num;

    @Override
    public String toString() {
        return "GetCountBean{" +
                "name='" + typeName + '\'' +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return typeName;
    }

    public void setName(String name) {
        this.typeName = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
