package com.example.musichw.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.musichw.pojo.Music;

import java.io.Serializable;
import java.sql.Blob;
import org.apache.ibatis.annotations.Mapper;
import java.applet.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Mapper
public interface MusicMapper extends BaseMapper<Music> {

}
