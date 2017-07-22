/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.model;

import java.util.List;

/**
 *
 * @author SpringLayers
 */
public class HelloWorldParamsModel {

    private int id;
    private String firstname;
    private String lastname;
    private String school;
    private String house;
    private List friendid;
    private String guardianfirstname;
    private String guardianlastname;
    private String phone;
    private String phoneType;

    public HelloWorldParamsModel(int id, String firstname, String lastname, String school, String house, List friendid, String guardianfirstname, String guardianlastname, String phone, String phoneType) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.school = school;
        this.house = house;
        this.friendid = friendid;
        this.guardianfirstname = guardianfirstname;
        this.guardianlastname = guardianlastname;
        this.phone = phone;
        this.phoneType = phoneType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public List getFriendid() {
        return friendid;
    }

    public void setFriendid(List friendid) {
        this.friendid = friendid;
    }

    public String getGuardianfirstname() {
        return guardianfirstname;
    }

    public void setGuardianfirstname(String guardianfirstname) {
        this.guardianfirstname = guardianfirstname;
    }

    public String getGuardianlastname() {
        return guardianlastname;
    }

    public void setGuardianlastname(String guardianlastname) {
        this.guardianlastname = guardianlastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "HelloWorldParamsModel{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", school=" + school + ", house=" + house + ", friendid=" + friendid + ", guardianfirstname=" + guardianfirstname + ", guardianlastname=" + guardianlastname + ", phone=" + phone + ", phoneType=" + phoneType + '}';
    }
}
