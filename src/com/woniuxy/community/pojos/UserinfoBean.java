package com.woniuxy.community.pojos;

public class UserinfoBean {

  private Integer id;
  private String username;
  private String password;
  private Integer type;
  private String remarks;

  @Override
  public String toString() {
    return "UserinfoBean{" +
            "id=" + id +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", type=" + type +
            ", remarks='" + remarks + '\'' +
            '}';
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }
}
