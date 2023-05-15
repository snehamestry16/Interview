package com.movie.starwars.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	public Optional<ResponseDTO> searchhDataUsingParams(String type, String name) 
	{

		List<String> sortedFilmsList = peopleList.stream()
				.filter(x -> x.getName().trim().equalsIgnoreCase(name))
				.map(v -> v.getFilms())
				.flatMap(Pattern.compile(",")::splitAsStream)
				.collect(Collectors.toList());

		List<String> responseFilmsDTO = filmsList.stream()
			.filter(fl -> sortedFilmsList.stream().anyMatch(f -> f.trim().equalsIgnoreCase(fl.getUrl())))
			.map(x -> x.getTitle())
			.collect(Collectors.toList());
		
		
		responseFilmsDTO.forEach(System.out::println);

		return responseUtil.createResponse(type, name, responseFilmsDTO);
		
    	
	}
	
}
