package com.fuyun.securty.service;

import java.util.List;

public interface IPermissionService {
	List<String> getFunctionCodeSet(List<String> roleCodes);
}
