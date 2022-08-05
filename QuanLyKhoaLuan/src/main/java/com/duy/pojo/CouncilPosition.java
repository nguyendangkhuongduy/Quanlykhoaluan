/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.pojo;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "council_position")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CouncilPosition.findAll", query = "SELECT c FROM CouncilPosition c"),
    @NamedQuery(name = "CouncilPosition.findById", query = "SELECT c FROM CouncilPosition c WHERE c.id = :id"),
    @NamedQuery(name = "CouncilPosition.findByPositionName", query = "SELECT c FROM CouncilPosition c WHERE c.positionName = :positionName")})
public class CouncilPosition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "position_name")
    private String positionName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "positionId")
    private Set<TeacherInCouncil> teacherInCouncilSet;

    public CouncilPosition() {
    }

    public CouncilPosition(Integer id) {
        this.id = id;
    }

    public CouncilPosition(Integer id, String positionName) {
        this.id = id;
        this.positionName = positionName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @XmlTransient
    public Set<TeacherInCouncil> getTeacherInCouncilSet() {
        return teacherInCouncilSet;
    }

    public void setTeacherInCouncilSet(Set<TeacherInCouncil> teacherInCouncilSet) {
        this.teacherInCouncilSet = teacherInCouncilSet;
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
        if (!(object instanceof CouncilPosition)) {
            return false;
        }
        CouncilPosition other = (CouncilPosition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.CouncilPosition[ id=" + id + " ]";
    }
    
}
