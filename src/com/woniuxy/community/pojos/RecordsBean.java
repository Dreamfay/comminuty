package com.woniuxy.community.pojos;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class RecordsBean {

  private int id;
  //费用类型
  private int typeId;
  private List<PropertyTypeBean> typeBean;
  //上次度数
  private double num;
  //本次度数
  private double num2;
  //房间号
  private int houseId;

  private List<HouseBean> houseBean;

  @Override
  public String toString() {
    return "RecordsBean{" +
            "id=" + id +
            ", typeId=" + typeId +
            ", typeBean=" + typeBean +
            ", num=" + num +
            ", num2=" + num2 +
            ", houseId=" + houseId +
            ", houseBean=" + houseBean +
            ", upTime=" + upTime +
            ", onTime=" + onTime +
            ", checkTime=" + checkTime +
            ", meter='" + meter + '\'' +
            ", remarks='" + remarks + '\'' +
            '}';
  }

  private java.sql.Timestamp upTime;
  private java.sql.Timestamp onTime;
  //登记时间
  private Date checkTime;
  //抄表员
  private String meter;
  //备注
  private String remarks;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getTypeId() {
    return typeId;
  }

  public void setTypeId(int typeId) {
    this.typeId = typeId;
  }

  public List<PropertyTypeBean> getTypeBean() {
    return typeBean;
  }

  public void setTypeBean(List<PropertyTypeBean> typeBean) {
    this.typeBean = typeBean;
  }

  public double getNum() {
    return num;
  }

  public void setNum(double num) {
    this.num = num;
  }

  public double getNum2() {
    return num2;
  }

  public void setNum2(double num2) {
    this.num2 = num2;
  }

  public int getHouseId() {
    return houseId;
  }

  public void setHouseId(int houseId) {
    this.houseId = houseId;
  }

  public List<HouseBean> getHouseBean() {
    return houseBean;
  }

  public void setHouseBean(List<HouseBean> houseBean) {
    this.houseBean = houseBean;
  }

  public Timestamp getUpTime() {
    return upTime;
  }

  public void setUpTime(Timestamp upTime) {
    this.upTime = upTime;
  }

  public Timestamp getOnTime() {
    return onTime;
  }

  public void setOnTime(Timestamp onTime) {
    this.onTime = onTime;
  }

  public Date getCheckTime() {
    return checkTime;
  }

  public void setCheckTime(Date checkTime) {
    this.checkTime = checkTime;
  }

  public String getMeter() {
    return meter;
  }

  public void setMeter(String meter) {
    this.meter = meter;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }
}
