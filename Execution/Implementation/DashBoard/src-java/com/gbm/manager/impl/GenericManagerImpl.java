/*************************** FILE HEADER ****************************/
/*                                                                  */
/* FileName    : DataTableManagerImpl.java                                       */
/*                                                                  */
/* Author      : T.H.B.S, India                                     */
/*                                                                  */
/* Date        : 07-Apr-2015                                            */
/*                                                                  */
/* Description :                                                    */
/*                                                                  */
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 07-Apr-2015     THBS                1.0   Initial version created*/
/*__________________________________________________________________*/

package com.gbm.manager.impl;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.gbm.dao.GenericJdbcDao;
import com.gbm.manager.GenericManager;

public class GenericManagerImpl<T> implements GenericManager<T> {

    private GenericJdbcDao<T> genericJdbcDao;
    Class<T> entityClass;

    public GenericManagerImpl(Class<T> class1) {
        this.entityClass = class1;
    }

    /**
     * @return the genericJdbcDao
     */
    public GenericJdbcDao<T> getGenericJdbcDao() {
        return genericJdbcDao;
    }

    /**
     * @param genericJdbcDao
     *            the genericJdbcDao to set
     */
    public void setGenericJdbcDao(GenericJdbcDao<T> genericJdbcDao) {
        this.genericJdbcDao = genericJdbcDao;
    }

    @Override
    public List<T> getAll(String query, RowMapper<T> rowmapper) {
        return genericJdbcDao.getAll(query, rowmapper);
    }

    @Override
    public List<T> getList(String query, Object[] paramValues,
            RowMapper<T> mapper) {
        return genericJdbcDao.getList(query, paramValues, mapper);
    }

    @Override
    public Object get(String query, Object[] paramValues, RowMapper<T> mapper) {
        return genericJdbcDao.get(query, paramValues, mapper);
    }

    @Override
    public int update(String query, Object[] paramValues) {
        return genericJdbcDao.update(query, paramValues);
    }

    @Override
    public Integer queryForInt(String query, Object[] paramValues) {
        return genericJdbcDao.queryForInt(query, paramValues);
    }

    @Override
    public Object queryForObject(String query, Object[] paramValues,
            Class<?> type) {
        return genericJdbcDao.queryForObject(query, paramValues, type);
    }

    @Override
    public List<?> getList(String query, Object[] paramValues) {
        return genericJdbcDao.getList(query, paramValues);
    }

    @Override
    public List<?> getList(String query, Object[] paramValues, Class<?> type) {
        return genericJdbcDao.getList(query, paramValues, type);
    }

    @Override
    public int update(String query) {
        return genericJdbcDao.update(query);
    }

    @Override
    public List<Integer> selectIntegerList(String query) {
        return genericJdbcDao.selectIntegerList(query);
    }

   

   
}
