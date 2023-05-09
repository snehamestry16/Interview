package com.movie.starwars.enums;

public enum TypeEnum {


	PLANETS("planets"), 
	SPACESHIPS("spaceships"),
	VEHICLES("vehicles"),
	PEOPLE("people"),
	FILMS("films"),
	SPECIES("species");

	private final String type;

	TypeEnum(String type) {
		this.type = type;
	}
	
	public String type(){
		return type;
	}

	
	
}
