package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Application;
import com.dao.BankDao;

/**
 * Servlet implementation class ApplicationController
 */
@WebServlet("/ApplicationController")
public class ApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationController() {
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
		// TODO Auto-generated method stub
		String s1=request.getParameter("app_no");
		int n1=Integer.parseInt(s1);
		String s2=request.getParameter("branch_name");
		String s3=request.getParameter("account_type");
		String s4=request.getParameter("surname");
		String s5=request.getParameter("firstname");
		String s6=request.getParameter("middlename");
		String s7=request.getParameter("date");
		//int n2=Integer.parseInt(s7);
		//String s8=request.getParameter("mother_name");
		String s9=request.getParameter("email");
		String s10=request.getParameter("mobile_no");
		//int n3=Integer.parseInt(s10);
		String s11=request.getParameter("nationality");
		String s12=request.getParameter("occupation");
		String s13=request.getParameter("city");
		String s14=request.getParameter("state");
		String s15=request.getParameter("district");
		String s16=request.getParameter("pincode");
		int n4=Integer.parseInt(s16);
		String s17=request.getParameter("aadhar_no");
		//int n5=Integer.parseInt(s17);
		String s18=request.getParameter("pan_no");
		int n6=Integer.parseInt(s18);
		Application rm=new Application();
		rm.setcust_id(n1);
		rm.setBranch_name(s2);
		rm.setAccount_type(s3);
		rm.setSurname(s4);
		rm.setFirtsname(s5);
		rm.setMiddlename(s6);
		rm.setDate(s7);
		//rm.setMother_name(s8);
		rm.setEmail(s9);
		rm.setMobile_no(s10);
		rm.setNationality(s11);
		rm.setOccupation(s12);
		rm.setCity(s13);
		rm.setState(s14);
		rm.setDistrict(s15);
		rm.setPincode(n4);
		rm.setAadhar_no(s17);
		rm.setPan_no(n6);
		List lst=new ArrayList<Application>();
		lst.add(rm);
		BankDao rd=new BankDao();
		PrintWriter pw=response.getWriter();
		int i=rd.savedData(lst);
		if(i>0)
		{
			pw.print("inserted successfully");
		}
	}
}


