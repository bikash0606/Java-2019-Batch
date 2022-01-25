

import java.sql.*;

public class InsertEmpTbl {
    public static void main(String[] args) throws SQLException{
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudop", "root", "Bikash@12345");

            Statement st = con.createStatement();

            String query = "INSERT INTO Emp(`EmpId`,`name`,`address`,`age`) VALUES (4,'Suresh','Parbat',32)";
            
            int rows = st.executeUpdate(query);
             
             System.out.println("affected row="+rows);
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
