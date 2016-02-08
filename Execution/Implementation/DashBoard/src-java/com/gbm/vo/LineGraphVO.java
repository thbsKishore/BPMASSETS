/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : ApprovalRateLineGraphVO.java                                       */
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

import java.util.Date;

/**
 * @author sumanth_pai
 *
 */
public class LineGraphVO {
    
    
    private Date date;
    
    private Integer Count;

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date 
     *       The date to set.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the count
     */
    public Integer getCount() {
        return Count;
    }

    /**
     * @param count 
     *       The count to set.
     */
    public void setCount(Integer count) {
        Count = count;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ApprovalRateLineGraphVO [date=");
        builder.append(date);
        builder.append(", Count=");
        builder.append(Count);
        builder.append("]");
        return builder.toString();
    }
    
    
    
    
    
    
    

}
