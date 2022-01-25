package com.emp;

import java.sql.*;

public class ReadEmpTbl {

	public static void main(String[] args) throws SQLException{
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudop", "root", "Bikash@12345");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Emp");
             
             System.out.println("ID"+ "\t"+" Name " + "\t"+" Address "+"\t"+ " Age");
             while(rs.next()) {
                System.out.println(rs.getInt(1)+ "\t"+ rs.getString(2)+ "\t"+ rs.getString(3)+"\t" + rs.getInt(4));
             }
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}