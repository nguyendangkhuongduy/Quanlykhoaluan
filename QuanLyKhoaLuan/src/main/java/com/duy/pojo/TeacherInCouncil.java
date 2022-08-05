/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.pojo;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "teacher_in_council")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TeacherInCouncil.findAll", query = "SELECT t FROM TeacherInCouncil t"),
    @NamedQuery(name = "TeacherInCouncil.findByTeacherId", query = "SELECT t FROM TeacherInCouncil t WHERE t.teacherInCouncilPK.teacherId = :teacherId"),
    @NamedQuery(name = "TeacherInCouncil.findByCouncilId", query = "SELECT t FROM TeacherInCouncil t WHERE t.teacherInCouncilPK.councilId = :councilId")})
public class TeacherInCouncil implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TeacherInCouncilPK teacherInCouncilPK;
    @JoinColumn(name = "council_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Council council;
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CouncilPosition positionId;
    @JoinColumn(name = "teacher_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Teacher teacher;

    public TeacherInCouncil() {
    }

    public TeacherInCouncil(TeacherInCouncilPK teacherInCouncilPK) {
        this.teacherInCouncilPK = teacherInCouncilPK;
    }

    public TeacherInCouncil(int teacherId, int councilId) {
        this.teacherInCouncilPK = new TeacherInCouncilPK(teacherId, councilId);
    }

    public TeacherInCouncilPK getTeacherInCouncilPK() {
        return teacherInCouncilPK;
    }

    public void setTeacherInCouncilPK(TeacherInCouncilPK teacherInCouncilPK) {
        this.teacherInCouncilPK = teacherInCouncilPK;
    }

    public Council getCouncil() {
        return council;
    }

    public void setCouncil(Council council) {
        this.council = council;
    }

    public CouncilPosition getPositionId() {
        return positionId;
    }

    public void setPositionId(CouncilPosition positionId) {
        this.positionId = positionId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teacherInCouncilPK != null ? teacherInCouncilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeacherInCouncil)) {
            return false;
        }
        TeacherInCouncil other = (TeacherInCouncil) object;
        if ((this.teacherInCouncilPK == null && other.teacherInCouncilPK != null) || (this.teacherInCouncilPK != null && !this.teacherInCouncilPK.equals(other.teacherInCouncilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.TeacherInCouncil[ teacherInCouncilPK=" + teacherInCouncilPK + " ]";
    }
    
}
