package com.duy.pojo;

import com.duy.pojo.Council;
import com.duy.pojo.CouncilMemberGradeThesis;
import com.duy.pojo.Department;
import com.duy.pojo.SchoolYear;
import com.duy.pojo.Student;
import com.duy.pojo.Teacher;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(Thesis.class)
public class Thesis_ { 

    public static volatile SetAttribute<Thesis, Student> studentSet;
    public static volatile SetAttribute<Thesis, CouncilMemberGradeThesis> councilMemberGradeThesisSet;
    public static volatile SingularAttribute<Thesis, Date> endDate;
    public static volatile SingularAttribute<Thesis, Double> grade;
    public static volatile SingularAttribute<Thesis, Council> councilId;
    public static volatile SingularAttribute<Thesis, Department> departmentId;
    public static volatile SingularAttribute<Thesis, String> name;
    public static volatile SingularAttribute<Thesis, Integer> id;
    public static volatile SingularAttribute<Thesis, SchoolYear> schoolYearId;
    public static volatile SingularAttribute<Thesis, Date> startDate;
    public static volatile SetAttribute<Thesis, Teacher> teacherSet;

}