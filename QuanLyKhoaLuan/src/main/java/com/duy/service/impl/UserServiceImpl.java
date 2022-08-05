/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.service.impl;

import com.duy.pojo.Account;
import com.duy.repository.UserRepository;
import com.duy.service.UserService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */

@Service(" userDetailsService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;  

    @Override
    public Account getUserbyUsername(String username) {
        return this.userRepository.getUserbyUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String usernanme) throws UsernameNotFoundException {
        Account a = this.getUserbyUsername(usernanme);
        
        if(a == null)
            throw new UsernameNotFoundException("Ivalid username");
        
        Set<GrantedAuthority> auth = new HashSet<>();
        
        auth.add(new SimpleGrantedAuthority(a.getUserRoleId().toString()));
        
        return new User(a.getUsername(), a.getPassword(), auth);
                
    }
    
}   
