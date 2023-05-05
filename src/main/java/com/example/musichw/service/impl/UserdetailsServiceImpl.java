package com.example.musichw.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import java.util.List;
import java.util.PriorityQueue;
import java.util.List;
import java.util.Set;
import java.util.Map;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.example.musichw.pojo.Userdetails;

import java.io.Serializable;
import java.util.*;

import com.example.musichw.mapper.UserdetailsMapper;
import com.example.musichw.service.UserdetailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

@Service
public class UserdetailsServiceImpl extends ServiceImpl<UserdetailsMapper, Userdetails> implements UserdetailsService {
    @Autowired
    UserdetailsMapper userdetailsMapper;

    public UserdetailsServiceImpl() {
        super();
    }

    @Override
    public UserdetailsMapper getBaseMapper() {
        return super.getBaseMapper();
    }

    @Override
    public Class<Userdetails> getEntityClass() {
        return super.getEntityClass();
    }

    @Override
    protected boolean retBool(Integer result) {
        return super.retBool(result);
    }

    @Override
    protected Class<Userdetails> currentMapperClass() {
        return super.currentMapperClass();
    }

    @Override
    protected Class<Userdetails> currentModelClass() {
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
    public boolean saveBatch(Collection<Userdetails> entityList, int batchSize) {
        return super.saveBatch(entityList, batchSize);
    }

    @Override
    protected String getSqlStatement(SqlMethod sqlMethod) {
        return super.getSqlStatement(sqlMethod);
    }

    @Override
    public boolean saveOrUpdate(Userdetails entity) {
        return super.saveOrUpdate(entity);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Userdetails> entityList, int batchSize) {
        return super.saveOrUpdateBatch(entityList, batchSize);
    }

    @Override
    public boolean updateBatchById(Collection<Userdetails> entityList, int batchSize) {
        return super.updateBatchById(entityList, batchSize);
    }

    @Override
    public Userdetails getOne(Wrapper<Userdetails> queryWrapper, boolean throwEx) {
        return super.getOne(queryWrapper, throwEx);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Userdetails> queryWrapper) {
        return super.getMap(queryWrapper);
    }

    @Override
    public <V> V getObj(Wrapper<Userdetails> queryWrapper, Function<? super Object, V> mapper) {
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
    public boolean save(Userdetails entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveBatch(Collection<Userdetails> entityList) {
        return super.saveBatch(entityList);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Userdetails> entityList) {
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
    public boolean remove(Wrapper<Userdetails> queryWrapper) {
        return super.remove(queryWrapper);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    @Override
    public boolean updateById(Userdetails entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean update(Wrapper<Userdetails> updateWrapper) {
        return super.update(updateWrapper);
    }

    @Override
    public boolean update(Userdetails entity, Wrapper<Userdetails> updateWrapper) {
        return super.update(entity, updateWrapper);
    }

    @Override
    public boolean updateBatchById(Collection<Userdetails> entityList) {
        return super.updateBatchById(entityList);
    }

    @Override
    public Userdetails getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public List<Userdetails> listByIds(Collection<? extends Serializable> idList) {
        return super.listByIds(idList);
    }

    @Override
    public List<Userdetails> listByMap(Map<String, Object> columnMap) {
        return super.listByMap(columnMap);
    }

    @Override
    public Userdetails getOne(Wrapper<Userdetails> queryWrapper) {
        return super.getOne(queryWrapper);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public int count(Wrapper<Userdetails> queryWrapper) {
        return super.count(queryWrapper);
    }

    @Override
    public List<Userdetails> list(Wrapper<Userdetails> queryWrapper) {
        return super.list(queryWrapper);
    }

    @Override
    public List<Userdetails> list() {
        return super.list();
    }

    @Override
    public <E extends IPage<Userdetails>> E page(E page, Wrapper<Userdetails> queryWrapper) {
        return super.page(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Userdetails>> E page(E page) {
        return super.page(page);
    }

    @Override
    public List<Map<String, Object>> listMaps(Wrapper<Userdetails> queryWrapper) {
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
    public List<Object> listObjs(Wrapper<Userdetails> queryWrapper) {
        return super.listObjs(queryWrapper);
    }

    @Override
    public <V> List<V> listObjs(Wrapper<Userdetails> queryWrapper, Function<? super Object, V> mapper) {
        return super.listObjs(queryWrapper, mapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<Userdetails> queryWrapper) {
        return super.pageMaps(page, queryWrapper);
    }

    @Override
    public <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return super.pageMaps(page);
    }

    @Override
    public QueryChainWrapper<Userdetails> query() {
        return super.query();
    }

    @Override
    public LambdaQueryChainWrapper<Userdetails> lambdaQuery() {
        return super.lambdaQuery();
    }

    @Override
    public KtQueryChainWrapper<Userdetails> ktQuery() {
        return super.ktQuery();
    }

    @Override
    public KtUpdateChainWrapper<Userdetails> ktUpdate() {
        return super.ktUpdate();
    }

    @Override
    public UpdateChainWrapper<Userdetails> update() {
        return super.update();
    }

    @Override
    public LambdaUpdateChainWrapper<Userdetails> lambdaUpdate() {
        return super.lambdaUpdate();
    }

    @Override
    public boolean saveOrUpdate(Userdetails entity, Wrapper<Userdetails> updateWrapper) {
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
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String getRight(String username) {
        QueryWrapper<Userdetails> mmu = new QueryWrapper<>();
        mmu.eq("username",username);
        Userdetails user = userdetailsMapper.selectOne(mmu);
        if(user != null)
        return user.getPassword();
        else
            return "error";
    }

    @Override
    public String getID(String username) {
        QueryWrapper<Userdetails> mmu = new QueryWrapper<>();
        mmu.eq("username",username);
        Userdetails user = userdetailsMapper.selectOne(mmu);
        return user.getId().toString();
    }

    @Override
    public String toString() {
        return "UserdetailsServiceImpl{" +
                "userdetailsMapper=" + userdetailsMapper +
                ", log=" + log +
                ", baseMapper=" + baseMapper +
                ", entityClass=" + entityClass +
                ", mapperClass=" + mapperClass +
                '}';
    }

    @Override
    public void insertUser(Userdetails user) {
        userdetailsMapper.insert(user);
    }

    @Override
    public PageInfo<Userdetails> getAllUserdetails(Integer pagenum, Integer pagesize) {
        PageHelper.startPage(pagenum, pagesize);
        List<Userdetails> uuuu = userdetailsMapper.selectList(null);
        PageInfo<Userdetails> pageInfo = new PageInfo<>(uuuu);
        return pageInfo;
    }
}
