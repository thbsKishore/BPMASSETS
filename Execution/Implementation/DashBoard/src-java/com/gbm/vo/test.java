/*                           FILE HEADER                            */
/********************************************************************/
/*                                                                  */
/* FileName    : test.java                                       */
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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author sumanth_pai
 *
 */
public class test {
    
    
    public static void main(String args[])
    {
        
        String[] yaxis ={"Sunday","Monday","Tuesday"};
        
        String[] xaxis ={"name1","name2","name3","name4"};
        
       List<List<Integer>> result = new ArrayList<>();
        
     
        
        
        int i=0;
        for (String string : xaxis) {
            
            List<Integer> temp = null ;
            int j=0;
            for (String string1 : yaxis) {
                 temp = new ArrayList<>();     
                temp.add(i);
                temp.add(j);
                
                temp.add(10);
                j++;
                result.add(temp);
            }
            
            
            
             
            
            
            i++;
            
            
        }
        
        
        
       System.out.println(result);
       
       
       
       
       Gson gson = new GsonBuilder().create();
       String jsonObj= gson.toJson("");
       
       System.out.println(jsonObj);
        
        
        
    }
   
    
    
    

}
