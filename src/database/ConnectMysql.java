package database;

import java.sql.Statement;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectMysql {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); // (connectivity)to load the driver ,here we have class name "Class in
												// java and
												// have a method called forName()"
		System.out.println("driver loaded");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "1234");
		System.out.println(cn);
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery("select * from Selenium_user");
		while (rs.next()) 
		{
			String firstname = rs.getString("firstname");
			System.out.println("database record is " + firstname);
		}

	}
}
