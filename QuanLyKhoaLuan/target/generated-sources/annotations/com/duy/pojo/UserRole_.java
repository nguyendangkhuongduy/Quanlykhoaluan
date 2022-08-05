package com.duy.pojo;

import com.duy.pojo.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-05T14:53:23")
@StaticMetamodel(UserRole.class)
public class UserRole_ { 

    public static volatile SingularAttribute<UserRole, String> name;
    public static volatile SetAttribute<UserRole, Account> accountSet;
    public static volatile SingularAttribute<UserRole, Integer> id;

}