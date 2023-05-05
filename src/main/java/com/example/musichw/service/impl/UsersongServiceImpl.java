package com.example.musichw.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.example.musichw.pojo.Usersong;

import java.io.Serializable;
import java.util.Set;
import java.util.Map;
import com.example.musichw.mapper.UsersongMapper;
import java.sql.Blob;
import com.example.musichw.service.UsersongService;
import java.util.ArrayList;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Set;
import com.github.pagehelper.PageHelper;
import java.util.PriorityQueue;
import com.github.pagehelper.PageInfo;
import java.util.Collection;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import org.springframework.stereotype.Service;
import java.util.Set;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;


@Service
public class UsersongServiceImpl extends ServiceImpl<UsersongMapper, Usersong> implements UsersongService {
    @Autowired
    UsersongMapper usersongMapper;
    @Override
    public void insertSong(Usersong usersong) {
        usersongMapper.insert(usersong);
    }

    @Override
    public PageInfo<Usersong> getAllUserSongs(Integer pagenum, Integer pagesize, Integer userID) {
        PageHelper.startPage(pagenum, pagesize);
        List<Integer>list=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        QueryWrapper<Usersong> mmu = new QueryWrapper<>();
        mmu.eq("usercode", userID);
        List<Usersong> all = usersongMapper.selectList(mmu);
        PageInfo<Usersong> pageInfo = new PageInfo<>(all);
        return pageInfo;
    }

    public UsersongMapper getUsersongMapper() {
        return usersongMapper;
    }

    public UsersongServiceImpl() {
        super();
    }

    @Override
    public UsersongMapper getBaseMapper() {
        return super.getBaseMapper();
    }

    @Override
    public Class<Usersong> getEntityClass() {
        return super.getEntityClass();
    }

    @Override
    protected boolean retBool(Integer result) {
        return super.retBool(result);
    }

    @Override
    protected Class<Usersong> currentMapperClass() {
        return super.currentMapperClass();
    }

    @Override
    protected Class<Usersong> currentModelClass() {
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
    public boolean saveBatch(Collection<Usersong> entityList, int batchSize) {
        return super.saveBatch(entityList, batchSize);
    }

    @Override
    protected String getSqlStatement(SqlMethod sqlMethod) {
        return super.getSqlStatement(sqlMethod);
    }

    @Override
    public boolean saveOrUpdate(Usersong entity) {
        return super.saveOrUpdate(entity);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Usersong> entityList, int batchSize) {
        return super.saveOrUpdateBatch(entityList, batchSize);
    }

    @Override
    public boolean updateBatchById(Collection<Usersong> entityList, int batchSize) {
        return super.updateBatchById(entityList, batchSize);
    }

    @Override
    public Usersong getOne(Wrapper<Usersong> queryWrapper, boolean throwEx) {
        return super.getOne(queryWrapper, throwEx);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Usersong> queryWrapper) {
        return super.getMap(queryWrapper);
    }

    @Override
    public <V> V getObj(Wrapper<Usersong> queryWrapper, Function<? super Object, V> mapper) {
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

    @Override
    public boolean save(Usersong entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<Usersong> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Usersong> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public boolean removeByMap(Map<String, Object> columnMap) {
        return super.removeByMap(columnMap);
    }

    @Override
    public boolean remove(Wrapper<Usersong> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    @Override
    public boolean updateById(Usersong entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<Usersong> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(Usersong entity, Wrapper<Usersong> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<Usersong> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public Usersong getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<Usersong> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<Usersong> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public Usersong getOne(Wrapper<Usersong> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public int count(Wrapper<Usersong> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<Usersong> list(Wrapper<Usersong> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<Usersong> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<Usersong>> E page(E page, Wrapper<Usersong> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Usersong>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Usersong> queryWrapper) {
        return super.listMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return super.listMaps();
    }

    @Override
    public List<Object> listObjs() {
        return super.listObjs();
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return super.listObjs(mapper);
    }

    @Override
    public List<Object> listObjs(Wrapper<Usersong> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Usersong> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<Usersong> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<Usersong> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<Usersong> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public KtQueryChainWrapper<Usersong> ktQuery() {
        List<Integer>list=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        return super.ktQuery();
    }

    @Override
    public KtUpdateChainWrapper<Usersong> ktUpdate() {
        return super.ktUpdate();
    }

    @Override
    public UpdateChainWrapper<Usersong> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<Usersong> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(Usersong entity, Wrapper<Usersong> updateWrapper) {
        return super.saveOrUpdate(entity, updateWrapper);
    }

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

    public void setUsersongMapper(UsersongMapper usersongMapper) {
        List<Integer>list=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        this.usersongMapper = usersongMapper;
    }

    @Override
    public void deleteSong(Integer bodyID, Integer id) {
        List<Integer>list=new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        QueryWrapper<Usersong> mmu = new QueryWrapper();
        mmu.eq("usercode",bodyID);
        mmu.eq("songcode",id);
        usersongMapper.delete(mmu);
    }
}
