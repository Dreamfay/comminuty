package com.woniuxy.community.pojos;


public class RepairtypeBean {

  private Integer id;
  private String name;
  private String remarks;
  private Integer status;

  @Override
  public String toString() {
    return "RepairtypeBean{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", remarks='" + remarks + '\'' +
            ", status=" + status +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
}
