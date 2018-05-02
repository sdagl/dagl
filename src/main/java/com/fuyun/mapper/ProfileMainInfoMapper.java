package com.fuyun.mapper;

import com.fuyun.bean.ProfileMainInfo;

public interface ProfileMainInfoMapper {
    int deleteByPrimaryKey(String profilemaininfcode);

    int insert(ProfileMainInfo record);

    int insertSelective(ProfileMainInfo record);

    ProfileMainInfo selectByPrimaryKey(String profilemaininfcode);

    int updateByPrimaryKeySelective(ProfileMainInfo record);

    int updateByPrimaryKey(ProfileMainInfo record);
}