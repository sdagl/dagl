package com.fuyun.mapper;

import com.fuyun.bean.ProfileSecClass;

public interface ProfileSecClassMapper {
    int deleteByPrimaryKey(Byte secclasscode);

    int insert(ProfileSecClass record);

    int insertSelective(ProfileSecClass record);

    ProfileSecClass selectByPrimaryKey(Byte secclasscode);

    int updateByPrimaryKeySelective(ProfileSecClass record);

    int updateByPrimaryKey(ProfileSecClass record);
}