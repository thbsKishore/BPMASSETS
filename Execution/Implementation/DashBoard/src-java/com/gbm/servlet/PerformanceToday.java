package com.gbm.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.gbm.manager.GenericManager;
import com.gbm.manager.GroupManager;
import com.gbm.model.UserGroup;
import com.gbm.vo.LineGraphVO;
import com.gbm.vo.ProductsPerformanceChartVO;
import com.gbm.vo.ProductsVO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class PerformanceGraphs
 */
@WebServlet("/PerformanceGraphs")
public class PerformanceToday extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private GroupManager groupManager;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PerformanceToday() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
        super.init(config);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    try{
	    
	    System.out.println("Inside Go get");
	    
	    
	   
	    
	  
	    List<ProductsPerformanceChartVO> clist = new ArrayList<ProductsPerformanceChartVO>();
	    
	    
	    ProductsPerformanceChartVO vo1 = new ProductsPerformanceChartVO();
	    List<ProductsVO> plist1 = new ArrayList<ProductsVO>();
	    
	    
	    
	    ProductsVO pvo1 = new ProductsVO();
	    pvo1.setProductName("p1");
	    pvo1.setCount(30);
	    
	    
	    ProductsVO pvo2 = new ProductsVO();
        pvo2.setProductName("p2");
        pvo2.setCount(50);
        
        
        ProductsVO pvo3 = new ProductsVO();
        pvo3.setProductName("p3");
        pvo3.setCount(80);
        
        plist1.add(pvo1);
        plist1.add(pvo2);
        plist1.add(pvo3);
	    
        vo1.setMonth("JAN");
        vo1.setProducts(plist1);
        
        
        
        
        ProductsPerformanceChartVO vo2 = new ProductsPerformanceChartVO();
        List<ProductsVO> plist2 = new ArrayList<ProductsVO>();
        
        
        
        ProductsVO pvo4 = new ProductsVO();
        pvo4.setProductName("p1");
        pvo4.setCount(30);
        
        
        ProductsVO pvo5 = new ProductsVO();
        pvo5.setProductName("p2");
        pvo5.setCount(50);
        
        
        ProductsVO pvo6 = new ProductsVO();
        pvo6.setProductName("p3");
        pvo6.setCount(80);
        
        plist2.add(pvo4);
        plist2.add(pvo5);
        plist2.add(pvo6);
        
        vo2.setMonth("FEB");
        vo2.setProducts(plist2);
        
        
        
        ProductsPerformanceChartVO vo3 = new ProductsPerformanceChartVO();
        List<ProductsVO> plist3 = new ArrayList<ProductsVO>();
        
        
        
        ProductsVO pvo7 = new ProductsVO();
        pvo7.setProductName("p1");
        pvo7.setCount(30);
        
        
        ProductsVO pvo8 = new ProductsVO();
        pvo8.setProductName("p2");
        pvo8.setCount(50);
        
        
        ProductsVO pvo9 = new ProductsVO();
        pvo9.setProductName("p3");
        pvo9.setCount(80);
        
        plist3.add(pvo7);
        plist3.add(pvo8);
        plist3.add(pvo9);
        
        vo3.setMonth("MAR");
        vo3.setProducts(plist3);
        
        clist.add(vo1);
        clist.add(vo2);
        clist.add(vo3);
        
        
        
        
	    
	    
	    
	    
        Gson gson = new GsonBuilder().create();
	    String jsonObj= gson.toJson(clist);
	    
	 //   System.out.println(jsonObj);
	    
	    List<UserGroup> group =groupManager.getAllGroups();
	    
	 
	    
	    
	    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	    
	   
	    Date date1 =df.parse("18/01/2016");

	    
	    
	    List<LineGraphVO> listAp = new ArrayList<LineGraphVO>();
	    
	    LineGraphVO ap =new LineGraphVO();
	    ap.setDate(new Date());
	    ap.setCount(35);
	    
	    LineGraphVO ap2 =new LineGraphVO();
        ap2.setDate(date1);
        ap2.setCount(50);
	    
	    
	    
	    listAp.add(ap);
	    listAp.add(ap2);
	    
	    
        String jsonObj1= gson.toJson(listAp);
        System.out.println(jsonObj1);
	    
	    
	    
	    
	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/pages/index.jsp");
	    dispatcher.forward(request,response);
	    
	    }catch(Exception e)
	    {
	        
	        e.printStackTrace();
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    
	    System.out.println("Inside Go post");
	    
	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/pages/index.jsp");
        dispatcher.forward(request,response);
	}
	
	
	
	
	
	

   
   
	
	

}
