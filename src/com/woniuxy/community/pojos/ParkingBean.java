package com.woniuxy.community.pojos;

public class ParkingBean {

  private int id;
  private String numbers;
  private int status;
  private int ownerId;
  private String remarks;

  @Override
  public String toString() {
    return "ParkingBean{" +
            "id=" + id +
            ", numbers='" + numbers + '\'' +
            ", status=" + status +
            ", ownerId=" + ownerId +
            ", remarks='" + remarks + '\'' +
            '}';
  }

  public int getId() {
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

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public int getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(int ownerId) {
    this.ownerId = ownerId;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }
}
