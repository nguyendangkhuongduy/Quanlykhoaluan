package com.duy.pojo;

import com.duy.pojo.TeacherInCouncil;
import com.duy.pojo.Thesis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(Council.class)
public class Council_ { 

    public static volatile SingularAttribute<Council, Date> dateForm;
    public static volatile SetAttribute<Council, Thesis> thesisSet;
    public static volatile SingularAttribute<Council, Integer> id;
    public static volatile SingularAttribute<Council, Date> dateEnd;
    public static volatile SingularAttribute<Council, Short> isActive;
    public static volatile SetAttribute<Council, TeacherInCouncil> teacherInCouncilSet;

}