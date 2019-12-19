package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AccountDao;

import com.model.Account;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 List<Account> lst=null;
	   	public void init()
	   	{
	   		lst=new LinkedList<Account>();
	   	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountController() {
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
		int account_no=Integer.parseInt(request.getParameter("account_no"));
		Float account_balance=Float.parseFloat(request.getParameter("account_balance"));
		int cust_id=Integer.parseInt(request.getParameter("cust_id"));
		String branch_name=request.getParameter("branch_name");
		int branch_code=Integer.parseInt(request.getParameter("branch_code"));
		int ifsc_code=Integer.parseInt(request.getParameter("ifsc_code"));
		int micr_code=Integer.parseInt(request.getParameter("micr_code"));
		String account_type=request.getParameter("account_type");
		Account rm=new Account();
		rm.setAccount_no(account_no);
		rm.setAccount_balance(account_balance);
		rm.setCust_id(cust_id);
		rm.setBranch_name(branch_name);
		rm.setBranch_code(branch_code);
		rm.setIfsc_code(ifsc_code);
		rm.setMicr_code(micr_code);
		//rm.setMother_name(s8);
		rm.setAccount_type(account_type);
		
		List lst=new ArrayList<Account>();
		lst.add(rm);
		AccountDao rd=new AccountDao();
		PrintWriter pw=response.getWriter();
		int i=rd.savedData(lst);
		if(i>0)
		{
			pw.print("inserted successfully");
		}
	}
	}


