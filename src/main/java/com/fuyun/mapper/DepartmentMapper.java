package com.fuyun.mapper;

import com.fuyun.bean.Department;

public interface DepartmentMapper {
    int deleteByPrimaryKey(String dptcode);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String dptcode);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}