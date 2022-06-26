package com.woniuxy.community.pojos;


import java.util.Date;

public class ComplaintBean {

  private Integer id;
  private ComplaintTypeBean complaintType;

  private java.util.Date comDate;
  private java.util.Date handleDate;

  private OwnerBean ownerBean;

  private Integer status;
  private Integer clr;
  private String remarks;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ComplaintTypeBean getComplaintType() {
    return complaintType;
  }

  public void setComplaintType(ComplaintTypeBean complaintType) {
    this.complaintType = complaintType;
  }

  public Date getComDate() {
    return comDate;
  }

  public void setComDate(Date comDate) {
    this.comDate = comDate;
  }

  public Date getHandleDate() {
    return handleDate;
  }

  public void setHandleDate(Date handleDate) {
    this.handleDate = handleDate;
  }

  public OwnerBean getOwnerBean() {
    return ownerBean;
  }

  public void setOwnerBean(OwnerBean ownerBean) {
    this.ownerBean = ownerBean;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getClr() {
    return clr;
  }

  public void setClr(Integer clr) {
    this.clr = clr;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  @Override
  public String toString() {
    return "ComplaintBean{" +
            "id=" + id +
            ", complaintType=" + complaintType +
            ", comDate=" + comDate +
            ", handleDate=" + handleDate +
            ", ownerBean=" + ownerBean +
            ", status=" + status +
            ", clr=" + clr +
            ", remarks='" + remarks + '\'' +
            '}';
  }
}
