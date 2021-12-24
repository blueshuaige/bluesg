package com.buid.accesscontrolmanager.entity;


public class AccessControlDevice {

  private long id;
  private String principal;
  private String supplier;
  private String brand;
  private long hospitalId;
  private long status;
  private java.sql.Date addTime;
  private Buiding buiding;
  public Buiding getBuiding() {
    return buiding;
  }

  public void setBuiding(Buiding buiding) {
    this.buiding = buiding;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }


  public String getSupplier() {
    return supplier;
  }

  public void setSupplier(String supplier) {
    this.supplier = supplier;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public long getHospitalId() {
    return hospitalId;
  }

  public void setHospitalId(long hospitalId) {
    this.hospitalId = hospitalId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Date getAddTime() {
    return addTime;
  }

  public void setAddTime(java.sql.Date addTime) {
    this.addTime = addTime;
  }

}
