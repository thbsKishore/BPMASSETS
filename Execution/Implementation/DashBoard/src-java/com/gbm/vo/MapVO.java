/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : MapVO.java                                       */
/*                                                                  */
/* Author      : T.H.B.S, India                                     */
/*                                                                  */
/* Date        : 27-Jan-2016                                            */
/*                                                                  */
/* Description :                                                    */
/*                                                                  */
/********************************************************************/
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 27-Jan-2016         THBS               1.0  Initial version created  */
/********************************************************************/

package com.gbm.vo;

/**
 * @author sumanth_pai
 *
 */
public class MapVO {
    
    private String country;
    
    private Integer count;

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country 
     *       The country to set.
     */
    public void setCountry(String country) {
        this.country = country;
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
        return "MapVO [country=" + country + ", count=" + count + "]";
    }
    
    
    
    

}
