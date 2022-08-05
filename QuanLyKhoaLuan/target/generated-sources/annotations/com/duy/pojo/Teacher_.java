package com.duy.pojo;

import com.duy.pojo.Account;
import com.duy.pojo.CouncilMemberGradeThesis;
import com.duy.pojo.Department;
import com.duy.pojo.RebuttalNotification;
import com.duy.pojo.TeacherInCouncil;
import com.duy.pojo.Thesis;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(Teacher.class)
public class Teacher_ { 

    public static volatile SingularAttribute<Teacher, Account> accountId;
    public static volatile SetAttribute<Teacher, CouncilMemberGradeThesis> councilMemberGradeThesisSet;
    public static volatile SingularAttribute<Teacher, String> major;
    public static volatile SingularAttribute<Teacher, String> phone;
    public static volatile SingularAttribute<Teacher, Department> departmentId;
    public static volatile SetAttribute<Teacher, Thesis> thesisSet;
    public static volatile SingularAttribute<Teacher, Integer> id;
    public static volatile SingularAttribute<Teacher, String> fullname;
    public static volatile SetAttribute<Teacher, RebuttalNotification> rebuttalNotificationSet;
    public static volatile SingularAttribute<Teacher, String> email;
    public static volatile SetAttribute<Teacher, TeacherInCouncil> teacherInCouncilSet;

}