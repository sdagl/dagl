package com.fuyun.securty.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuyun.bean.UserInfo;
import com.fuyun.mapper.UserInfoMapper;
import com.fuyun.securty.service.IUserService;
@Service("userServer")
public class UserInfoServerImpl implements IUserService {

	@Autowired
	UserInfoMapper userMapper;
	
	
	@Override
	public UserInfo selectByUser(UserInfo user) {
		// TODO Auto-generated method stub
		return userMapper.selectByUser(user);
	}

}
