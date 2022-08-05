package com.duy.pojo;

import com.duy.pojo.Teacher;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(RebuttalNotification.class)
public class RebuttalNotification_ { 

    public static volatile SingularAttribute<RebuttalNotification, Teacher> teacherId;
    public static volatile SingularAttribute<RebuttalNotification, String> subject;
    public static volatile SingularAttribute<RebuttalNotification, Integer> id;
    public static volatile SingularAttribute<RebuttalNotification, String> content;

}