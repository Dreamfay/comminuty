package com.woniuxy.community.pojos;

import java.util.List;

public class OwnerBean {

  private long id;
  private String username;
  private String tel;
  private String sex;
  private String identity;
  private List<HouseBean> houses;

  @Override
  public String toString() {
    return "OwnerBean{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", tel='" + tel + '\'' +
            ", sex='" + sex + '\'' +
            ", identity='" + identity + '\'' +
            ", houses=" + houses +
            ", houseId=" + houseId +
            ", remarks='" + remarks + '\'' +
            ", password='" + password + '\'' +
            '}';
  }

  public void setHouseId(HouseBean houseId) {
    this.houseId = houseId;
  }

  private HouseBean houseId;
  private String remarks;
  private String password;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
