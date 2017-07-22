/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.service;

import com.google.gson.Gson;
import com.mycompany.springlayers1.dao.HelloWorldDaoImpl;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SpringLayers
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    

    @Autowired
    HelloWorldDaoImpl helloWorldDaoImpl;

    private static final Properties prop = loadPropertyClass("/query.properties");

    @Override
    public String helloWorldFetchList(String _string1, int _int1, String _string2, String _string3) {
        String helloWorldSelectNamedSQL1 = prop.getProperty("helloWorldSelectNamedSQL1");
        Gson gson = new Gson();
        return gson.toJson(helloWorldDaoImpl.fetchList(helloWorldSelectNamedSQL1, _int1, _string2, _string3));
    }

    @Override
    public String fetchModelAsJson(String _string1, int _int1, String _string2) {
        String helloWorldSelectNamedSQL = prop.getProperty("helloWorldSelectNamedSQL");
        Gson gson = new Gson();
        return gson.toJson(helloWorldDaoImpl.fetchModelAsJson(helloWorldSelectNamedSQL, _int1, _string2));
    }

    public static Properties loadPropertyClass(String _filename) {
        Properties property = new Properties();
        try {
            property.load(HelloWorldServiceImpl.class.getResourceAsStream(_filename));
        } catch (IOException e) {
        } catch (Exception e) {
        }
        return property;
    }
}
