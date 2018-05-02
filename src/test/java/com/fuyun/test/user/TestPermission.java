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
import com.fuyun.securty.service.IPermissionService;
import com.fuyun.securty.service.IRoleService;
import com.fuyun.securty.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"}) 
public class TestPermission {
	
	private Logger log=Logger.getLogger(TestPermission.class);
	
	@Autowired
	IRoleService roleService;
	
	@Autowired
	IPermissionService permissionServer;
	
	@Test
	public void testlogin(){
		List<String> codeSet = roleService.getRoleByUsername("asd");
		for (String string : codeSet) {
			System.out.println(string);
			
		}
		System.out.println("ASDasdasd");
		List<String> set = permissionServer.getFunctionCodeSet(codeSet);
		for (String string : set) {
			System.out.println(string);
		}
		
	}
}
