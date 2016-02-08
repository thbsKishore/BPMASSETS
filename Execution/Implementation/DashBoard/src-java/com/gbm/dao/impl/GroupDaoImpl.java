/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : GroupDaoImpl.java                                       */
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

package com.gbm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.gbm.dao.GroupDao;
import com.gbm.model.UserGroup;



/**
 * @author sumanth_pai
 *
 */
public class GroupDaoImpl extends GenericJdbcDaoImpl<UserGroup> implements GroupDao{
    /**
     * A <code>ManagePropertyFiles</code> representing propertyFileReader
     */
    
    /**
     * {@inheritDoc}
     */
    @Override
    public List<UserGroup> getAllGroups() {
        final String sql = "select * from user_group";
        SqlRowSet rs = getJdbcTemplate().queryForRowSet(sql);
        List<UserGroup> userGroupList = new ArrayList<UserGroup>();
        UserGroup ug = null;
        while(rs.next()){
            ug=new UserGroup();
            ug.setGroupId(rs.getInt(UserGroup.GROUP_ID));
            ug.setGroupName(rs.getString(UserGroup.GROUP_NAME));
            ug.setDescription(rs.getString(UserGroup.DESCRIPTION));
            ug.setIcon((byte[])rs.getObject(UserGroup.ICON));
            userGroupList.add(ug);
        }
        return userGroupList;
    }
   

}
