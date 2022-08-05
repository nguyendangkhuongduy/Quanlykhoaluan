package com.duy.pojo;

import com.duy.pojo.Major;
import com.duy.pojo.Ministry;
import com.duy.pojo.Student;
import com.duy.pojo.Teacher;
import com.duy.pojo.Thesis;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SetAttribute<Department, Student> studentSet;
    public static volatile SetAttribute<Department, Ministry> ministrySet;
    public static volatile SetAttribute<Department, Major> majorSet;
    public static volatile SingularAttribute<Department, String> name;
    public static volatile SetAttribute<Department, Thesis> thesisSet;
    public static volatile SingularAttribute<Department, Integer> id;
    public static volatile SetAttribute<Department, Teacher> teacherSet;

}