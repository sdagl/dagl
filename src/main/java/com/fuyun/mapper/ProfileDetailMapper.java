package com.fuyun.mapper;

import com.fuyun.bean.ProfileDetail;
import com.fuyun.bean.ProfileDetailKey;

public interface ProfileDetailMapper {
    int deleteByPrimaryKey(ProfileDetailKey key);

    int insert(ProfileDetail record);

    int insertSelective(ProfileDetail record);

    ProfileDetail selectByPrimaryKey(ProfileDetailKey key);

    int updateByPrimaryKeySelective(ProfileDetail record);

    int updateByPrimaryKey(ProfileDetail record);
}