package com.gomaa.connctiondb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conndb {
	public conndb() {
		show();
	}
	public void show() {
		String user="root";
		String password="";
		String url="jdbc:mysql/localhost/go";
		try {
			Connection c=DriverManager.getConnection(url, user, password);
			System.out.println("ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		}

}
