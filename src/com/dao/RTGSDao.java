package com.dao;

import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.model.Account;
import com.model.Branch;

//import com.model.Account;
import com.model.RTGSModel;



public class RTGSDao {
	PreparedStatement ps;
	Connection con;
	ResultSet rs;
	
	public Connection getConnection() {
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","hrj13112001");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	/*public int savedDataBranch(List<Branch> lst){
		Branch r=lst.get(0);
		Connection con = getConnection();
		int i = 0;
		/*try {
			ps=con.prepareStatement("insert into branch values(?,?,?,?)");
			ps.setInt(1, r.getIfsc_code());
			ps.setString(2,r.getBranch_name());
			ps.setString(3, r.getBranch_code());
			ps.setFloat(4, r.getBranch_bal());
			i=ps.executeUpdate();
			con.close();
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return i;
	}
	public int savedDataCustomer(List<Application> lst){
		Application r=lst.get(0);
		Connection con = getConnection();
		int i = 0;
		try {
			ps=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, r.getcust_id());
			ps.setString(2,r.getBranch_name());
			ps.setString(3,r.getAccount_type());
			ps.setString(4,r.getSurname());
			ps.setString(5,r.getFirtsname());
			ps.setString(6,r.getMiddlename());
			ps.setString(7,r.getDate());
			ps.setString(8,r.getMother_name());

			ps.setString(9,r.getEmail());
			ps.setString(10,r.getMobile_no());
			ps.setString(11,r.getNationality());
			ps.setString(12,r.getOccupation());
			ps.setString(13,r.getCity());
			ps.setString(14,r.getState());
			ps.setString(15,r.getDistrict());
			ps.setInt(16,r.getPincode());
			ps.setString(17,r.getAadhar_no());
			ps.setInt(18,r.getPan_no());
			i=ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return i;
	
	}

	public int savedDataAccount(List<Account> lst){
		Account a=lst.get(0);
		con=getConnection();
		int i=0;
		try {
			System.out.println("hi");
			ps=con.prepareStatement("insert into account values(?,?,?,?,?,?,?,?)");
			ps.setLong(1,a.getAccount_no());
			ps.setFloat(2,a.getAccount_balance());
			ps.setInt(3,a.getCust_id());
			ps.setString(4, a.getBranch_name());
			ps.setInt(5,a.getBranch_code());
			ps.setInt(6, a.getIfsc_code());
			ps.setInt(7, a.getMicr_code());
			ps.setString(8, a.getAccount_type());
			System.out.println("hello");
			i=ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	
	}

	}*/
	public boolean validate(RTGSModel rm)
	{
		boolean result=false;
		//Login l=lst.get(0);
		con=getConnection();
		try {
			ps=con.prepareStatement("SELECT account_no FROM account WHERE account_no=?");
			ps.setInt(1,rm.getfAccNo());
			//ps.setString(2, l.getPwd());
			
			rs=ps.executeQuery();
			if(rs.next()) 
			{
				System.out.println("Result set found...");
				result=true;
			}
			else 
			{
				result=false;
			}
			
			
	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
