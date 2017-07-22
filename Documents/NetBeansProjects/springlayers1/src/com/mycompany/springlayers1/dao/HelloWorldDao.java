/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.dao;

import com.mycompany.springlayers1.model.HelloWorldParamsModel;
import java.util.List;

/**
 *
 * @author SpringLayers
 */
public interface HelloWorldDao {

    public List fetchList(String helloWorldSelectSQL, int intParm1, String stateParm2, String _string3);

    public HelloWorldParamsModel fetchModelAsJson(String _helloWorldSelectSQL, int _int1, String _string1);

}
