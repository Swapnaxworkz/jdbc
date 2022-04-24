package com.xworkz.games.dto;

public class GamesDTO {

	
	private int id;
	private String gameName; 
	private int noOfPlayers;
	private String type;
	
	public GamesDTO() {
		
	}
	
	public GamesDTO(int id, String gameName, int noOfPlayers, String type) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.noOfPlayers = noOfPlayers;
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
