package com.emp;

import java.sql.*;

public class UpdateEmpTbl {

	public static void main(String[] args) throws SQLException{
		
		try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudop", "root", "Bikash@12345");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM Emp");
             
            String str = "UPDATE Emp SET name = 'Prakash' WHERE EmpId = 1";
            st.executeUpdate(str);
            System.out.println("Updated");
            
        } catch(Exception e){
            e.printStackTrace();
        }

	}

}
