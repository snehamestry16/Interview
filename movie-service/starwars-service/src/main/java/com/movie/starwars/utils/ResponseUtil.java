package com.movie.starwars.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.movie.starwars.dto.ResponseDTO;

@Component
public class ResponseUtil {
	
	public Optional<ResponseDTO> createResponse(String type, String name, List<String> responseFilmsDTO) {
		
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setCount(responseFilmsDTO.size());
		responseDTO.setName(name);
		responseDTO.setType(type);
		responseDTO.setFilms(responseFilmsDTO);
		return Optional.of(responseDTO);
		
	}

}
