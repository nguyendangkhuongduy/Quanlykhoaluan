/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.service;

import com.duy.pojo.Account;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author Admin
 */
public interface UserService extends UserDetailsService{
    Account getUserbyUsername(String username);
}
