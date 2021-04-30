package com.Exceptions.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SqlException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=DriverManager.getConnection(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
