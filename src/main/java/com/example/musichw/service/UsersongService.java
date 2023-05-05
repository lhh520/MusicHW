package com.example.musichw.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtQueryChainWrapper;
import com.baomidou.mybatisplus.extension.kotlin.KtUpdateChainWrapper;
import com.example.musichw.pojo.Usersong;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


public interface UsersongService extends IService<Usersong> {
    public void insertSong(Usersong usersong);

    @Override
    default boolean save(Usersong entity) {
        return IService.super.save(entity);
    }

    @Override
    default boolean saveBatch(Collection<Usersong> entityList) {
        return IService.super.saveBatch(entityList);
    }

    @Override
    boolean saveBatch(Collection<Usersong> entityList, int batchSize);

    @Override
    default boolean saveOrUpdateBatch(Collection<Usersong> entityList) {
        return IService.super.saveOrUpdateBatch(entityList);
    }

    @Override
    boolean saveOrUpdateBatch(Collection<Usersong> entityList, int batchSize);

    @Override
    default boolean removeById(Serializable id) {
        return IService.super.removeById(id);
    }

    @Override
    default boolean removeByMap(Map<String, Object> columnMap) {
        return IService.super.removeByMap(columnMap);
    }

    @Override
    default boolean remove(Wrapper<Usersong> queryWrapper) {
        return IService.super.remove(queryWrapper);
    }

    @Override
    default boolean removeByIds(Collection<? extends Serializable> idList) {
        return IService.super.removeByIds(idList);
    }

    @Override
    default boolean updateById(Usersong entity) {
        return IService.super.updateById(entity);
    }

    @Override
    default boolean update(Wrapper<Usersong> updateWrapper) {
        return IService.super.update(updateWrapper);
    }

    @Override
    default boolean update(Usersong entity, Wrapper<Usersong> updateWrapper) {
        return IService.super.update(entity, updateWrapper);
    }

    @Override
    default boolean updateBatchById(Collection<Usersong> entityList) {
        return IService.super.updateBatchById(entityList);
    }

    @Override
    boolean updateBatchById(Collection<Usersong> entityList, int batchSize);

    @Override
    boolean saveOrUpdate(Usersong entity);

    @Override
    default Usersong getById(Serializable id) {
        return IService.super.getById(id);
    }

    @Override
    default List<Usersong> listByIds(Collection<? extends Serializable> idList) {
        return IService.super.listByIds(idList);
    }

    @Override
    default List<Usersong> listByMap(Map<String, Object> columnMap) {
        return IService.super.listByMap(columnMap);
    }

    @Override
    default Usersong getOne(Wrapper<Usersong> queryWrapper) {
        return IService.super.getOne(queryWrapper);
    }

    @Override
    Usersong getOne(Wrapper<Usersong> queryWrapper, boolean throwEx);

    @Override
    Map<String, Object> getMap(Wrapper<Usersong> queryWrapper);

    @Override
    <V> V getObj(Wrapper<Usersong> queryWrapper, Function<? super Object, V> mapper);

    @Override
    default int count() {
        return IService.super.count();
    }

    @Override
    default int count(Wrapper<Usersong> queryWrapper) {
        return IService.super.count(queryWrapper);
    }

    @Override
    default List<Usersong> list(Wrapper<Usersong> queryWrapper) {
        return IService.super.list(queryWrapper);
    }

    @Override
    default List<Usersong> list() {
        return IService.super.list();
    }

    @Override
    default <E extends IPage<Usersong>> E page(E page, Wrapper<Usersong> queryWrapper) {
        return IService.super.page(page, queryWrapper);
    }

    @Override
    default <E extends IPage<Usersong>> E page(E page) {
        return IService.super.page(page);
    }

    @Override
    default List<Map<String, Object>> listMaps(Wrapper<Usersong> queryWrapper) {
        return IService.super.listMaps(queryWrapper);
    }

    @Override
    default List<Map<String, Object>> listMaps() {
        return IService.super.listMaps();
    }

    @Override
    default List<Object> listObjs() {
        return IService.super.listObjs();
    }

    @Override
    default <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return IService.super.listObjs(mapper);
    }

    @Override
    default List<Object> listObjs(Wrapper<Usersong> queryWrapper) {
        return IService.super.listObjs(queryWrapper);
    }

    @Override
    default <V> List<V> listObjs(Wrapper<Usersong> queryWrapper, Function<? super Object, V> mapper) {
        return IService.super.listObjs(queryWrapper, mapper);
    }

    @Override
    default <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<Usersong> queryWrapper) {
        return IService.super.pageMaps(page, queryWrapper);
    }

    @Override
    default <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return IService.super.pageMaps(page);
    }

    @Override
    BaseMapper<Usersong> getBaseMapper();

    @Override
    Class<Usersong> getEntityClass();

    @Override
    default QueryChainWrapper<Usersong> query() {
        return IService.super.query();
    }

    @Override
    default LambdaQueryChainWrapper<Usersong> lambdaQuery() {
        return IService.super.lambdaQuery();
    }

    @Override
    default KtQueryChainWrapper<Usersong> ktQuery() {
        return IService.super.ktQuery();
    }

    @Override
    default KtUpdateChainWrapper<Usersong> ktUpdate() {
        return IService.super.ktUpdate();
    }

    @Override
    default UpdateChainWrapper<Usersong> update() {
        return IService.super.update();
    }

    @Override
    default LambdaUpdateChainWrapper<Usersong> lambdaUpdate() {
        return IService.super.lambdaUpdate();
    }

    @Override
    default boolean saveOrUpdate(Usersong entity, Wrapper<Usersong> updateWrapper) {
        return IService.super.saveOrUpdate(entity, updateWrapper);
    }

    public PageInfo<Usersong> getAllUserSongs(Integer pagenum, Integer pagesize, Integer userID);
    public void deleteSong(Integer bodyID,Integer id);
}
