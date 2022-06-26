package com.woniuxy.community.pojos;

import java.util.Date;

public class RepairBean {

  private Integer id;

  private RepairtypeBean repairtype;

  private Date comDate;
  private Date handleDate;

  private OwnerBean owner;

  private Integer status;
  private Integer clr;
  private String remarks;

  @Override
  public String toString() {
    return "RepairBean{" +
            "id=" + id +
            ", repairtype=" + repairtype +
            ", comDate=" + comDate +
            ", handleDate=" + handleDate +
            ", owner=" + owner +
            ", status=" + status +
            ", clr=" + clr +
            ", remarks='" + remarks + '\'' +
            '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RepairtypeBean getRepairtype() {
    return repairtype;
  }

  public void setRepairtype(RepairtypeBean repairtype) {
    this.repairtype = repairtype;
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

  public OwnerBean getOwner() {
    return owner;
  }

  public void setOwner(OwnerBean owner) {
    this.owner = owner;
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
}
