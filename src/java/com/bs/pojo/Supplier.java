package com.bs.pojo;
// Generated Sep 4, 2016 8:27:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Supplier generated by hbm2java
 */
public class Supplier  implements java.io.Serializable {


     private Integer suppId;
     private Employee employee;
     private Location location;
     private Suppervisor suppervisor;
     private String suppName;
     private Set drivers = new HashSet(0);

    public Supplier() {
    }

    public Supplier(Employee employee, Location location, Suppervisor suppervisor, String suppName, Set drivers) {
       this.employee = employee;
       this.location = location;
       this.suppervisor = suppervisor;
       this.suppName = suppName;
       this.drivers = drivers;
    }
   
    public Integer getSuppId() {
        return this.suppId;
    }
    
    public void setSuppId(Integer suppId) {
        this.suppId = suppId;
    }
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public Suppervisor getSuppervisor() {
        return this.suppervisor;
    }
    
    public void setSuppervisor(Suppervisor suppervisor) {
        this.suppervisor = suppervisor;
    }
    public String getSuppName() {
        return this.suppName;
    }
    
    public void setSuppName(String suppName) {
        this.suppName = suppName;
    }
    public Set getDrivers() {
        return this.drivers;
    }
    
    public void setDrivers(Set drivers) {
        this.drivers = drivers;
    }




}


