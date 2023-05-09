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
import com.movie.starwars.dto.PeopleDTO;
import com.movie.starwars.dto.ResponseDTO;
import com.movie.starwars.dto.VehiclesDTO;
import com.movie.starwars.service.Starwars;
import com.movie.starwars.utils.ResponseUtil;

@Component
public class People implements Starwars {
	
	private static final Logger logger = LoggerFactory.getLogger(People.class);
	
	@Autowired
    @Qualifier("peopleDto")
    private List<PeopleDTO> peopleList;
	
	@Autowired
    @Qualifier("filmsDto")
    private List<FilmsDTO> filmsList;
	
	@Autowired
	ResponseUtil responseUtil;
	
	
	@Override
	public Optional<ResponseDTO> searchhDataUsingParams(String type, String name) {

    	String[] peopleResponseData = null;
    	ArrayList<String> responseFilmsDTO = new ArrayList<String>();
    	
    	for(PeopleDTO p : peopleList)
    	{
    		if(p.getName().trim().equalsIgnoreCase(name.trim()))
    		{
    			peopleResponseData = p.getFilms().split(",");
    		}
    	}
    	
    	if(peopleResponseData != null)
    	{
    		for(FilmsDTO f : filmsList) 
        	{
        		for(String s : peopleResponseData) 
        		{
        			if(f.getUrl().equalsIgnoreCase(s.trim())) 
            		{
            			responseFilmsDTO.add(f.getTitle());
            			break;
            		} 
        		}
        	}
    	}
	
    	return responseUtil.createResponse(type, name, responseFilmsDTO);
	}
	
}
