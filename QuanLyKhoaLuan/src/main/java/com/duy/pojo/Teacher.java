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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "teacher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Teacher.findAll", query = "SELECT t FROM Teacher t"),
    @NamedQuery(name = "Teacher.findById", query = "SELECT t FROM Teacher t WHERE t.id = :id"),
    @NamedQuery(name = "Teacher.findByFullname", query = "SELECT t FROM Teacher t WHERE t.fullname = :fullname"),
    @NamedQuery(name = "Teacher.findByEmail", query = "SELECT t FROM Teacher t WHERE t.email = :email"),
    @NamedQuery(name = "Teacher.findByPhone", query = "SELECT t FROM Teacher t WHERE t.phone = :phone"),
    @NamedQuery(name = "Teacher.findByMajor", query = "SELECT t FROM Teacher t WHERE t.major = :major")})
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "fullname")
    private String fullname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 10)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "major")
    private String major;
    @JoinTable(name = "teacher_instruct_thesis", joinColumns = {
        @JoinColumn(name = "teacher_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "thesis_id", referencedColumnName = "id")})
    @ManyToMany
    private Set<Thesis> thesisSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacherId")
    private Set<RebuttalNotification> rebuttalNotificationSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
    private Set<CouncilMemberGradeThesis> councilMemberGradeThesisSet;
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Account accountId;
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    @ManyToOne
    private Department departmentId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
    private Set<TeacherInCouncil> teacherInCouncilSet;

    public Teacher() {
    }

    public Teacher(Integer id) {
        this.id = id;
    }

    public Teacher(Integer id, String fullname, String major) {
        this.id = id;
        this.fullname = fullname;
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @XmlTransient
    public Set<Thesis> getThesisSet() {
        return thesisSet;
    }

    public void setThesisSet(Set<Thesis> thesisSet) {
        this.thesisSet = thesisSet;
    }

    @XmlTransient
    public Set<RebuttalNotification> getRebuttalNotificationSet() {
        return rebuttalNotificationSet;
    }

    public void setRebuttalNotificationSet(Set<RebuttalNotification> rebuttalNotificationSet) {
        this.rebuttalNotificationSet = rebuttalNotificationSet;
    }

    @XmlTransient
    public Set<CouncilMemberGradeThesis> getCouncilMemberGradeThesisSet() {
        return councilMemberGradeThesisSet;
    }

    public void setCouncilMemberGradeThesisSet(Set<CouncilMemberGradeThesis> councilMemberGradeThesisSet) {
        this.councilMemberGradeThesisSet = councilMemberGradeThesisSet;
    }

    public Account getAccountId() {
        return accountId;
    }

    public void setAccountId(Account accountId) {
        this.accountId = accountId;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
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
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.Teacher[ id=" + id + " ]";
    }
    
}
