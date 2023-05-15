package com.movie.starwars.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyAgreementSpi.X25519;
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

		
		List<String> sortedFilmsList = vehiclesList.stream()
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
