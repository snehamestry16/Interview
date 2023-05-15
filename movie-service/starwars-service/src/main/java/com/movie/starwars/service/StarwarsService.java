package com.movie.starwars.service;

import java.util.Optional;

import com.movie.starwars.dto.ResponseDTO;

public interface StarwarsService {
	
	public Optional<ResponseDTO> searchhData(String type, String name);
	
}
