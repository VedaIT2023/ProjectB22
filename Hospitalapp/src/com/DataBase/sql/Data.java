package com.DataBase.sql;


	import java.lang.System.Logger;
	import java.sql.*;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Scanner;

	public class Data {
			
			
			    private Connection getConnection() throws SQLException {
			        Connection con = null;
			        try {
			            Class.forName("com.mysql.cj.jdbc.Driver");
			            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root", "Pavan@23");
			        } catch (ClassNotFoundException e) {
			            e.printStackTrace();
			        }
			        return con;
			    }

			    public HashMap<Integer, DoctorDetails> getDoctors() {
			        HashMap<Integer, DoctorDetails> doc = new HashMap<Integer, DoctorDetails>();

			        try {
			            Class.forName("com.mysql.jdbc.Driver");
			            Connection con = DriverManager.getConnection(
			                    "jdbc:mysql://localhost:3306/a2z_db", "root", "Pavan@23");
			            Statement stmt = con.createStatement();
			            ResultSet rs = stmt.executeQuery("select * from doctors_details");
			            while (rs.next())
			                doc.put(rs.getInt(1), new DoctorDetails(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10)));
			            con.close();
			        } catch (Exception e) {
			            System.out.println(e);
			        }
			        return doc;
			    }

			    public void bookAppointment( String p_name, int age, String problem, String email, String gender, String phone_number) {
			        try {
			            Connection con = getConnection();
			            String insertQuery = "INSERT INTO patient_details( p_name, age, problem, email, gender, phone_number) VALUES ( ?, ?, ?, ?, ?, ?)";
			            PreparedStatement pstmt = con.prepareStatement(insertQuery);
			            pstmt.setString(2, p_name);
			            pstmt.setInt(3, age);
			            pstmt.setString(4, problem);
			            pstmt.setString(5, email);
			            pstmt.setString(6, gender);
			            pstmt.setString(7, phone_number);
			            pstmt.executeUpdate();
			            con.close();
			        } catch (SQLException e) {
			            e.printStackTrace();
			        }
			    }

			    public List<AppointmentDetails> viewAppointments() {
			        List<AppointmentDetails> appointments = new ArrayList<>();
			        try {
			            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root", "Pavan@23");
			            Statement stmt = con.createStatement();
			            ResultSet rs = stmt.executeQuery("SELECT * FROM appointment_details");
			            while (rs.next()) 

			            	System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3));
			            
			            con.close();
			        } catch (SQLException e) {
			            e.printStackTrace();
			        }
			        return appointments;
			    }

			    public void cancelAppointment(int patient_id) {
			        try {
			            Class.forName("com.mysql.cj.jdbc.Driver");
			            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a2z_db", "root", "Pavan@23");
			            Statement stmt = con.createStatement();

			            
			            String deleteQuery = "DELETE FROM patient_details WHERE patient_id = ?";
			            String deleteap = "DELETE FROM appointment_details WHERE patient_id = ?";
			            
			            
			            PreparedStatement pstmt1 = con.prepareStatement(deleteQuery);
			            PreparedStatement pstmt2 = con.prepareStatement(deleteap);

			          
			            pstmt1.setInt(1, patient_id);
			            pstmt2.setInt(1, patient_id);

			            
			            int rowsDeleted1 = pstmt1.executeUpdate();
			            int rowsDeleted2 = pstmt2.executeUpdate();

			       
			            if (rowsDeleted1 > 0 && rowsDeleted2 > 0) {
			                System.out.println("Appointment and patient details canceled successfully.");
			            } else {
			                System.out.println("No records found with the given patient_id.");
			            }

			            con.close();
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
			    }
	}






