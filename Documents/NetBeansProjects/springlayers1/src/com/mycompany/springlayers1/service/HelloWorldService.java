/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.service;

import com.mycompany.springlayers1.model.HelloWorldParamsModel;
import java.util.List;

/**
 *
 * @author SpringLayers
 */
public interface HelloWorldService {

    public String helloWorldFetchList(String _string1, int _int1, String _string2, String _string3);

    public String fetchModelAsJson(String _string1, int _int1, String _string2);

}
