package com.duy.pojo;

import com.duy.pojo.Student;
import com.duy.pojo.Thesis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(SchoolYear.class)
public class SchoolYear_ { 

    public static volatile SetAttribute<SchoolYear, Student> studentSet;
    public static volatile SingularAttribute<SchoolYear, Date> endDate;
    public static volatile SingularAttribute<SchoolYear, String> name;
    public static volatile SetAttribute<SchoolYear, Thesis> thesisSet;
    public static volatile SingularAttribute<SchoolYear, Integer> id;
    public static volatile SingularAttribute<SchoolYear, Date> startDate;

}