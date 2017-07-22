/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SpringLayers
 */
@Entity
@Table(name = "house")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "House.findAll", query = "SELECT h FROM House h")
    , @NamedQuery(name = "House.findByHouseId", query = "SELECT h FROM House h WHERE h.houseId = :houseId")
    , @NamedQuery(name = "House.findByHouseName", query = "SELECT h FROM House h WHERE h.houseName = :houseName")})
public class House implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "houseId")
    private Integer houseId;
    @Size(max = 45)
    @Column(name = "houseName")
    private String houseName;
    @OneToMany(mappedBy = "house")
    private Collection<Wizard> wizardCollection;

    public House() {
    }

    public House(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    @XmlTransient
    public Collection<Wizard> getWizardCollection() {
        return wizardCollection;
    }

    public void setWizardCollection(Collection<Wizard> wizardCollection) {
        this.wizardCollection = wizardCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (houseId != null ? houseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof House)) {
            return false;
        }
        House other = (House) object;
        if ((this.houseId == null && other.houseId != null) || (this.houseId != null && !this.houseId.equals(other.houseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.springlayers1.entity.House[ houseId=" + houseId + " ]";
    }
    
}
