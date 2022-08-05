package com.duy.pojo;

import com.duy.pojo.CouncilMemberGradeThesisPK;
import com.duy.pojo.Teacher;
import com.duy.pojo.Thesis;
import com.duy.pojo.ThesisStandard;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(CouncilMemberGradeThesis.class)
public class CouncilMemberGradeThesis_ { 

    public static volatile SingularAttribute<CouncilMemberGradeThesis, Teacher> teacher;
    public static volatile SingularAttribute<CouncilMemberGradeThesis, Double> grade;
    public static volatile SingularAttribute<CouncilMemberGradeThesis, Thesis> thesis;
    public static volatile SingularAttribute<CouncilMemberGradeThesis, ThesisStandard> thesisStandard;
    public static volatile SingularAttribute<CouncilMemberGradeThesis, CouncilMemberGradeThesisPK> councilMemberGradeThesisPK;

}