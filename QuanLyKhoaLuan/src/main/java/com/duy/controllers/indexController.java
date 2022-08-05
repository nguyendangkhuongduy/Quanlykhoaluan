/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.duy.controllers;


import com.duy.service.CouncilService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */


@Controller
public class indexController {
    
    @Autowired
    private CouncilService councilService;

    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
//        List<String> cats =  new ArrayList<>();
//        cats.add("Ngành học");
//        cats.add("Hội đồng");
//        cats.add("Nhiệm vụ");
//        
//        model.addAttribute("cats", cats);
        
        model.addAttribute("council", this.councilService.getCouncil());
        
        
        List<String> major = new ArrayList<>();
        major.add("CNTT");
        major.add("Marketing");
        major.add("Tài chính");
        major.add("Kinh doanh quốc tế");
        major.add("Ngôn ngữ anh");
        major.add("Xã hội học");
        major.add("kế toán");
        major.add("kiểm toán");
        
        String kw = params.get("kw");
        if(kw == null)
            model.addAttribute("major", major);
        else
            model.addAttribute("major", major.stream().filter(m -> m.contains(kw)).collect(Collectors.toList()));       
        return "index";
    }
    
    
    
}
