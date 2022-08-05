/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.repository;

import com.duy.pojo.Account;

/**
 *
 * @author Admin
 */
public interface UserRepository {
    Account getUserbyUsername(String username);
}
