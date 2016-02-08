/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : CriteriaFilterVO.java                                       */
/*                                                                  */
/* Author      : T.H.B.S, India                                     */
/*                                                                  */
/* Date        : 02-Feb-2016                                            */
/*                                                                  */
/* Description :                                                    */
/*                                                                  */
/********************************************************************/
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 02-Feb-2016         THBS               1.0  Initial version created  */
/********************************************************************/

package com.gbm.vo;

import java.util.Date;

/**
 * @author sumanth_pai
 *
 */
public class CriteriaFilterVO {
    
    
    private Date formDate;
    
    
    private Date toDate;
    
    
    private String chartType;


    /**
     * @return the formDate
     */
    public Date getFormDate() {
        return formDate;
    }


    /**
     * @param formDate 
     *       The formDate to set.
     */
    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }


    /**
     * @return the toDate
     */
    public Date getToDate() {
        return toDate;
    }


    /**
     * @param toDate 
     *       The toDate to set.
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }


    /**
     * @return the chartType
     */
    public String getChartType() {
        return chartType;
    }


    /**
     * @param chartType 
     *       The chartType to set.
     */
    public void setChartType(String chartType) {
        this.chartType = chartType;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CriteriaFilterVO [formDate=");
        builder.append(formDate);
        builder.append(", toDate=");
        builder.append(toDate);
        builder.append(", chartType=");
        builder.append(chartType);
        builder.append("]");
        return builder.toString();
    }
    
    
    
   
    
    
    
    
    
    

}
