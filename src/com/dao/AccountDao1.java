package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Account;
import com.model.Customer;

public class AccountDao1 {
	

	Connection con;
	PreparedStatement ps,ps1;
	ResultSet rs1;
	public Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public int openAccount(Account a,int custId)
	{	
		con=getConnection();
		int i=0,accNo=0;
		try {
			System.out.println("hi");
			ps=con.prepareStatement("insert into accountDetails values(sq1.nextval,?,?,?)");
			
			ps.setString(1,a.getAccount_type());
			ps.setFloat(2,a.getAccount_balance());
			ps.setInt(3,custId);
			i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("inserted succesfully");
				ps1=con.prepareStatement("SELECT accNo from accountDetails WHERE custId=?");
				ps1.setInt(1,custId);
				rs1=ps1.executeQuery();
				
				if(rs1.next()) {
					accNo=rs1.getInt(1);
				}
				else 
				{
					return -1;
				}
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return accNo;
	}
	
	public int openCustomer(Customer c)
	{	
		con=getConnection();
		int i=0;
		try {
			System.out.println("hi");
			ps=con.prepareStatement("insert into customer1 values(?,?)");
			
			ps.setInt(1,c.getCustId());
			ps.setString(2,c.getCustName());
			
			i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("inserted into customer succesfully");
			}
			else 
			{
				System.out.println("Not inserted in customer");
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}
}