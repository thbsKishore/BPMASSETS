/********************************************************************/
/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/*  FileName    : GenericJdbcDaoImpl.java                               */
/*                                                                  */
/*  Author      : T.H.B.S, India                                    */
/*                                                                  */
/*  Date        : 12 Jan 2012                                       */
/*                                                                  */
/*  Description : Generic JDBC Dao Implementation class.            */
/********************************************************************/
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 12 Jan 2012     T.H.B.S           1.0     Initial version created*/
/********************************************************************/
package com.gbm.dao.impl;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.gbm.dao.GenericJdbcDao;

/**
 * This class serves as the Base class for all other DAOs which use JDBC for
 * common CRUD operations.
 * 
 * @param <T>
 */
public class GenericJdbcDaoImpl<T> extends JdbcDaoSupport implements
        GenericJdbcDao<T> {

   

    Class<T> entityClass;

    public GenericJdbcDaoImpl() {

    }

    protected GenericJdbcDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> getAll(String query, RowMapper<T> rowmapper) {
        List<T> list = null;
        try {
            list = getJdbcTemplate().query(query, rowmapper);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }
        return list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> getList(String query, Object[] paramValues,
            RowMapper<T> mapper) {

        List<T> resultList = null;
        try {
            resultList = getJdbcTemplate().query(query, paramValues, mapper);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }

        return resultList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object get(String query, Object[] paramValues, RowMapper<T> mapper) {

        Object resultObject = null;
        try {
            resultObject = getJdbcTemplate().queryForObject(query, paramValues,
                    mapper);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }

        return resultObject;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int update(String query, Object[] paramValues) {

        int noOfRows = 0;
        try {
            noOfRows = getJdbcTemplate().update(query, paramValues);

        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }

        return noOfRows;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer queryForInt(String query, Object[] paramValues) {

        Integer id = null;
        try {
            id = getJdbcTemplate().queryForInt(query, paramValues);
        } catch (EmptyResultDataAccessException ex) {
            throw ex;
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object queryForObject(String query, Object[] paramValues, Class<?> type) {
        Object obj = null;
        try {
            obj = getJdbcTemplate().queryForObject(query, paramValues, type);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }

        return obj;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<T> getList(String query, Object[] paramValues) {

        List<T> resultList = null;
        try {
            resultList = (List<T>) getJdbcTemplate().queryForList(query,
                    paramValues);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }

        return resultList;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<T> getList(String listItems) {
        List<T> resultList = null;
        try {
            resultList = (List<T>) getJdbcTemplate().queryForList(listItems);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }
        return resultList;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<T> getList(String query, Object[] paramValues, Class<?> type) {

        List<T> resultList = null;
        try {
            resultList = (List<T>) getJdbcTemplate().queryForList(query,
                    paramValues, type);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }

        return resultList;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int update(String query) {

        int noOfRows;
        try {
            noOfRows = getJdbcTemplate().update(query);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }

        return noOfRows;

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Integer> selectIntegerList(String query) {
        List<Integer> noOfRow = null;
        try {
            noOfRow = (getJdbcTemplate()).queryForList(query, Integer.class);
        } catch (DataAccessException dataAccessException) {
            throw dataAccessException;
        }

        return noOfRow;
    }

    public List<String> selectStringList(String query) {
        List<String> noOfRow = null;
        noOfRow = (getJdbcTemplate()).queryForList(query, String.class);
        return noOfRow;
    }

    
   




}
