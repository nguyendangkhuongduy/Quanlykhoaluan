package com.duy.pojo;

import com.duy.pojo.Council;
import com.duy.pojo.CouncilPosition;
import com.duy.pojo.Teacher;
import com.duy.pojo.TeacherInCouncilPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(TeacherInCouncil.class)
public class TeacherInCouncil_ { 

    public static volatile SingularAttribute<TeacherInCouncil, Teacher> teacher;
    public static volatile SingularAttribute<TeacherInCouncil, CouncilPosition> positionId;
    public static volatile SingularAttribute<TeacherInCouncil, Council> council;
    public static volatile SingularAttribute<TeacherInCouncil, TeacherInCouncilPK> teacherInCouncilPK;

}