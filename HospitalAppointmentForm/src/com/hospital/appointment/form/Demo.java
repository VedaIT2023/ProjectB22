package com.hospital.appointment.form;
import java.sql.*;
import java.util.Scanner; 

class Demo {

	public static void main(String[] args) {

 		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/doctordetails","root","Balaji3004....#@");  

		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from doctor_details");  
		while(rs.next())  
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
 		
		}   
		    }
		
	
