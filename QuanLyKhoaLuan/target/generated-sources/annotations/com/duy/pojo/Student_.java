package com.duy.pojo;

import com.duy.pojo.Account;
import com.duy.pojo.Department;
import com.duy.pojo.Major;
import com.duy.pojo.ResultNotification;
import com.duy.pojo.SchoolYear;
import com.duy.pojo.Thesis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Date> birthday;
    public static volatile SingularAttribute<Student, String> address;
    public static volatile SingularAttribute<Student, Major> majorId;
    public static volatile SingularAttribute<Student, String> studentCode;
    public static volatile SingularAttribute<Student, Department> departmentId;
    public static volatile SingularAttribute<Student, SchoolYear> schoolYearId;
    public static volatile SingularAttribute<Student, Account> accountId;
    public static volatile SingularAttribute<Student, String> phone;
    public static volatile SingularAttribute<Student, Integer> id;
    public static volatile SingularAttribute<Student, String> fullname;
    public static volatile SetAttribute<Student, ResultNotification> resultNotificationSet;
    public static volatile SingularAttribute<Student, String> email;
    public static volatile SingularAttribute<Student, Thesis> graduatethesisId;

}