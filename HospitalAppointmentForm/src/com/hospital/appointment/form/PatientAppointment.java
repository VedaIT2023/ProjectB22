package com.hospital.appointment.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PatientAppointment {
	
	public static void main(String[] args) {
	
	try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/doctordetails","root","Balaji3004....#@");  

        Statement stmt = con.createStatement();  
        stmt.executeUpdate("insert into patient_details (patient_id,p_name,age,problem,email,gender,phone_number) values(1,'balaji',23,'head','balaji@gmail.com','m','7671850933')");

        ResultSet rs=stmt.executeQuery("select * from patient_details");  
        while(rs.next())  
        	
        	System.out.println(rs.getInt(1)+" "+rs.getString(2));
        con.close();  
    } catch(Exception e){ 
        System.out.println(e);
    }  
}
}
