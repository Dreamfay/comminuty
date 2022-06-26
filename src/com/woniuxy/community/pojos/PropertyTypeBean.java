package com.woniuxy.community.pojos;

public class PropertyTypeBean {

  private long id;
  private String name;
  private double price;
  private String unit;
  private String remarks;

  @Override
  public String toString() {
    return "PropertyTypeBean{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", unit='" + unit + '\'' +
            ", remarks='" + remarks + '\'' +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
