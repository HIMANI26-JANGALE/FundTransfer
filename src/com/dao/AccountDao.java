package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.Account;
public class AccountDao {
	Connection con;
	PreparedStatement ps;
	public Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","hrj13112001");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public int savedData(List<Account> lst){
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
	
	
	
}
