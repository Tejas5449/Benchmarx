import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class demo {
	public static void main(String[] args) {
		
			
		    try {
//				STEP -1:
				final String DRIVER = "com.mysql.cj.jdbc.Driver";
				final String URL = "jdbc:mysql://localhost:6603/contactbook";
				final String USERNAME = "root";
				final String PASSWORD = "sneha";
//				STEP -2:
				Class.forName(DRIVER);
				Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				System.out.println("Connection Successfully Established!!!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
		    
		    