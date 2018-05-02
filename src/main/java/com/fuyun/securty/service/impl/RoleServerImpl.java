package com.fuyun.securty.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuyun.mapper.UserRoleMapper;
import com.fuyun.securty.service.IRoleService;

@Service
public class RoleServerImpl implements IRoleService {

	@Autowired
	UserRoleMapper user_role;
	
	@Override
	public List<String> getRoleByUsername(String name) {
		// TODO Auto-generated method stub
		List<String> list = user_role.selectByUsername(name);
		return list;
	}

}
