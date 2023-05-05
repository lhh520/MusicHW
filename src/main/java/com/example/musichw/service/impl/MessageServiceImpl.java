package com.example.musichw.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.example.musichw.pojo.Message;
import java.util.Date;
import com.example.musichw.mapper.MessageMapper;
import java.io.Serializable;
import com.example.musichw.service.MessageService;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.sql.Blob;
import java.util.Map;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import java.util.Queue;
import java.util.ArrayList;
import java.util.HashMap;
import com.github.pagehelper.PageInfo;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {
    @Autowired
    MessageMapper messageMapper;
    @Override
    public void insertMessage(Message message) {
        messageMapper.insert(message);
    }

    public MessageServiceImpl() {
        super();
    }

    @Override
    public MessageMapper getBaseMapper() {
        return super.getBaseMapper();
    }

    @Override
    public Class<Message> getEntityClass() {
        return super.getEntityClass();
    }

    @Override
    protected boolean retBool(Integer result) {
        return super.retBool(result);
    }

    @Override
    protected Class<Message> currentMapperClass() {
        return super.currentMapperClass();
    }

    @Override
    protected Class<Message> currentModelClass() {
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
    public boolean saveBatch(Collection<Message> entityList, int batchSize) {
        return super.saveBatch(entityList, batchSize);
    }

    @Override
    protected String getSqlStatement(SqlMethod sqlMethod) {
        return super.getSqlStatement(sqlMethod);
    }

    @Override
    public boolean saveOrUpdate(Message entity) {
        return super.saveOrUpdate(entity);
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Message> entityList, int batchSize) {
        return super.saveOrUpdateBatch(entityList, batchSize);
    }

    @Override
    public boolean updateBatchById(Collection<Message> entityList, int batchSize) {
        return super.updateBatchById(entityList, batchSize);
    }

    @Override
    public Message getOne(Wrapper<Message> queryWrapper, boolean throwEx) {
        return super.getOne(queryWrapper, throwEx);
    }

    @Override
    public Map<String, Object> getMap(Wrapper<Message> queryWrapper) {
        return super.getMap(queryWrapper);
    }

    @Override
    public <V> V getObj(Wrapper<Message> queryWrapper, Function<? super Object, V> mapper) {
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
    public PageInfo<Message> getmessages(Integer num, Integer size, Integer userID) {
        PageHelper.startPage(num, size);
        List<Integer>list=new ArrayList<>();
        list.add(new Integer(1));

        QueryWrapper<Message> cdcdcdscds = new QueryWrapper<>();
        cdcdcdscds.eq("visitor", userID);
        List<Message> cdcsc = messageMapper.selectList(cdcdcdscds);
        PageInfo<Message> ewewew = new PageInfo<>(cdcsc);
        return ewewew;
    }
}
