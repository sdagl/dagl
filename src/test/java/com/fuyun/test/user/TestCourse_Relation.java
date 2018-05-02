package com.fuyun.test.user;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
import com.fuyun.securty.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"}) 
public class TestCourse_Relation {
	
	private Logger log=Logger.getLogger(TestCourse_Relation.class);
	
	@Autowired
	IUserService userService;
	
	@Test
	public void testlogin(){
		System.out.println(UUID.randomUUID().toString());;
		UserInfo temp=new UserInfo();
		temp.setUsername("admin");
		temp.setPassword("admin");
		UserInfo user=userService.selectByUser(temp);
		System.out.println(user+"ASD");
	}
	
	@Test
	public void testlogasdin(){
		System.out.println(UUID.randomUUID().toString());;
	}
}
