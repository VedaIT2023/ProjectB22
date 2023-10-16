package com.hospital.appointment.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class Properties {

    public HashMap<Integer, DoctorProperties> getDoctors() {
        HashMap<Integer, DoctorProperties> doctors = new HashMap();

        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/doctordetails","root","Balaji3004....#@");  

            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from doctor_details");  
            while(rs.next())  
               // System.out.println("\nDoctor ID: "+rs.getInt(1)+"\nDoctor Name: "+rs.getString(2)+"\nSpecialisation: "+rs.getString(3));
            doctors.put(rs.getInt(1), new DoctorProperties(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getString(10)));

            con.close();  
        } catch(Exception e){ 
            System.out.println(e);
        }  

        return doctors;
    }
}
