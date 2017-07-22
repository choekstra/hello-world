/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.controller;

import com.mycompany.springlayers1.model.HelloWorldParamsModel;
import com.mycompany.springlayers1.service.HelloWorldServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 *
 * @author SpringLayers
 */
@Controller
public class HelloWorldController {

    @Autowired
    HelloWorldServiceImpl helloWorldServiceImpl;

    @GetMapping(value = "/")
    public ModelAndView entryPage() {
        ConfigurableListableBeanFactory beanFactory = null;
        
      //  boolean containsAutoConfigDataSource = DataSourceAutoConfiguration.containsAutoConfiguredDataSource(beanFactory);

      //  System.out.println("containsAutoConfigDataSource: " + containsAutoConfigDataSource);
        
        ModelAndView mav = new ModelAndView("/helloworld");
        mav.addObject("message", "Hello Planet!");

        int id = 0;
        String firstname = "";
        String lastname = "";
        String school = "";
        String house = "";
        List friendid = new ArrayList();
        friendid.add(1);
        friendid.add(2);
        String guardianfirstname = "";
        String guardianlastname = "";
        String phone = "";
        String phoneType = "";
        mav.addObject("HelloWorldParamsModel", new HelloWorldParamsModel(id, firstname, lastname, school, house, friendid, guardianfirstname, guardianlastname, phone, phoneType));
        return mav;
    }

    @GetMapping(value = "/query/{id}/{lastname}", produces = {"text/html", "application/JSON"}) //, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String queryGet(@PathVariable int id, @PathVariable String lastName, Model model) {  //, String stateAbb, String state) {
        String space = "";
        id = 101;
        lastName = "Potter";
        return helloWorldServiceImpl.fetchModelAsJson(space, id, lastName);
    }
    
    @PostMapping(value = "/query/{id}/{lastname}", produces = {"text/html", "application/JSON"}) //, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String queryPost(@PathVariable int id, @PathVariable String lastName, Model model) {  //, String stateAbb, String state) {
        String space = "";
        //id = 101;
        //lastName = "Potter";
        System.out.println("in queryPost");
        System.out.println("in queryPost. id: " + id);
        System.out.println("in queryPost. lastname: " + lastName);
        return helloWorldServiceImpl.fetchModelAsJson(space, id, lastName);
    }

    @PostMapping(value = "/xquery") // , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String xqueryPost(@PathVariable int year, String stateAbb, String state) {
        return "aamodel";
    }
}
