package com.jdbc;
import java.util.*;
import java.sql.*;
public class Main {

	private static final String url="jdbc:mysql://localhost:3306/mydb";
	
	private static final String username="root";
	
	private static final String password="Pandey111@";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			String query="select * from students";
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				double marks=rs.getDouble("marks");
				System.out.println("id "+id);
				System.out.println("name "+name);
				System.out.println("age "+age);
				System.out.println("marks "+marks);

				
			}
		}catch(SQLException e){
//			e.printStackTrace();or
			System.out.println(e.getMessage());
		}

	}

}
