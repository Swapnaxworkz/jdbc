package com.xworkz.app;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {

	int id;
	String name;

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "root");

			preparedStatement = con
					.prepareStatement("create table Application(" + "app_id int(5)," + " app_name clob not null");

			preparedStatement = con.prepareStatement("insert into Application values(?,?)");

			preparedStatement.setString(1, "app_id");
			preparedStatement.setString(2, " app_name");

			// Read a source file

			FileReader file = new FileReader("C:\\Users\\cw\\Desktop\\File.txt\\FileHandling");

			preparedStatement.setCharacterStream(1, file);
			preparedStatement.execute();
			System.out.println("file stores successfully");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {

			}
		}

	}
}
