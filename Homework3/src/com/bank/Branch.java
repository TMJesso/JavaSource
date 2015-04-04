/*
 * Branch.java
 * 
 * A particular Branch of the Bank.
 * The Bank has multiple Branches and a Branch
 * has multiple accounts
 *
 * @author AMA
 * @since 3/10/2014
 * @version 1.0
*/
package com.bank;

public class Branch {

    // Branch will have the following attributes
    // Declaring these private secures the attributes
    private String name, address, phone;     
    private long branchID;
    
    /**
    *
    * Branch constructor requiring four 
    * attributes to create
    *
    * @param branchID long unique ID for the branch
    * @param name String the branch name
    * @param address String the branch address
    * @param phone String the branch phone
    */
    public Branch(long branchID, String name, String address, String phone){
        this.branchID = branchID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    
    public long getBranchID(){
        return branchID;
    }
    
    public void setBranchID(long branchID){
        this.branchID = branchID;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    /**
    *
    * String representation of this object
    * 
    * @returns String attributes represented as a String
    */       
    @Override
    public String toString() {
        return "BranchID: " + branchID +
               "\nName: " + name +
               "\nAddress: " + address + 
               "\nPhone: " + phone ;
    }
}
