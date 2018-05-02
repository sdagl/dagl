package com.fuyun.mapper;

import com.fuyun.bean.ProfileClass;

public interface ProfileClassMapper {
    int deleteByPrimaryKey(String profileclasscode);

    int insert(ProfileClass record);

    int insertSelective(ProfileClass record);

    ProfileClass selectByPrimaryKey(String profileclasscode);

    int updateByPrimaryKeySelective(ProfileClass record);

    int updateByPrimaryKey(ProfileClass record);
}