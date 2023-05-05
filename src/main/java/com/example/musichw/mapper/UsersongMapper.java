package com.example.musichw.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.musichw.pojo.Usersong;
import org.apache.ibatis.cursor.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;


@Mapper
public interface UsersongMapper extends BaseMapper<Usersong> {

}
