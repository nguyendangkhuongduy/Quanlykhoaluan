package com.duy.pojo;

import com.duy.pojo.Department;
import com.duy.pojo.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(Major.class)
public class Major_ { 

    public static volatile SetAttribute<Major, Student> studentSet;
    public static volatile SingularAttribute<Major, Department> departmentId;
    public static volatile SingularAttribute<Major, String> name;
    public static volatile SingularAttribute<Major, Integer> id;

}