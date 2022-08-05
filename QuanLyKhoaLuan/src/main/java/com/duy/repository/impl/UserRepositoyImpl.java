/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.repository.impl;

import com.duy.pojo.Account;
import com.duy.repository.UserRepository;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */

@Repository
@Transactional
public class UserRepositoyImpl implements UserRepository{
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @Override
    public Account getUserbyUsername(String username) {
       Session session = this.sessionFactory.getObject().getCurrentSession();
       Query q = session.createQuery("FROM Account WHERE username=:username");
       
       q.setParameter("username", username);
       
       return (Account) q.getSingleResult();
    }
    
}
