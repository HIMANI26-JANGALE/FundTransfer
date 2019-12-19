package com.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.model.Application;
import com.model.Branch;



public class BankDao {

	
		Connection con;
		PreparedStatement ps,ps1,s;
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
		public int savedData(List<Application> lst){
			Application r=lst.get(0);
			Connection con = getConnection();
			int i = 0;
			try {
				ps=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				ps.setInt(1, r.getcust_id());
				ps.setString(2,r.getBranch_name());
				ps.setString(3,r.getAccount_type());
				ps.setString(4,r.getSurname());
				ps.setString(5,r.getFirtsname());
				ps.setString(6,r.getMiddlename());
				ps.setString(7,r.getDate());
				ps.setString(8,r.getEmail());
				ps.setString(9,r.getMobile_no());
				ps.setString(10,r.getNationality());
				ps.setString(11,r.getOccupation());
				ps.setString(12,r.getCity());
				ps.setString(13,r.getState());
				ps.setString(14,r.getDistrict());
				ps.setInt(15,r.getPincode());
				ps.setString(16,r.getAadhar_no());
				ps.setInt(17,r.getPan_no());
				i=ps.executeUpdate();
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return i;
		
	}
		public int savedData1(List<Branch> lst){
			Branch r=lst.get(0);
			Connection con = getConnection();
			int i = 0;
			try {
				ps=con.prepareStatement("insert into branch values(?,?,?,?)");
				ps.setLong(1, r.getIfsc_code());
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
		public List<Application> searchData(){
			/*Connection con =getConnection();
			List<Application> l1 = new ArrayList<Application>();
			try {
				System.out.println("errr1");
				ps=con.prepareStatement("select * from application" );
				System.out.println("errr2");
				//ps.setString(1, sno);
				ResultSet rs= ps.executeQuery();
				while(rs.next()) {
					System.out.println("errr3");
					Application apl=new Application();
					apl.setcust_id(rs.getInt(1));
					apl.setBranch_name(rs.getString(2));
					apl.setAccount_type(rs.getString(3));
					apl.setSurname(rs.getString(4));
					apl.setFirtsname(rs.getString(5));
					apl.setMiddlename(rs.getString(6));
					apl.setDate(rs.getString(7));
					apl.setEmail(rs.getString(8));
					apl.setMobile_no(rs.getString(9));
					apl.setNationality(rs.getString(10));
					apl.setOccupation(rs.getString(11));
					apl.setCity(rs.getString(12));
					apl.setState(rs.getString(13));
					apl.setDistrict(rs.getString(14));
					apl.setPincode(rs.getInt(15));
					apl.setAadhar_no(rs.getString(16));
					apl.setPan_no(rs.getInt(17));
					l1.add(apl);
				}
				
				}
				catch(SQLException e)
				{
					System.out.println("Not found");
					System.err.print(e.getMessage());;
					e.printStackTrace();
					
				}
				return l1;*/
			List<Application> lst=new LinkedList<Application>();
			Connection con =getConnection();
			try
			{
			 s=(PreparedStatement) con.createStatement
			(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
				ResultSet rs=s.executeQuery("select * from customer");
				while(rs.next())
				{
					System.out.println("hi");
					Application apl=new Application();
					
					apl.setcust_id(rs.getInt(1));
					apl.setBranch_name(rs.getString(2));
					apl.setAccount_type(rs.getString(3));
					apl.setSurname(rs.getString(4));
					apl.setFirtsname(rs.getString(5));
					apl.setMiddlename(rs.getString(6));
					apl.setDate(rs.getString(7));
					apl.setEmail(rs.getString(8));
					apl.setMobile_no(rs.getString(9));
					apl.setNationality(rs.getString(10));
					apl.setOccupation(rs.getString(11));
					apl.setCity(rs.getString(12));
					apl.setState(rs.getString(13));
					apl.setDistrict(rs.getString(14));
					apl.setPincode(rs.getInt(15));
					apl.setAadhar_no(rs.getString(16));
					apl.setPan_no(rs.getInt(17));
					lst.add(apl);
					System.out.println("cnt");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return lst;

		}
		
}


