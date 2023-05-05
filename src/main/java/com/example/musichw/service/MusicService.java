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
import com.example.musichw.pojo.Music;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


public interface MusicService extends IService<Music> {
    @Override
    default boolean save(Music entity) {
        return IService.super.save(entity);
    }

    @Override
    default boolean saveBatch(Collection<Music> entityList) {
        return IService.super.saveBatch(entityList);
    }

    @Override
    boolean saveBatch(Collection<Music> entityList, int batchSize);

    @Override
    default boolean saveOrUpdateBatch(Collection<Music> entityList) {
        return IService.super.saveOrUpdateBatch(entityList);
    }

    @Override
    boolean saveOrUpdateBatch(Collection<Music> entityList, int batchSize);

    @Override
    default boolean removeById(Serializable id) {
        return IService.super.removeById(id);
    }

    @Override
    default boolean removeByMap(Map<String, Object> columnMap) {
        return IService.super.removeByMap(columnMap);
    }

    @Override
    default boolean remove(Wrapper<Music> queryWrapper) {
        return IService.super.remove(queryWrapper);
    }

    @Override
    default boolean removeByIds(Collection<? extends Serializable> idList) {
        return IService.super.removeByIds(idList);
    }

    @Override
    default boolean updateById(Music entity) {
        return IService.super.updateById(entity);
    }

    @Override
    default boolean update(Wrapper<Music> updateWrapper) {
        return IService.super.update(updateWrapper);
    }

    @Override
    default boolean update(Music entity, Wrapper<Music> updateWrapper) {
        return IService.super.update(entity, updateWrapper);
    }

    @Override
    default boolean updateBatchById(Collection<Music> entityList) {
        return IService.super.updateBatchById(entityList);
    }

    @Override
    boolean updateBatchById(Collection<Music> entityList, int batchSize);

    @Override
    boolean saveOrUpdate(Music entity);

    @Override
    default Music getById(Serializable id) {
        return IService.super.getById(id);
    }

    @Override
    default List<Music> listByIds(Collection<? extends Serializable> idList) {
        return IService.super.listByIds(idList);
    }

    @Override
    default List<Music> listByMap(Map<String, Object> columnMap) {
        return IService.super.listByMap(columnMap);
    }

    @Override
    default Music getOne(Wrapper<Music> queryWrapper) {
        return IService.super.getOne(queryWrapper);
    }

    @Override
    Music getOne(Wrapper<Music> queryWrapper, boolean throwEx);

    @Override
    Map<String, Object> getMap(Wrapper<Music> queryWrapper);

    @Override
    <V> V getObj(Wrapper<Music> queryWrapper, Function<? super Object, V> mapper);

    @Override
    default int count() {
        return IService.super.count();
    }

    @Override
    default int count(Wrapper<Music> queryWrapper) {
        return IService.super.count(queryWrapper);
    }

    @Override
    default List<Music> list(Wrapper<Music> queryWrapper) {
        return IService.super.list(queryWrapper);
    }

    @Override
    default List<Music> list() {
        return IService.super.list();
    }

    @Override
    default <E extends IPage<Music>> E page(E page, Wrapper<Music> queryWrapper) {
        return IService.super.page(page, queryWrapper);
    }

    @Override
    default <E extends IPage<Music>> E page(E page) {
        return IService.super.page(page);
    }

    @Override
    default List<Map<String, Object>> listMaps(Wrapper<Music> queryWrapper) {
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
    default List<Object> listObjs(Wrapper<Music> queryWrapper) {
        return IService.super.listObjs(queryWrapper);
    }

    @Override
    default <V> List<V> listObjs(Wrapper<Music> queryWrapper, Function<? super Object, V> mapper) {
        return IService.super.listObjs(queryWrapper, mapper);
    }

    @Override
    default <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<Music> queryWrapper) {
        return IService.super.pageMaps(page, queryWrapper);
    }

    @Override
    default <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return IService.super.pageMaps(page);
    }

    @Override
    BaseMapper<Music> getBaseMapper();

    @Override
    Class<Music> getEntityClass();

    @Override
    default QueryChainWrapper<Music> query() {
        return IService.super.query();
    }

    @Override
    default LambdaQueryChainWrapper<Music> lambdaQuery() {
        return IService.super.lambdaQuery();
    }

    @Override
    default KtQueryChainWrapper<Music> ktQuery() {
        return IService.super.ktQuery();
    }

    @Override
    default KtUpdateChainWrapper<Music> ktUpdate() {
        return IService.super.ktUpdate();
    }

    @Override
    default UpdateChainWrapper<Music> update() {
        return IService.super.update();
    }

    @Override
    default LambdaUpdateChainWrapper<Music> lambdaUpdate() {
        return IService.super.lambdaUpdate();
    }

    @Override
    default boolean saveOrUpdate(Music entity, Wrapper<Music> updateWrapper) {
        return IService.super.saveOrUpdate(entity, updateWrapper);
    }

    public PageInfo<Music> gettotal(Integer num, Integer size);
    public PageInfo<Music> getBatches(Integer num, Integer size, List<Integer> list);
    public PageInfo<Music> getbymusicname(Integer num, Integer size, String name);
}
