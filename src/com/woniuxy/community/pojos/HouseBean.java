package com.woniuxy.community.pojos;

import java.util.List;

public class HouseBean {

  private int id;
//  private long storey;
  private String numbers;
  private int status;
  private java.sql.Timestamp intoDate;
  private BuildingBean buildingId;
//  private String remarks;
  private double area;
  private List<OwnerBean> ownerBean;

  @Override
  public String toString() {
    return "HouseBean{" +
            "id=" + id +
            ", numbers='" + numbers + '\'' +
            ", status=" + status +
            ", intoDate=" + intoDate +
            ", buildingId=" + buildingId +
            ", area=" + area +
            ", ownerBean=" + ownerBean +
            '}';
  }

  public List<OwnerBean> getOwnerBean() {
    return ownerBean;
  }

  public void setOwnerBean(List<OwnerBean> ownerBean) {
    this.ownerBean = ownerBean;
  }

  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNumbers() {
    return numbers;
  }

  public void setNumbers(String numbers) {
    this.numbers = numbers;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }


  public java.sql.Timestamp getIntoDate() {
    return intoDate;
  }

  public void setIntoDate(java.sql.Timestamp intoDate) {
    this.intoDate = intoDate;
  }

  public BuildingBean getBuildingId() {
    return buildingId;
  }

  public void setBuildingId(BuildingBean buildingId) {
    this.buildingId = buildingId;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

}
