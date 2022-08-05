/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "council")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Council.findAll", query = "SELECT c FROM Council c"),
    @NamedQuery(name = "Council.findById", query = "SELECT c FROM Council c WHERE c.id = :id"),
    @NamedQuery(name = "Council.findByDateForm", query = "SELECT c FROM Council c WHERE c.dateForm = :dateForm"),
    @NamedQuery(name = "Council.findByDateEnd", query = "SELECT c FROM Council c WHERE c.dateEnd = :dateEnd"),
    @NamedQuery(name = "Council.findByIsActive", query = "SELECT c FROM Council c WHERE c.isActive = :isActive")})
public class Council implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_form")
    @Temporal(TemporalType.DATE)
    private Date dateForm;
    @Column(name = "date_end")
    @Temporal(TemporalType.DATE)
    private Date dateEnd;
    @Column(name = "is_active")
    private Short isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "council")
    private Set<TeacherInCouncil> teacherInCouncilSet;
    @OneToMany(mappedBy = "councilId")
    private Set<Thesis> thesisSet;

    public Council() {
    }

    public Council(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateForm() {
        return dateForm;
    }

    public void setDateForm(Date dateForm) {
        this.dateForm = dateForm;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public Set<TeacherInCouncil> getTeacherInCouncilSet() {
        return teacherInCouncilSet;
    }

    public void setTeacherInCouncilSet(Set<TeacherInCouncil> teacherInCouncilSet) {
        this.teacherInCouncilSet = teacherInCouncilSet;
    }

    @XmlTransient
    public Set<Thesis> getThesisSet() {
        return thesisSet;
    }

    public void setThesisSet(Set<Thesis> thesisSet) {
        this.thesisSet = thesisSet;
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
        if (!(object instanceof Council)) {
            return false;
        }
        Council other = (Council) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.Council[ id=" + id + " ]";
    }
    
}
