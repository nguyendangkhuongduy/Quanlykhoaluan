package com.duy.pojo;

import com.duy.pojo.TeacherInCouncil;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(CouncilPosition.class)
public class CouncilPosition_ { 

    public static volatile SingularAttribute<CouncilPosition, String> positionName;
    public static volatile SingularAttribute<CouncilPosition, Integer> id;
    public static volatile SetAttribute<CouncilPosition, TeacherInCouncil> teacherInCouncilSet;

}