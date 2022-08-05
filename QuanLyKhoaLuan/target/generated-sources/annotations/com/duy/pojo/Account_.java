package com.duy.pojo;

import com.duy.pojo.Admin;
import com.duy.pojo.Ministry;
import com.duy.pojo.Student;
import com.duy.pojo.Teacher;
import com.duy.pojo.UserRole;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SetAttribute<Account, Student> studentSet;
    public static volatile SingularAttribute<Account, String> password;
    public static volatile SetAttribute<Account, Ministry> ministrySet;
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, UserRole> userRoleId;
    public static volatile SingularAttribute<Account, String> picture;
    public static volatile SetAttribute<Account, Teacher> teacherSet;
    public static volatile SingularAttribute<Account, String> username;
    public static volatile SetAttribute<Account, Admin> adminSet;

}