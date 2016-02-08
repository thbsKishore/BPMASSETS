/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : GroupManagerImpl.java                                       */
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

package com.gbm.manager.impl;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import com.gbm.dao.GroupDao;
import com.gbm.manager.GroupManager;
import com.gbm.model.UserGroup;


/**
 * @author sumanth_pai
 *
 */
public class GroupManagerImpl extends GenericManagerImpl<UserGroup> implements GroupManager {

    public GroupManagerImpl() {
        super(UserGroup.class);
    }
    
    private GroupDao groupDao;
    /**
     * {@inheritDoc}
     */
    @Override
    public List<UserGroup> getAllGroups() {
       
        return groupDao.getAllGroups();
    }
    
    
    public GroupDao getGroupDao() {
        return groupDao;
    }
    /**
     * @param groupDao 
     *       The groupDao to set.
     */
    public void setGroupDao(GroupDao groupDao) {
        this.groupDao = groupDao;
    }

}
