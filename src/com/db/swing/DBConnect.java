package com.db.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3309/swingdb";
		String userName= "root";
		String password= "Sushii@12";
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn= DriverManager.getConnection(url, userName, password);
}
catch(SQLException e){
	System.out.println(e.getMessage());
	System.out.println("sql query exception");
}catch(ClassNotFoundException e){
	System.out.println(e.getMessage());
	System.out.println("error in class");
}
if(conn!=null) {
	System.out.println("established");
}
else {
	System.out.println("connection not established");
}
return conn;
}
}

	
