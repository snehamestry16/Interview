package com.movie.starwars.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseDTO {

	private String type;
	private Integer count;
	private String name;
	private List<String> films;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFilms() {
		return films;
	}
	public void setFilms(List<String> films) {
		this.films = films;
	}
	@Override
	public String toString() {
		return "ResponseDTO [type=" + type + ", count=" + count + ", name=" + name + "]";
	}
	
	
	
	
	
}
