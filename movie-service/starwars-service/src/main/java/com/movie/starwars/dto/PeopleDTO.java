package com.movie.starwars.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name","height","mass","hairColor","skinColor","eyeColor","birthYear","gender","homeworld","films","species","vehicles","starships","created","edited","url"})
public class PeopleDTO 
{
	private String name;
	private String height;
	private String mass;
	private String hairColor;
	private String skinColor;
	private String eyeColor;
	private String birthYear;
	private String gender;
	private String homeworld;
	private String films;
	private String species;
	private String vehicles;
	private String starships;
	private String created;
	private String edited;
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getMass() {
		return mass;
	}
	public void setMass(String mass) {
		this.mass = mass;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHomeworld() {
		return homeworld;
	}
	public void setHomeworld(String homeworld) {
		this.homeworld = homeworld;
	}
	public String getFilms() {
		return films;
	}
	public void setFilms(String films) {
		this.films = films;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getVehicles() {
		return vehicles;
	}
	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}
	public String getStarships() {
		return starships;
	}
	public void setStarships(String starships) {
		this.starships = starships;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getEdited() {
		return edited;
	}
	public void setEdited(String edited) {
		this.edited = edited;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "PeopleDTO [name=" + name + ", height=" + height + ", mass=" + mass + ", hairColor=" + hairColor
				+ ", skinColor=" + skinColor + ", eyeColor=" + eyeColor + ", birthYear=" + birthYear + ", gender="
				+ gender + ", homeworld=" + homeworld + ", films=" + films + ", species=" + species + ", vehicles="
				+ vehicles + ", starships=" + starships + ", created=" + created + ", edited=" + edited + ", url=" + url
				+ ", getName()=" + getName() + ", getHeight()=" + getHeight() + ", getMass()=" + getMass()
				+ ", getHairColor()=" + getHairColor() + ", getSkinColor()=" + getSkinColor() + ", getEyeColor()="
				+ getEyeColor() + ", getBirthYear()=" + getBirthYear() + ", getGender()=" + getGender()
				+ ", getHomeworld()=" + getHomeworld() + ", getFilms()=" + getFilms() + ", getSpecies()=" + getSpecies()
				+ ", getVehicles()=" + getVehicles() + ", getStarships()=" + getStarships() + ", getCreated()="
				+ getCreated() + ", getEdited()=" + getEdited() + ", getUrl()=" + getUrl() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
