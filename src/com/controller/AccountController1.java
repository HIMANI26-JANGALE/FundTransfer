package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AccountDao1;
import com.model.Account1;
import com.model.Customer;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/AccountController")
public class AccountController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accType=request.getParameter("accType");
		float accBal=Float.parseFloat(request.getParameter("accBal"));
		int custId=20;
		//to set model class Account
		Account1 a=new Account1(accBal, accType);
		
		//Customer c=new Customer(custId,"himani");
		AccountDao1 ad=new AccountDao1();
		Customer c=(Customer) request.getSession().getAttribute("customer");
		System.out.println(c.getCustId());
		int accNo=ad.openAccount(a,c.getCustId());
		System.out.println(accNo);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
