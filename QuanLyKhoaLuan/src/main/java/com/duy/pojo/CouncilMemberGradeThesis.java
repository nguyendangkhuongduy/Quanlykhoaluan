/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "council_member_grade_thesis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CouncilMemberGradeThesis.findAll", query = "SELECT c FROM CouncilMemberGradeThesis c"),
    @NamedQuery(name = "CouncilMemberGradeThesis.findByThesisId", query = "SELECT c FROM CouncilMemberGradeThesis c WHERE c.councilMemberGradeThesisPK.thesisId = :thesisId"),
    @NamedQuery(name = "CouncilMemberGradeThesis.findByCouncilId", query = "SELECT c FROM CouncilMemberGradeThesis c WHERE c.councilMemberGradeThesisPK.councilId = :councilId"),
    @NamedQuery(name = "CouncilMemberGradeThesis.findByTeacherId", query = "SELECT c FROM CouncilMemberGradeThesis c WHERE c.councilMemberGradeThesisPK.teacherId = :teacherId"),
    @NamedQuery(name = "CouncilMemberGradeThesis.findByStandardId", query = "SELECT c FROM CouncilMemberGradeThesis c WHERE c.councilMemberGradeThesisPK.standardId = :standardId"),
    @NamedQuery(name = "CouncilMemberGradeThesis.findByGrade", query = "SELECT c FROM CouncilMemberGradeThesis c WHERE c.grade = :grade")})
public class CouncilMemberGradeThesis implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CouncilMemberGradeThesisPK councilMemberGradeThesisPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "grade")
    private double grade;
    @JoinColumn(name = "teacher_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Teacher teacher;
    @JoinColumn(name = "thesis_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Thesis thesis;
    @JoinColumn(name = "standard_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ThesisStandard thesisStandard;

    public CouncilMemberGradeThesis() {
    }

    public CouncilMemberGradeThesis(CouncilMemberGradeThesisPK councilMemberGradeThesisPK) {
        this.councilMemberGradeThesisPK = councilMemberGradeThesisPK;
    }

    public CouncilMemberGradeThesis(CouncilMemberGradeThesisPK councilMemberGradeThesisPK, double grade) {
        this.councilMemberGradeThesisPK = councilMemberGradeThesisPK;
        this.grade = grade;
    }

    public CouncilMemberGradeThesis(int thesisId, int councilId, int teacherId, int standardId) {
        this.councilMemberGradeThesisPK = new CouncilMemberGradeThesisPK(thesisId, councilId, teacherId, standardId);
    }

    public CouncilMemberGradeThesisPK getCouncilMemberGradeThesisPK() {
        return councilMemberGradeThesisPK;
    }

    public void setCouncilMemberGradeThesisPK(CouncilMemberGradeThesisPK councilMemberGradeThesisPK) {
        this.councilMemberGradeThesisPK = councilMemberGradeThesisPK;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Thesis getThesis() {
        return thesis;
    }

    public void setThesis(Thesis thesis) {
        this.thesis = thesis;
    }

    public ThesisStandard getThesisStandard() {
        return thesisStandard;
    }

    public void setThesisStandard(ThesisStandard thesisStandard) {
        this.thesisStandard = thesisStandard;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (councilMemberGradeThesisPK != null ? councilMemberGradeThesisPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CouncilMemberGradeThesis)) {
            return false;
        }
        CouncilMemberGradeThesis other = (CouncilMemberGradeThesis) object;
        if ((this.councilMemberGradeThesisPK == null && other.councilMemberGradeThesisPK != null) || (this.councilMemberGradeThesisPK != null && !this.councilMemberGradeThesisPK.equals(other.councilMemberGradeThesisPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.CouncilMemberGradeThesis[ councilMemberGradeThesisPK=" + councilMemberGradeThesisPK + " ]";
    }
    
}
