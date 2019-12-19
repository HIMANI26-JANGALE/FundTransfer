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

import com.dao.BankDao;
import com.model.Application;
import com.model.Branch;

/**
 * Servlet implementation class BranchController
 */
@WebServlet("/BranchController")
public class BranchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("ifsc_code");
		int n=Integer.parseInt(s1);
		String s2=request.getParameter("branch_name");
		String s3=request.getParameter("branch_code");
		String s4=request.getParameter("branch_bal");
		Float n1=Float.parseFloat(s4);
		Branch b=new Branch();
		b.setIfsc_code(n);
		b.setBranch_name(s2);
		b.setBranch_code(s3);
		b.setBranch_bal(n1);
		List lst=new ArrayList<Application>();
		lst.add(b);
		BankDao rd=new BankDao();
		PrintWriter pw=response.getWriter();
		int i=rd.savedData1(lst);
		if(i>0)
		{
			pw.print("inserted successfully");
		}
		
		
		//doGet(request, response);
	}

}
