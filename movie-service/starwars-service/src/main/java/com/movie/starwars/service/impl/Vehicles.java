package com.movie.starwars.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.movie.starwars.dto.FilmsDTO;
import com.movie.starwars.dto.ResponseDTO;
import com.movie.starwars.dto.VehiclesDTO;
import com.movie.starwars.service.Starwars;
import com.movie.starwars.utils.ResponseUtil;
import com.movie.starwars.utils.ValidationUtil;

@Component
public class Vehicles implements Starwars {


	@Autowired
    @Qualifier("vehiclesDto")
    private List<VehiclesDTO> vehiclesList;
	
	@Autowired
    @Qualifier("filmsDto")
    private List<FilmsDTO> filmsList;
	
	@Autowired
	ResponseUtil responseUtil;
	
	
	@Override
	public Optional<ResponseDTO> searchhDataUsingParams(String type, String name) {

    	String[] filmsResponseData = null;
    	ArrayList<String> responseFilmsDTO = new ArrayList<String>();
    	
    	for(VehiclesDTO v : vehiclesList)
    	{
    		if(v.getName().equalsIgnoreCase(name))
    		{
    			//get film url from vehicle
    			filmsResponseData = v.getFilms().split(",");
    		}
    	}
    	
    	if(filmsResponseData != null)
    	{
    		for(FilmsDTO f : filmsList) 
        	{
        		for(String s : filmsResponseData) 
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
