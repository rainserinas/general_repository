package PackageOne;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class DBconnection {

	Connection con;

	
	public DBconnection(){
		 
try{
			
			String driver1 = "sun.jdbc.odbc.JdbcOdbcDriver";
			Class.forName(driver1);
			
			String db1 = "jdbc:odbc:payrolldb";
			
			con = DriverManager.getConnection(db1);
			
			
			
		}catch(Exception exp){
			JOptionPane.showMessageDialog(null, "hi");
		}
		
	}
}
