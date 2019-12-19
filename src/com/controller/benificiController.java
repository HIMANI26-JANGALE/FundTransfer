package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Benifidao;

import com.model.Benificiary;


/**
 * Servlet implementation class benificiController
 */
@WebServlet("/benificiController")
public class benificiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public benificiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accNo=Integer.parseInt(request.getParameter("baccNo"));
		int raccNo=Integer.parseInt(request.getParameter("rbaccNo"));
		/*if(accNo!=raccNo){
			response.sendRedirect("benificiary.jsp");
		}*/
		
		String accType=request.getParameter("type");
		int ifscNo=Integer.parseInt(request.getParameter("ifscNo"));
	    
	    String benefiName=request.getParameter("benefiName");
	    String emailId=request.getParameter("eId");
		
		System.out.println(accNo);
		Benificiary b=new Benificiary(accNo,accType,ifscNo,benefiName,emailId);
		
		System.out.println(b);
		
		List<Benificiary> lst=new ArrayList<Benificiary>();
		lst.add(b);
		 Benifidao rd=new  Benifidao();
		 PrintWriter pw=response.getWriter();
		int i=rd.saveData(lst);
		if(i>0){
			pw.print("inserted successfully");
			System.out.println("ho");
			response.sendRedirect("FundTranfer.jsp");
		}
		
	}

	
}
