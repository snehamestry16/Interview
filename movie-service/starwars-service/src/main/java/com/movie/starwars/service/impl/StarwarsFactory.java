package com.movie.starwars.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import com.movie.starwars.service.Starwars;


@Component
public class StarwarsFactory
{
	@Autowired
	private List<Starwars> starwars;

	private static final HashMap<Class, Starwars> starwarsHashMap = new HashMap<>();


	@PostConstruct
	public void initStarwarsFactory() {
		for (Starwars s : starwars) {
			starwarsHashMap.put(s.getClass(), s);
		}
	}

	public static Starwars getStarwarsInstance(String type) {
		return starwarsHashMap.get(starwarsHashMap.keySet().stream()
				.filter(starwarsClass -> starwarsClass.getSimpleName().equalsIgnoreCase(type))
				.findFirst()
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "starwars Class not found")));
	}

}
