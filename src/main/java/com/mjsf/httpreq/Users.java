/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjsf.httpreq;

import java.util.ArrayList;

/**
 *
 * @author grios
 */
public class Users {
    private int id;
    private String name;
    private String username;
    private String email;
    // private ArrayList<UsrsAdr> address;
    private String phone;
    private String website;
   // private ArrayList<UsrCompany> company;

    public Users(int id, String name, String username, String email, ArrayList<UsrsAdr> address, String phone, String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
      //  this.address = address;
        this.phone = phone;
        this.website = website;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

//    public ArrayList<UsrsAdr> getAddress() {
//        return address;
//    }
//
//    public void setAddress(ArrayList<UsrsAdr> address) {
//        this.address = address;
//    }

    
    
}
