package com.fuyun.test.user;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fuyun.bean.UserInfo;
import com.fuyun.securty.service.IRoleService;
import com.fuyun.securty.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"}) 
public class TestUser_Role {
	
	private Logger log=Logger.getLogger(TestUser_Role.class);
	
	@Autowired
	IRoleService roleService;
	
	@Test
	public void testlogin(){
		List<String> codeSet = roleService.getRoleByUsername("admin");
		
		for (String string : codeSet) {
			System.out.println(string);
		}
		
	}
}
