/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Admin
 */
@Embeddable
public class TeacherInCouncilPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "teacher_id")
    private int teacherId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "council_id")
    private int councilId;

    public TeacherInCouncilPK() {
    }

    public TeacherInCouncilPK(int teacherId, int councilId) {
        this.teacherId = teacherId;
        this.councilId = councilId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getCouncilId() {
        return councilId;
    }

    public void setCouncilId(int councilId) {
        this.councilId = councilId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) teacherId;
        hash += (int) councilId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeacherInCouncilPK)) {
            return false;
        }
        TeacherInCouncilPK other = (TeacherInCouncilPK) object;
        if (this.teacherId != other.teacherId) {
            return false;
        }
        if (this.councilId != other.councilId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.TeacherInCouncilPK[ teacherId=" + teacherId + ", councilId=" + councilId + " ]";
    }
    
}
