package com.vedait.Hospital.Appointment;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DoctorDetails {
    private ArrayList<Doctors> doctors = new ArrayList<>();

    public DoctorDetails() {
        initializeDoctors();
    }

    private void initializeDoctors() {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/a2z_db", "root", "Pavan@23");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from doctor_details");
            while (rs.next()) {
                doctors.add(new Doctors(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getString(10)));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public ArrayList<Doctors> getDoctorsList() {
        return doctors;
    }
}
