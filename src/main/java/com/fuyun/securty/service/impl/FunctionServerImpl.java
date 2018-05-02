package com.fuyun.securty.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuyun.mapper.PermissionMapper;
import com.fuyun.securty.service.IPermissionService;

@Service
public class FunctionServerImpl implements IPermissionService {

	@Autowired
	PermissionMapper permissionMapper;
	
	@Override
	public List<String> getFunctionCodeSet(List<String> roleCodes) {
		return permissionMapper.selectByRoleName(roleCodes);
	}

}
