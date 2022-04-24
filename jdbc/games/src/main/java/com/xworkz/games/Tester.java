package com.xworkz.games;

import com.xworkz.games.dao.GamesDAO;
import com.xworkz.games.dto.GamesDTO;

public class Tester {

	
	public static void main(String[] args) {
		GamesDTO gameDTO=new GamesDTO(7,"UNO",2,"InDoor");
		
		boolean SaveStatus=GamesDAO.saveGame(gameDTO);
		if(SaveStatus) {
			System.out.println("Saved Successfully");
		}
		else {
			System.out.println("Save UnSuccessfully");
		}
	}
}
