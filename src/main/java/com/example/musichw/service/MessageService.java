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
import com.example.musichw.pojo.Message;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


public interface MessageService extends IService<Message> {
    public void insertMessage(Message message);

    @Override
    default boolean save(Message entity) {
        return IService.super.save(entity);
    }

    @Override
    default boolean saveBatch(Collection<Message> entityList) {
        return IService.super.saveBatch(entityList);
    }

    @Override
    boolean saveBatch(Collection<Message> entityList, int batchSize);

    @Override
    default boolean saveOrUpdateBatch(Collection<Message> entityList) {
        return IService.super.saveOrUpdateBatch(entityList);
    }

    @Override
    boolean saveOrUpdateBatch(Collection<Message> entityList, int batchSize);

    @Override
    default boolean removeById(Serializable id) {
        return IService.super.removeById(id);
    }

    @Override
    default boolean removeByMap(Map<String, Object> columnMap) {
        return IService.super.removeByMap(columnMap);
    }

    @Override
    default boolean remove(Wrapper<Message> queryWrapper) {
        return IService.super.remove(queryWrapper);
    }

    @Override
    default boolean removeByIds(Collection<? extends Serializable> idList) {
        return IService.super.removeByIds(idList);
    }

    @Override
    default boolean updateById(Message entity) {
        return IService.super.updateById(entity);
    }

    @Override
    default boolean update(Wrapper<Message> updateWrapper) {
        return IService.super.update(updateWrapper);
    }

    @Override
    default boolean update(Message entity, Wrapper<Message> updateWrapper) {
        return IService.super.update(entity, updateWrapper);
    }

    @Override
    default boolean updateBatchById(Collection<Message> entityList) {
        return IService.super.updateBatchById(entityList);
    }

    @Override
    boolean updateBatchById(Collection<Message> entityList, int batchSize);

    @Override
    boolean saveOrUpdate(Message entity);

    @Override
    default Message getById(Serializable id) {
        return IService.super.getById(id);
    }

    @Override
    default List<Message> listByIds(Collection<? extends Serializable> idList) {
        return IService.super.listByIds(idList);
    }

    @Override
    default List<Message> listByMap(Map<String, Object> columnMap) {
        return IService.super.listByMap(columnMap);
    }

    @Override
    default Message getOne(Wrapper<Message> queryWrapper) {
        return IService.super.getOne(queryWrapper);
    }

    @Override
    Message getOne(Wrapper<Message> queryWrapper, boolean throwEx);

    @Override
    Map<String, Object> getMap(Wrapper<Message> queryWrapper);

    @Override
    <V> V getObj(Wrapper<Message> queryWrapper, Function<? super Object, V> mapper);

    @Override
    default int count() {
        return IService.super.count();
    }

    @Override
    default int count(Wrapper<Message> queryWrapper) {
        return IService.super.count(queryWrapper);
    }

    @Override
    default List<Message> list(Wrapper<Message> queryWrapper) {
        return IService.super.list(queryWrapper);
    }

    @Override
    default List<Message> list() {
        return IService.super.list();
    }

    @Override
    default <E extends IPage<Message>> E page(E page, Wrapper<Message> queryWrapper) {
        return IService.super.page(page, queryWrapper);
    }

    @Override
    default <E extends IPage<Message>> E page(E page) {
        return IService.super.page(page);
    }

    @Override
    default List<Map<String, Object>> listMaps(Wrapper<Message> queryWrapper) {
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
    default List<Object> listObjs(Wrapper<Message> queryWrapper) {
        return IService.super.listObjs(queryWrapper);
    }

    @Override
    default <V> List<V> listObjs(Wrapper<Message> queryWrapper, Function<? super Object, V> mapper) {
        return IService.super.listObjs(queryWrapper, mapper);
    }

    @Override
    default <E extends IPage<Map<String, Object>>> E pageMaps(E page, Wrapper<Message> queryWrapper) {
        return IService.super.pageMaps(page, queryWrapper);
    }

    @Override
    default <E extends IPage<Map<String, Object>>> E pageMaps(E page) {
        return IService.super.pageMaps(page);
    }

    @Override
    BaseMapper<Message> getBaseMapper();

    @Override
    Class<Message> getEntityClass();

    @Override
    default QueryChainWrapper<Message> query() {
        return IService.super.query();
    }

    @Override
    default LambdaQueryChainWrapper<Message> lambdaQuery() {
        return IService.super.lambdaQuery();
    }

    @Override
    default KtQueryChainWrapper<Message> ktQuery() {
        return IService.super.ktQuery();
    }

    @Override
    default KtUpdateChainWrapper<Message> ktUpdate() {
        return IService.super.ktUpdate();
    }

    @Override
    default UpdateChainWrapper<Message> update() {
        return IService.super.update();
    }

    @Override
    default LambdaUpdateChainWrapper<Message> lambdaUpdate() {
        return IService.super.lambdaUpdate();
    }

    @Override
    default boolean saveOrUpdate(Message entity, Wrapper<Message> updateWrapper) {
        return IService.super.saveOrUpdate(entity, updateWrapper);
    }

    public PageInfo<Message> getmessages(Integer num, Integer size, Integer userID);
}
