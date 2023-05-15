package com.movie.starwars.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.movie.starwars.dto.ResponseDTO;
import com.movie.starwars.service.StarwarsService;

@Service
public class StarwarsServiceImpl implements StarwarsService 
{
	private static final Logger logger = LoggerFactory.getLogger(StarwarsServiceImpl.class);
	
	@Override
	public Optional<ResponseDTO> searchhData(String type, String name) 
	{			
		 return StarwarsFactory.getStarwarsInstance(type).searchhDataUsingParams(type, name);
	}
}
