/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : GenericManager.java                                       */
/*                                                                  */
/* Author      : T.H.B.S, India                                     */
/*                                                                  */
/* Date        : 07-Apr-2015                                            */
/*                                                                  */
/* Description :                                                    */
/*                                                                  */
/********************************************************************/
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 07-Apr-2015         THBS               1.0  Initial version created  */
/********************************************************************/

package com.gbm.manager;

import java.util.List;



import org.springframework.jdbc.core.RowMapper;
/**
 * @author sumanth_pai
 * 
 */
public interface GenericManager<T> {

    public List<T> getAll(String query, RowMapper<T> rowmapper);

    /**
     * Generic method used to get all objects retrieved from the query.
     * 
     * @param query
     *            SQL query for the retrieval.
     * @param paramValues
     *            parameter values used in the query.
     * @param mapper
     *            mapper for mapping to POJO.
     * @return List of populated objects.
     */
    public List<T> getList(String query, Object[] paramValues,
            RowMapper<T> mapper);

    /**
     * Generic method to get an object retrieved from the query.
     * 
     * @param query
     *            SQL query for the retrieval.
     * @param paramValues
     *            parameter values used in the query.
     * @param mapper
     *            mapper for mapping to POJO.
     * @return populated object.
     */
    public Object get(String query, Object[] paramValues, RowMapper<T> mapper);

    /**
     * Generic method to perform update operations. (such as an insert, update
     * or delete)
     * 
     * @param query
     *            SQL query for the retrieval.
     * @param paramValues
     *            parameter values used in the query.
     * @return number of rows affected.
     */
    public int update(String query, Object[] paramValues);

    /**
     * Generic method to retrieve an integer value from the query.
     * 
     * @param query
     *            SQL query for the retrieval.
     * @param paramValues
     *            parameter values used in the query.
     * @return int value
     */
    public Integer queryForInt(String query, Object[] paramValues);

    /**
     * Generic method to retrieve an Object value from the query.
     * 
     * @param query
     *            SQL query for the retrieval.
     * @param paramValues
     *            parameter values used in the query.
     * @param type
     *            type
     * @return Long value
     */
    public Object queryForObject(String query, Object[] paramValues,
            Class<?> type);

    /**
     * Generic method used to get all objects retrieved from the query.
     * 
     * @param query
     *            SQL query for the retrieval.
     * @param paramValues
     *            parameter values used in the query.
     * @return List of populated objects.
     */

    public List<?> getList(String query, Object[] paramValues);

    /**
     * Generic method used to get all objects retrieved from the query.
     * 
     * @param query
     *            SQL query for the retrieval.
     * @param paramValues
     *            parameter values used in the query.
     * @param type
     *            type
     * @return List of populated objects.
     */

    public List<?> getList(String query, Object[] paramValues, Class<?> type);

    /**
     * Generic method to perform update operations. (such as an insert, update
     * or delete)
     * 
     * @param query
     *            SQL query for the retrieval.
     * @param paramValues
     *            parameter values used in the query.
     * @return number of rows affected.
     */
    public int update(String query);

    /**
     * Generic method used to get all objects retrieved from the query.
     * 
     * @param query
     *            SQL query for the retrieval.
     * 
     * @param type
     *            type
     * @return List of Integer.
     */
    public List<Integer> selectIntegerList(String query);

   
   
}
