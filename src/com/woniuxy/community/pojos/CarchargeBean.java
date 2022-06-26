package com.woniuxy.community.pojos;

import java.util.Date;

public class CarchargeBean {

  private Integer id;
  private Date payDate;
  private String endDate;
  private double money;
  private long status;
  private String remarks;
  private String type;
  private ParkingBean parkId;
  private OwnerBean ownerId;


  @Override
  public String toString() {
    return "CarchargeBean{" +
            "id=" + id +
            ", payDate=" + payDate +
            ", endDate='" + endDate + '\'' +
            ", money=" + money +
            ", status=" + status +
            ", remarks='" + remarks + '\'' +
            ", type='" + type + '\'' +
            ", parkId=" + parkId +
            ", ownerId=" + ownerId +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Date getPayDate() {
    return payDate;
  }

  public void setPayDate(Date payDate) {
    this.payDate = payDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ParkingBean getParkId() {
    return parkId;
  }

  public void setParkId(ParkingBean parkId) {
    this.parkId = parkId;
  }

  public OwnerBean getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(OwnerBean ownerId) {
    this.ownerId = ownerId;
  }
}
