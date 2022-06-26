package com.woniuxy.community.pojos;

import java.util.Date;

public class Emp {

  private long id;
  private String empno;
  private String job;
  private Date birth;
  private long sal;
  private long deptno;

  @Override
  public String toString() {
    return "Emp{" +
            "id=" + id +
            ", empno='" + empno + '\'' +
            ", job='" + job + '\'' +
            ", birth=" + birth +
            ", sal=" + sal +
            ", deptno=" + deptno +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getEmpno() {
    return empno;
  }

  public void setEmpno(String empno) {
    this.empno = empno;
  }


  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }


  public java.util.Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  public long getSal() {
    return sal;
  }

  public void setSal(long sal) {
    this.sal = sal;
  }

  public long getDeptno() {
    return deptno;
  }

  public void setDeptno(long deptno) {
    this.deptno = deptno;
  }

}
