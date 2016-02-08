/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : FunnelChartVO.java                                       */
/*                                                                  */
/* Author      : T.H.B.S, India                                     */
/*                                                                  */
/* Date        : 20-Jan-2016                                            */
/*                                                                  */
/* Description :                                                    */
/*                                                                  */
/********************************************************************/
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 20-Jan-2016         THBS               1.0  Initial version created  */
/********************************************************************/

package com.gbm.vo;

/**
 * @author sumanth_pai
 *
 */
public class FunnelChartVO {
    
    
    private String activity;
    
    
    private Integer count;


    /**
     * @return the activity
     */
    public String getActivity() {
        return activity;
    }


    /**
     * @param activity 
     *       The activity to set.
     */
    public void setActivity(String activity) {
        this.activity = activity;
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
        builder.append("FunnelChartVO [activity=");
        builder.append(activity);
        builder.append(", count=");
        builder.append(count);
        builder.append("]");
        return builder.toString();
    }


    
    
    
    
    

}
