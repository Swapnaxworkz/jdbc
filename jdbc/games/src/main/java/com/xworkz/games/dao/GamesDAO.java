package com.xworkz.games.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.xworkz.games.dto.GamesDTO;

public class GamesDAO {


	public static Properties LoadPropertiesFile() throws Exception{
		Properties property=new Properties();
		FileInputStream input=new FileInputStream("jdbc.properties");
		property.load(input);
		input.close();
		return property;
		}
		
		public static boolean saveGame(GamesDTO gameDTO) {
			
			if(gameDTO == null) {
				return false;
		}else {
			
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			
				try {
				connection=DriverManager.getConnection(JDB,URL,USERNAME,PASSWORD);
				preparedStatement =connection.prepareStatement("INSERT INTO games VALUES(?, ?, ?, ?)");
				
				//preparedStatement=connection.prepareStatement(insertQuery);
				
				preparedStatement.setInt(1,gameDTO.getId());
				preparedStatement.setString(2,gameDTO.getGameName());
				preparedStatement.setInt(3,gameDTO.getNoOfPlayers());
				preparedStatement.setString(4,gameDTO.getType());
				
				preparedStatement.execute();
				return true;
				
				}catch(SQLException e) {
					e.printStackTrace();
				
			}finally {
				try {
					if(preparedStatement != null)
						preparedStatement.close();
					if(connection != null)
						connection.close();
				}catch(SQLException e) {
					e.printStackTrace();		
					}
				}
			}
			return false;
		}
}
