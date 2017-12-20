/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hinet.storage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;

/**
 *
 * @author duynn
 * @create_date 20/12/2017
 */
@Controller
public class RegencyController extends SelectorComposer<Component> {
    
    @RequestMapping(value = "/regencyManager.html", method = RequestMethod.GET)
    public String regencyManager() {
        return "regency/regency-manager.zul";
    }
}
