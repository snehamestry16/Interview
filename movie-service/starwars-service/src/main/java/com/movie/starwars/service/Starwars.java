package com.movie.starwars.service;

import java.util.Optional;

import com.movie.starwars.dto.ResponseDTO;

public interface Starwars 
{
	
	public Optional<ResponseDTO> searchhDataUsingParams(String type, String name);

}
