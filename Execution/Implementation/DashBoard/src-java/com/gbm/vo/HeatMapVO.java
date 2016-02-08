/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : HeatMapVO.java                                       */
/*                                                                  */
/* Author      : T.H.B.S, India                                     */
/*                                                                  */
/* Date        : 19-Jan-2016                                            */
/*                                                                  */
/* Description :                                                    */
/*                                                                  */
/********************************************************************/
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 19-Jan-2016         THBS               1.0  Initial version created  */
/********************************************************************/

package com.gbm.vo;

/**
 * @author sumanth_pai
 *
 */
public class HeatMapVO {
    
    
    private String age;
    
    private String maritalStatus;
    
    private Integer count;

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age 
     *       The age to set.
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus 
     *       The maritalStatus to set.
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count 
     *       The count to set.
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("HeatMapVO [age=");
        builder.append(age);
        builder.append(", maritalStatus=");
        builder.append(maritalStatus);
        builder.append(", count=");
        builder.append(count);
        builder.append("]");
        return builder.toString();
    }

   
    
    

}
