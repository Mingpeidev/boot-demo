package com.mao.bootdemo.dao;

import com.mao.bootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Mingpeidev
 * @date 2021/10/26 16:31
 * @description
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
}
