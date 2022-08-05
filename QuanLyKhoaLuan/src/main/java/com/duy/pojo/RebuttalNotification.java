/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "rebuttal_notification")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RebuttalNotification.findAll", query = "SELECT r FROM RebuttalNotification r"),
    @NamedQuery(name = "RebuttalNotification.findById", query = "SELECT r FROM RebuttalNotification r WHERE r.id = :id"),
    @NamedQuery(name = "RebuttalNotification.findBySubject", query = "SELECT r FROM RebuttalNotification r WHERE r.subject = :subject")})
public class RebuttalNotification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "subject")
    private String subject;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "content")
    private String content;
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Teacher teacherId;

    public RebuttalNotification() {
    }

    public RebuttalNotification(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Teacher getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Teacher teacherId) {
        this.teacherId = teacherId;
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
        if (!(object instanceof RebuttalNotification)) {
            return false;
        }
        RebuttalNotification other = (RebuttalNotification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.duy.pojo.RebuttalNotification[ id=" + id + " ]";
    }
    
}
