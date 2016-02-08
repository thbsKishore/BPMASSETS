/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : ProductsVO.java                                       */
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

/**
 * @author sumanth_pai
 *
 */
public class ProductsVO {
    
    
   private String productName;
   
   
   private Integer count;


/**
 * @return the productName
 */
public String getProductName() {
    return productName;
}


/**
 * @param productName 
 *       The productName to set.
 */
public void setProductName(String productName) {
    this.productName = productName;
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
    builder.append("ProductsVO [productName=");
    builder.append(productName);
    builder.append(", count=");
    builder.append(count);
    builder.append("]");
    return builder.toString();
}



   
   
   
   
   
   

}
