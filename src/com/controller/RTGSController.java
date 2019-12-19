package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RTGSDao;
import com.model.Account;
import com.model.Application;
import com.model.Branch;
import com.model.RTGSModel;

/**
 * Servlet implementation class RTGSController
 */
@WebServlet("/RTGSController")
public class RTGSController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RTGSController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int fAccNo=Integer.parseInt(request.getParameter("fAccNo"));
		int bAccNo=Integer.parseInt(request.getParameter("bAccNo"));
		int bIFSCCode=Integer.parseInt(request.getParameter("bIFSCCode"));
		String bAccType=request.getParameter("bAccType");
		float amt=Float.parseFloat(request.getParameter("amt"));
		String remark=request.getParameter("remark");
	
		//to set model class
		RTGSModel rm=new RTGSModel(fAccNo, bAccNo, bIFSCCode, bAccType, amt, remark);
		
		System.out.println(rm);
		RTGSDao rtgs=new RTGSDao();
		
		//to validate acc no
		boolean result=rtgs.validate(rm);
		if(result==true)
		{
			System.out.println("AccNo verified");
		}
		else
		{
			System.out.println("AccNo not verified");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
