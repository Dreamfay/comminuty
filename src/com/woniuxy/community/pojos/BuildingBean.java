package com.woniuxy.community.pojos;

public class BuildingBean {

  private long id;
  private String numbers;
  private String uints;
  private String remarks;

  @Override
  public String toString() {
    return "BuildingBean{" +
            "id=" + id +
            ", numbers='" + numbers + '\'' +
            ", uints='" + uints + '\'' +
            ", remarks='" + remarks + '\'' +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNumbers() {
    return numbers;
  }

  public void setNumbers(String numbers) {
    this.numbers = numbers;
  }


  public String getUints() {
    return uints;
  }

  public void setUints(String uints) {
    this.uints = uints;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
