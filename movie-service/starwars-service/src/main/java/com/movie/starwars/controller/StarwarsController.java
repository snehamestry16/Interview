package com.movie.starwars.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie.starwars.dto.ResponseDTO;
import com.movie.starwars.service.StarwarsService;
import com.movie.starwars.utils.ValidationUtil;

@RestController
public class StarwarsController {

	private static final Logger logger = LoggerFactory.getLogger(StarwarsController.class);

	@Autowired
	StarwarsService starwarService;

	/*
	 * @RequestMapping(value = "/testAPI", method = RequestMethod.GET) public String
	 * testAPI() { return "OK"; }
	 */


	@RequestMapping(value="/getData", method = RequestMethod.GET) 
	public ResponseEntity<?> getData(@RequestParam(name = "type") String type, @RequestParam(name = "name") String name) {


		if(ValidationUtil.validateType(type))
		{
			Optional<ResponseDTO> response = starwarService.searchhData(type, name);

			if (response.isPresent())
				return new ResponseEntity<>(response.get(), HttpStatus.OK);
			else
				return new ResponseEntity<>("Data not found with type: " + type + ", name: " + name, HttpStatus.NOT_FOUND);
		}
		else

			return new ResponseEntity<>("The Type is invalid. The valid types are planets, spaceships, vehicles, people, films and species." , HttpStatus.NOT_FOUND);



	}


}
