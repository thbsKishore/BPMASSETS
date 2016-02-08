/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : GroupDao.java                                       */
/*                                                                  */
/* Author      : T.H.B.S, India                                     */
/*                                                                  */
/* Date        : 06-Nov-2015                                            */
/*                                                                  */
/* Description :                                                    */
/*                                                                  */
/********************************************************************/
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 06-Nov-2015         THBS               1.0  Initial version created  */
/********************************************************************/

package com.gbm.dao;

import java.util.List;

import com.gbm.model.UserGroup;


/**
 * @author sumanth_pai
 *
 */
public interface GroupDao extends GenericJdbcDao<UserGroup> {

    /**
     * <strong>Method Name: getAllGroups</strong><br/>
     * <strong>Description:</strong> <add description here>
     * @return List<UserGroup>
     *
     */
    public List<UserGroup> getAllGroups();

    
}
