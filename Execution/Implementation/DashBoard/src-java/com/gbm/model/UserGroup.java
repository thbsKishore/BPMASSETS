/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : UserGroup.java                                       */
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

package com.gbm.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


/**
 * @author sumanth_pai
 *
 */
public class UserGroup implements RowMapper<UserGroup> {
    /**
     * A <code>int</code> representing groupId
     */
    private int groupId;
    /**
     * A <code>String</code> representing groupName
     */
    private String groupName;
    /**
     * A <code>String</code> representing description
     */
    private String description;
    /**
     * A <code>File</code> representing icon
     */
    private byte[] icon;
    /**
     * A <code>String</code> representing GROUP_ID
     */
    public static final String GROUP_ID = "group_id";
    /**
     * A <code>String</code> representing GROUP_NAME
     */
    public static final String GROUP_NAME = "group_name";
    /**
     * A <code>String</code> representing DESCRIPTION
     */
    public static final String DESCRIPTION = "description";
    /**
     * A <code>String</code> representing ICON
     */
    public static final String ICON = "icon";
    /**
     * A <code>String</code> representing ICON
     */
    public static final String ICON_NAME = "icon_name";
    /**
     * A <code>String</code> representing USER_ID_FK
     */
    public static final String USER_ID_FK = "user_id_fk";
    
    /**
     * @return the groupId
     */
    public int getGroupId() {
        return groupId;
    }
    /**
     * @param groupId 
     *       The groupId to set.
     */
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    /**
     * @return the groupName
     */
    public String getGroupName() {
        return groupName;
    }
    /**
     * @param groupName 
     *       The groupName to set.
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description 
     *       The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the icon
     */
    public byte[] getIcon() {
        return icon;
    }
    /**
     * @param icon 
     *       The icon to set.
     */
    public void setIcon(byte[] icon) {
        this.icon = icon;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "UserGroup [groupId=" + groupId + ", groupName=" + groupName + ", description=" + description
                + ", icon=" + icon + "]";
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public UserGroup mapRow(ResultSet rs, int arg1) throws SQLException {
        UserGroup userGroup = new UserGroup();
        userGroup.setGroupId(rs.getInt(GROUP_ID));
        userGroup.setGroupName(rs.getString(GROUP_NAME));
        userGroup.setIcon((byte[]) rs.getObject(ICON));
        userGroup.setDescription(new String((byte[]) rs.getObject(DESCRIPTION)));
        return userGroup;
    }
}
