package com.example.musichw.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.example.musichw.pojo.Music;
import com.example.musichw.mapper.MusicMapper;
import com.example.musichw.service.MusicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;


@Service
public class MusicServiceImpl extends ServiceImpl<MusicMapper, Music> implements MusicService {
    @Autowired
    MusicMapper musicMapper;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public PageInfo<Music> gettotal(Integer num, Integer size) {
        PageHelper.startPage(num, size);
        List<Integer>list333=new ArrayList<>();
        list333.add(new Integer(1));
        list333.add(new Integer(2));
        list333.add(new Integer(3));
        list333.add(new Integer(333));
        List<Music> mmu = musicMapper.selectList(null);
        Queue queue=new LinkedList();
        queue.add(2);
        queue.add(3);
        queue.add(3);
        queue.add(5);
        PageInfo<Music> nums = new PageInfo<>(mmu);
        return nums;
    }

    public MusicMapper getMusicMapper() {
        return musicMapper;
    }

    public MusicServiceImpl() {
        super();
    }

    @Override
    public MusicMapper getBaseMapper() {
        return super.getBaseMapper();
    }

    @Override
    public Class<Music> getEntityClass() {
        return super.getEntityClass();
    }

    @Override
    protected boolean retBool(Integer result) {
        return super.retBool(result);
    }

    @Override
    protected Class<Music> currentMapperClass() {
        return super.currentMapperClass();
    }

    @Override
    protected Class<Music> currentModelClass() {
        return super.currentModelClass();
    }

    @Override
    protected SqlSession sqlSessionBatch() {
        return super.sqlSessionBatch();
    }

    @Override
    protected void closeSqlSession(SqlSession sqlSession) {
        super.closeSqlSession(sqlSession);
    }

    @Override
    protected String sqlStatement(SqlMethod sqlMethod) {
        return super.sqlStatement(sqlMethod);
    }

    @Override
    public boolean saveBatch(Collection<Music> entityList, int batchSize) {
        return super.saveBatch(entityList, batchSize);
    }

    @Override
    protected String getSqlStatement(SqlMethod sqlMethod) {
        return super.getSqlStatement(sqlMethod);
    }

    @Override
    public boolean saveOrUpdate(Music entity) {
        return super.saveOrUpdate(entity);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Music> entityList, int batchSize) {
        return super.saveOrUpdateBatch(entityList, batchSize);
    }

    @Override
    public boolean updateBatchById(Collection<Music> entityList, int batchSize) {
        return super.updateBatchById(entityList, batchSize);
    }

    @Override
    public Music getOne(Wrapper<Music> queryWrapper, boolean throwEx) {
        return super.getOne(queryWrapper, throwEx);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Music> queryWrapper) {
        return super.getMap(queryWrapper);
    }

    @Override
    public <V> V getObj(Wrapper<Music> queryWrapper, Function<? super Object, V> mapper) {
        return super.getObj(queryWrapper, mapper);
    }

    @Override
    protected boolean executeBatch(Consumer<SqlSession> consumer) {
        return super.executeBatch(consumer);
    }

    @Override
    protected <E> boolean executeBatch(Collection<E> list, int batchSize, BiConsumer<SqlSession, E> consumer) {
        return super.executeBatch(list, batchSize, consumer);
    }

    @Override
    protected <E> boolean executeBatch(Collection<E> list, BiConsumer<SqlSession, E> consumer) {
        return super.executeBatch(list, consumer);
    }

    public void setMusicMapper(MusicMapper musicMapper) {
        this.musicMapper = musicMapper;
    }

    @Override
    public PageInfo<Music> getBatches(Integer num, Integer size, List<Integer> list) {
        QueryWrapper<Music> iissss = new QueryWrapper<>();
        List<Integer>list333=new ArrayList<>();
        list333.add(new Integer(1));
        list333.add(new Integer(2));
        list333.add(new Integer(3));
        list333.add(new Integer(333));
        iissss.in("id",list);
        List<Integer>list22=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(333));
        List<Music> cdcd = musicMapper.selectList(iissss);
        PageInfo<Music> erer = new PageInfo<>(cdcd);
        List<Integer>ss22=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(333));
        return erer;
    }

    @Override
    public PageInfo<Music> getbymusicname(Integer num, Integer size, String name) {
        PageHelper.startPage(num, size);
        List<Integer>list=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(333));
        QueryWrapper<Music> rrrrrrrr = new QueryWrapper<>();
        rrrrrrrr.like("Name", name).or().like("Singer", name).or().like("Genre", name);
        List<Integer>list2=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(333));
        List<Music> dddddd = musicMapper.selectList(rrrrrrrr);
        List<Integer>list3=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(333));
        PageInfo<Music> dssds = new PageInfo<>(dddddd);
        return dssds;
    }
}
