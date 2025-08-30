package com.wecp.progressive.entity;

public class Supplier {
    private int supplierId;
    private String supplierName;
    private String email;
    private String address;
    private String role;
    public Supplier() {
    }
    public Supplier(int supplierId, String supplierName, String email, String address, String role) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.email = email;
        this.address = address;
        this.role = role;
    }
    public int getSupplierId() {
        return supplierId;
    }
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    

    

    

   
    

}