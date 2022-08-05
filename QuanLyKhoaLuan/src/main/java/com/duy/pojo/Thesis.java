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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "thesis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thesis.findAll", query = "SELECT t FROM Thesis t"),
    @NamedQuery(name = "Thesis.findById", query = "SELECT t FROM Thesis t WHERE t.id = :id"),
    @NamedQuery(name = "Thesis.findByName", query = "SELECT t FROM Thesis t WHERE t.name = :name"),
    @NamedQuery(name = "Thesis.findByGrade", query = "SELECT t FROM Thesis t WHERE t.grade = :grade"),
    @NamedQuery(name = "Thesis.findByStartDate", query = "SELECT t FROM Thesis t WHERE t.startDate = :startDate"),
    @NamedQuery(name = "Thesis.findByEndDate", query = "SELECT t FROM Thesis t WHERE t.endDate = :endDate")})
public class Thesis implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "grade")
    private Double grade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @ManyToMany(mappedBy = "thesisSet")
    private Set<Teacher> teacherSet;
    @OneToMany(mappedBy = "graduatethesisId")
    private Set<Student> studentSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "thesis")
    private Set<CouncilMemberGradeThesis> councilMemberGradeThesisSet;
    @JoinColumn(name = "council_id", referencedColumnName = "id")
    @ManyToOne
    private Council councilId;
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    @ManyToOne
    private Department departmentId;
    @JoinColumn(name = "school_year_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private SchoolYear schoolYearId;

    public Thesis() {
    }

    public Thesis(Integer id) {
        this.id = id;
    }

    public Thesis(Integer id, String name, Date startDate, Date endDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @XmlTransient
    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }

    @XmlTransient
    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @XmlTransient
    public Set<CouncilMemberGradeThesis> getCouncilMemberGradeThesisSet() {
        return councilMemberGradeThesisSet;
    }

    public void setCouncilMemberGradeThesisSet(Set<CouncilMemberGradeThesis> councilMemberGradeThesisSet) {
        this.councilMemberGradeThesisSet = councilMemberGradeThesisSet;
    }

    public Council getCouncilId() {
        return councilId;
    }

    public void setCouncilId(Council councilId) {
        this.councilId = councilId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public SchoolYear getSchoolYearId() {
        return schoolYearId;
    }

    public void setSchoolYearId(SchoolYear schoolYearId) {
        this.schoolYearId = schoolYearId;
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
        if (!(object instanceof Thesis)) {
            return false;
        }
        Thesis other = (Thesis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.Thesis[ id=" + id + " ]";
    }
    
}
