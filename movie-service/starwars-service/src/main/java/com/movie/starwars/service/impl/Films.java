package com.movie.starwars.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.movie.starwars.dto.FilmsDTO;
import com.movie.starwars.dto.ResponseDTO;
import com.movie.starwars.dto.VehiclesDTO;
import com.movie.starwars.service.Starwars;
import com.movie.starwars.utils.ResponseUtil;

@Component
public class Films implements Starwars {

	private static final Logger logger = LoggerFactory.getLogger(Films.class);
	
	@Autowired
    @Qualifier("filmsDto")
    private List<FilmsDTO> filmsList;
	
	
	@Autowired
	ResponseUtil responseUtil;
	
	@Override
	public Optional<ResponseDTO> searchhDataUsingParams(String type, String name) 
	{

		ArrayList<String> responseFilmsDTO = new ArrayList<String>();
		
		for(FilmsDTO f : filmsList)
    	{
    		if(f.getTitle().equalsIgnoreCase(name))
    		{
    			responseFilmsDTO.add(f.getTitle());
    		}
    	}
		
		return responseUtil.createResponse(type, name, responseFilmsDTO);
		
	}

}
