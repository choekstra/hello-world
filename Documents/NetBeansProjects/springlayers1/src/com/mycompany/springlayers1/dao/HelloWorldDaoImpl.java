package com.mycompany.springlayers1.dao;

import com.mycompany.springlayers1.model.HelloWorldParamsModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

import javax.sql.DataSource;


/**
 *
 * @author SpringLayers
 */
@Component
public class HelloWorldDaoImpl implements HelloWorldDao {

    //@Autowired
    //private DataSource dataSource;
    
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
   
   // @PostConstruct
   // private void postConstruct() {
   //     jdbcTemplate = new JdbcTemplate(dataSource);
   //     namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
   // }

    @Override
    public List fetchList(String _helloWorldSelectSQL, int _intParm1, String _stateParm2, String _string3) {
        List<String> list = new ArrayList();
        list.add("List entry #1");
        list.add("List entry #2");
        list.add("List entry #3");
        return list;
    }

    @Override
    public HelloWorldParamsModel fetchModelAsJson(String _helloWorldSelectNamedSQL, int _int1, String _string1) {

		SqlParameterSource namedParameters = new MapSqlParameterSource("myCustID", 0);
                
                List<String> list = new ArrayList();
                list.add("102");
                list.add("215");
                
                System.out.println("_helloWorldSelectNamedSQL is: " + _helloWorldSelectNamedSQL);
                System.out.println("_int1 is: " +  _int1);
                System.out.println("_string1 is: " + _string1);
                
                try {
                
        return (HelloWorldParamsModel) namedParameterJdbcTemplate.queryForObject(_helloWorldSelectNamedSQL,
                namedParameters, new RowMapper() {

            public Object mapRow(ResultSet resultSet, int rowNum)
                    throws SQLException {
                return new HelloWorldParamsModel(99, resultSet.getString("customerFirstName"), resultSet.getString("customerLastName"), "", "", list, "", "", "","");
               
            }

        });
        
                } catch (Exception e) {
                    System.out.println("Exception caught. " + e);
                }
        
                return null;
        /*
        	public void insertForum(Forum forum) {
		String query = "INSERT INTO FORUMS (FORUM_ID, FORUM_NAME, FORUM_DESC) VALUES (:forumId,:forumName,:forumDesc)";
		Map namedParameters = new HashMap();
		namedParameters.put("forumId", Integer.valueOf(forum.getForumId()));
		namedParameters.put("forumName", forum.getForumName());
		namedParameters.put("forumDesc", forum.getForumDesc());
		namedParameterJdbcTemplate.update(query, namedParameters);
	}
        */

        /*   
        int id = _int1;
    String firstname = "Harry";
        String lastname = _string1;
    String school = "Hogwarts";
    String house = "Gryfindor";
        List friendid = new ArrayList();
        friendid.add(102);
        friendid.add(206);
    String guardianfirstname = "Petunia";
    String guardianlastname = "Dursley";
    String phone = "(312) 555-1212";
    String phoneType = "Cellphone";

        HelloWorldParamsModel hwpm = new HelloWorldParamsModel(id, firstname, lastname, school, house, friendid, guardianfirstname, guardianlastname, phone, phoneType);

        return hwpm;
         */
    }
}
