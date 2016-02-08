/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : ProductsPerformanceChartVO.java                                       */
/*                                                                  */
/* Author      : T.H.B.S, India                                     */
/*                                                                  */
/* Date        : 18-Jan-2016                                            */
/*                                                                  */
/* Description :                                                    */
/*                                                                  */
/********************************************************************/
/* Date            Name              Version             Comments   */
/*------------------------------------------------------------------*/
/* 18-Jan-2016         THBS               1.0  Initial version created  */
/********************************************************************/

package com.gbm.vo;

import java.util.List;

/**
 * @author sumanth_pai
 *
 */
public class ProductsPerformanceChartVO {
    
    
    private String Month;
    
    
    private List<ProductsVO> products;


    /**
     * @return the month
     */
    public String getMonth() {
        return Month;
    }


    /**
     * @param month 
     *       The month to set.
     */
    public void setMonth(String month) {
        this.Month = month;
    }


    /**
     * @return the products
     */
    public List<ProductsVO> getProducts() {
        return products;
    }


    /**
     * @param products 
     *       The products to set.
     */
    public void setProducts(List<ProductsVO> products) {
        this.products = products;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProductsPerformanceChartVO [month=");
        builder.append(Month);
        builder.append(", products=");
        builder.append(products);
        builder.append("]");
        return builder.toString();
    }
    
    
    
    
    
    
     

}
