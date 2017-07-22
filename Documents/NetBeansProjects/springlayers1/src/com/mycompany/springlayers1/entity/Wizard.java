/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SpringLayers
 */
@Entity
@Table(name = "wizard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wizard.findAll", query = "SELECT w FROM Wizard w")
    , @NamedQuery(name = "Wizard.findById", query = "SELECT w FROM Wizard w WHERE w.id = :id")
    , @NamedQuery(name = "Wizard.findByFirstname", query = "SELECT w FROM Wizard w WHERE w.firstname = :firstname")
    , @NamedQuery(name = "Wizard.findByCompanyname", query = "SELECT w FROM Wizard w WHERE w.companyname = :companyname")
    , @NamedQuery(name = "Wizard.findByLastname", query = "SELECT w FROM Wizard w WHERE w.lastname = :lastname")
    , @NamedQuery(name = "Wizard.findByMiddlename", query = "SELECT w FROM Wizard w WHERE w.middlename = :middlename")
    , @NamedQuery(name = "Wizard.findByPrefix", query = "SELECT w FROM Wizard w WHERE w.prefix = :prefix")
    , @NamedQuery(name = "Wizard.findBySuffix", query = "SELECT w FROM Wizard w WHERE w.suffix = :suffix")
    , @NamedQuery(name = "Wizard.findByAddress1", query = "SELECT w FROM Wizard w WHERE w.address1 = :address1")
    , @NamedQuery(name = "Wizard.findByAddress2", query = "SELECT w FROM Wizard w WHERE w.address2 = :address2")
    , @NamedQuery(name = "Wizard.findByAddress3", query = "SELECT w FROM Wizard w WHERE w.address3 = :address3")
    , @NamedQuery(name = "Wizard.findByCity", query = "SELECT w FROM Wizard w WHERE w.city = :city")
    , @NamedQuery(name = "Wizard.findByState", query = "SELECT w FROM Wizard w WHERE w.state = :state")
    , @NamedQuery(name = "Wizard.findByZip", query = "SELECT w FROM Wizard w WHERE w.zip = :zip")
    , @NamedQuery(name = "Wizard.findByZip4", query = "SELECT w FROM Wizard w WHERE w.zip4 = :zip4")
    , @NamedQuery(name = "Wizard.findByComment", query = "SELECT w FROM Wizard w WHERE w.comment = :comment")
    , @NamedQuery(name = "Wizard.findByValid", query = "SELECT w FROM Wizard w WHERE w.valid = :valid")})
public class Wizard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    
    @Size(max = 20)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 20)
    @Column(name = "companyname")
    private String companyname;
    @Size(max = 35)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 20)
    @Column(name = "middlename")
    private String middlename;
    @Size(max = 10)
    @Column(name = "prefix")
    private String prefix;
    @Size(max = 10)
    @Column(name = "suffix")
    private String suffix;
    @Size(max = 45)
    @Column(name = "address1")
    private String address1;
    @Size(max = 45)
    @Column(name = "address2")
    private String address2;
    @Size(max = 45)
    @Column(name = "address3")
    private String address3;
    @Size(max = 45)
    @Column(name = "city")
    private String city;
    @Size(max = 45)
    @Column(name = "state")
    private String state;
    @Size(max = 5)
    @Column(name = "zip")
    private String zip;
    @Size(max = 4)
    @Column(name = "zip4")
    private String zip4;
    @Size(max = 45)
    @Column(name = "comment")
    private String comment;
    @Column(name = "valid")
    private Character valid;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "wizard")
    private Friend friend;
    
    @JoinColumn(name = "country", referencedColumnName = "countryId")
    @ManyToOne
    private Country country;
    
    @JoinColumn(name = "house", referencedColumnName = "houseId")
    @ManyToOne
    private House house;
    @JoinColumn(name = "school", referencedColumnName = "schoolId")
    @ManyToOne
    private School school;

    public Wizard() {
    }

    public Wizard(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip4() {
        return zip4;
    }

    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Character getValid() {
        return valid;
    }

    public void setValid(Character valid) {
        this.valid = valid;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wizard)) {
            return false;
        }
        Wizard other = (Wizard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.springlayers1.entity.Wizard[ id=" + id + " ]";
    }
    
}
