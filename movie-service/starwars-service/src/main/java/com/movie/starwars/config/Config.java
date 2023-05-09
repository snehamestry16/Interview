package com.movie.starwars.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.movie.starwars.dto.FilmsDTO;
import com.movie.starwars.dto.PeopleDTO;
import com.movie.starwars.dto.VehiclesDTO;

@Configuration
public class Config 
{
	
	private final static Logger logger = LoggerFactory.getLogger(Config.class);

	@Autowired
    ResourceLoader resourceLoader;
	
	@Bean(name="filmsDto")
    public List<FilmsDTO> filmsDataMapping() throws IOException {
		
		Resource resource = resourceLoader.getResource("classpath:FilmsData.txt");
		InputStream input = resource.getInputStream();
		File file = resource.getFile();
		
		CsvMapper csvMapper = new CsvMapper();

        CsvSchema csvSchema = csvMapper.typedSchemaFor(FilmsDTO.class)
						                .withHeader().withColumnSeparator('~').withComments();

        MappingIterator<FilmsDTO> itr = csvMapper.readerWithTypedSchemaFor(FilmsDTO.class)
                											.with(csvSchema).readValues(file);
        List<FilmsDTO> filmsList = itr.readAll();
        
    	return filmsList;
    }
	
	
	@Bean(name="vehiclesDto")
    public List<VehiclesDTO> vehiclesDataMapping() throws IOException {
    	

		
		Resource resource = resourceLoader.getResource("classpath:VehiclesData.txt");
		InputStream input = resource.getInputStream();
		File file = resource.getFile();
		
		CsvMapper csvMapper = new CsvMapper();
        CsvSchema csvSchema = csvMapper.typedSchemaFor(VehiclesDTO.class)
						                .withHeader().withColumnSeparator('~').withComments();

        MappingIterator<VehiclesDTO> itr = csvMapper.readerWithTypedSchemaFor(VehiclesDTO.class)
                											.with(csvSchema).readValues(file);
        List<VehiclesDTO> vehiclesList = itr.readAll();
        
    	return vehiclesList;
    }
	
	@Bean(name="peopleDto")
    public List<PeopleDTO> peopleDataMapping() throws IOException {
		
		Resource resource = resourceLoader.getResource("classpath:PeopleData.txt");
		InputStream input = resource.getInputStream();
		File file = resource.getFile();
		
		CsvMapper csvMapper = new CsvMapper();

        CsvSchema csvSchema = csvMapper.typedSchemaFor(PeopleDTO.class)
						                .withHeader().withColumnSeparator('~').withComments();

        MappingIterator<PeopleDTO> itr = csvMapper.readerWithTypedSchemaFor(PeopleDTO.class)
                											.with(csvSchema).readValues(file);
        List<PeopleDTO> peopleList = itr.readAll();
        
    	return peopleList;
    }
	
	

}
