package com.bs.pojo;
// Generated Sep 4, 2016 8:27:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Suppervisor generated by hbm2java
 */
public class Suppervisor  implements java.io.Serializable {


     private Integer supId;
     private Employee employee;
     private Location location;
     private Manager manager;
     private String supName;
     private Set suppliers = new HashSet(0);

    public Suppervisor() {
    }

    public Suppervisor(Employee employee, Location location, Manager manager, String supName, Set suppliers) {
       this.employee = employee;
       this.location = location;
       this.manager = manager;
       this.supName = supName;
       this.suppliers = suppliers;
    }
   
    public Integer getSupId() {
        return this.supId;
    }
    
    public void setSupId(Integer supId) {
        this.supId = supId;
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
    public Manager getManager() {
        return this.manager;
    }
    
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public String getSupName() {
        return this.supName;
    }
    
    public void setSupName(String supName) {
        this.supName = supName;
    }
    public Set getSuppliers() {
        return this.suppliers;
    }
    
    public void setSuppliers(Set suppliers) {
        this.suppliers = suppliers;
    }




}


