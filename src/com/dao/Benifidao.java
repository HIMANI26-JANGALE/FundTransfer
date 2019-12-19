package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

import com.model.Benificiary;


public class Benifidao {
	
	private static Connection con;
	private PreparedStatement ps;
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:XE";
	private String userName="System";
	private String password="hrj13112001";
	public Connection getConnection(){
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("COnnection :"+con);
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	public int saveData(List<Benificiary> lst){
		int i=0;
		System.out.println("save..1");
		con=getConnection();
		System.out.println("save..2");
		Benificiary r=(Benificiary)lst.get(0);
		try{
			ps=con.prepareStatement("insert into beneficiary values(?,?,?,?,?,?)");
			ps.setInt(1,r.getBenfiNo());
			ps.setInt(2,r.getAccNo() );
			ps.setString(3, r.getAccType());
			ps.setInt(4, r.getIfscNo());
			ps.setString(5, r.getBenefiName());
			ps.setString(6, r.getEmailId());
			i=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i;
	}

}

