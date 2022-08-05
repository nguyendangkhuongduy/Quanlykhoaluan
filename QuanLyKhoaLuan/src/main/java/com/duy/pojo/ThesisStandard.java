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
@Table(name = "thesis_standard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ThesisStandard.findAll", query = "SELECT t FROM ThesisStandard t"),
    @NamedQuery(name = "ThesisStandard.findById", query = "SELECT t FROM ThesisStandard t WHERE t.id = :id"),
    @NamedQuery(name = "ThesisStandard.findByName", query = "SELECT t FROM ThesisStandard t WHERE t.name = :name"),
    @NamedQuery(name = "ThesisStandard.findByProportion", query = "SELECT t FROM ThesisStandard t WHERE t.proportion = :proportion")})
public class ThesisStandard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "proportion")
    private double proportion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "thesisStandard")
    private Set<CouncilMemberGradeThesis> councilMemberGradeThesisSet;

    public ThesisStandard() {
    }

    public ThesisStandard(Integer id) {
        this.id = id;
    }

    public ThesisStandard(Integer id, String name, double proportion) {
        this.id = id;
        this.name = name;
        this.proportion = proportion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProportion() {
        return proportion;
    }

    public void setProportion(double proportion) {
        this.proportion = proportion;
    }

    @XmlTransient
    public Set<CouncilMemberGradeThesis> getCouncilMemberGradeThesisSet() {
        return councilMemberGradeThesisSet;
    }

    public void setCouncilMemberGradeThesisSet(Set<CouncilMemberGradeThesis> councilMemberGradeThesisSet) {
        this.councilMemberGradeThesisSet = councilMemberGradeThesisSet;
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
        if (!(object instanceof ThesisStandard)) {
            return false;
        }
        ThesisStandard other = (ThesisStandard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.ThesisStandard[ id=" + id + " ]";
    }
    
}
