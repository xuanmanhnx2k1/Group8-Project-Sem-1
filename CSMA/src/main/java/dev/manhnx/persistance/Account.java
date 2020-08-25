package dev.manhnx.persistance;

import java.sql.Date;

public class Account {
    private int accId;
    private String userName;
    private String password;
    private int position;
    private String email;
    private String fullName;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private int accStatus;
    public int gender;
    public void setGender(int gender){
        this.gender = gender;
    }
    public int setGender(){
        return gender;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhonNumber(){
        return phoneNumber;
    } 
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
    public Date getBirthDate(){
        return birthDate = birthDate;
    }
    public void setAccStatus(int accStatus){
        this.accStatus = accStatus;
    }
    public int getAccStatus(){
        return accStatus;
    }


    public void setAccId(int accId){
        this.accId = accId;
    }
    public int getAccId(){
        return accId;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    public void setPassword(String password){
        this.password =password;
    }
    public String getPassword() {
        return password;
    }
    public void setPosition(int position){
        this.position = position;
    }
    public int getPosition(){
        return position;
    }
    public void setEmail(String string){
        this.email=string;
    }
    public String getEmail() {
        return email;
    }
    
}