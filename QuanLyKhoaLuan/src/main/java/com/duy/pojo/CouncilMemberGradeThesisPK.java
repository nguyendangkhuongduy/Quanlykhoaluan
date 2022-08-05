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
public class CouncilMemberGradeThesisPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "thesis_id")
    private int thesisId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "council_id")
    private int councilId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "teacher_id")
    private int teacherId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "standard_id")
    private int standardId;

    public CouncilMemberGradeThesisPK() {
    }

    public CouncilMemberGradeThesisPK(int thesisId, int councilId, int teacherId, int standardId) {
        this.thesisId = thesisId;
        this.councilId = councilId;
        this.teacherId = teacherId;
        this.standardId = standardId;
    }

    public int getThesisId() {
        return thesisId;
    }

    public void setThesisId(int thesisId) {
        this.thesisId = thesisId;
    }

    public int getCouncilId() {
        return councilId;
    }

    public void setCouncilId(int councilId) {
        this.councilId = councilId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStandardId() {
        return standardId;
    }

    public void setStandardId(int standardId) {
        this.standardId = standardId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) thesisId;
        hash += (int) councilId;
        hash += (int) teacherId;
        hash += (int) standardId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CouncilMemberGradeThesisPK)) {
            return false;
        }
        CouncilMemberGradeThesisPK other = (CouncilMemberGradeThesisPK) object;
        if (this.thesisId != other.thesisId) {
            return false;
        }
        if (this.councilId != other.councilId) {
            return false;
        }
        if (this.teacherId != other.teacherId) {
            return false;
        }
        if (this.standardId != other.standardId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.CouncilMemberGradeThesisPK[ thesisId=" + thesisId + ", councilId=" + councilId + ", teacherId=" + teacherId + ", standardId=" + standardId + " ]";
    }
    
}
