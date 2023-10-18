package com.hospital.appointment.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PatientAppointmentDelete {

    public static void main(String[] args) {

        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/doctordetails","root","Balaji3004....#@");  

            Statement stmt = con.createStatement();  
            String deleteQuery = "DELETE FROM patient_details";
            
            int rowsAffected = stmt.executeUpdate(deleteQuery);
            
            if (rowsAffected > 0) {
                System.out.println("All patient details deleted successfully.");
            } else {
                System.out.println("No records found for deletion.");
            }

            ResultSet rs = stmt.executeQuery("SELECT * FROM patient_details");  
            while(rs.next())  
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            
            con.close();  
        } catch(Exception e) { 
            System.out.println(e);
        }  
    }
}
