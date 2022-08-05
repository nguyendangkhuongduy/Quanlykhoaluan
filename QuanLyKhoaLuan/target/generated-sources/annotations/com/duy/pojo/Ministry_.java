package com.duy.pojo;

import com.duy.pojo.Account;
import com.duy.pojo.Department;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(Ministry.class)
public class Ministry_ { 

    public static volatile SingularAttribute<Ministry, Account> accountId;
    public static volatile SingularAttribute<Ministry, String> phone;
    public static volatile SingularAttribute<Ministry, Department> departmentId;
    public static volatile SingularAttribute<Ministry, Integer> id;
    public static volatile SingularAttribute<Ministry, String> fullname;
    public static volatile SingularAttribute<Ministry, String> email;

}