package com.movie.starwars.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"title", "episodeId", "openingCrawl", "director", "producer", "releaseDate", "characters", "planets", "starships", "vehicles", "species", "created", "edited", "url"})
public class FilmsDTO 
{
	private String title;
	private String episodeId;
	private String openingCrawl;
	private String director;
	private String producer;
	private String releaseDate;
	private String characters;
	private String planets;
	private String starships;
	private String vehicles;
	private String species;
	private String created;
	private String edited;
	private String url;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEpisodeId() {
		return episodeId;
	}
	public void setEpisodeId(String episodeId) {
		this.episodeId = episodeId;
	}
	public String getOpeningCrawl() {
		return openingCrawl;
	}
	public void setOpeningCrawl(String openingCrawl) {
		this.openingCrawl = openingCrawl;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCharacters() {
		return characters;
	}
	public void setCharacters(String characters) {
		this.characters = characters;
	}
	public String getPlanets() {
		return planets;
	}
	public void setPlanets(String planets) {
		this.planets = planets;
	}
	public String getStarships() {
		return starships;
	}
	public void setStarships(String starships) {
		this.starships = starships;
	}
	public String getVehicles() {
		return vehicles;
	}
	public void setVehicles(String vehicles) {
		this.vehicles = vehicles;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
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
		return "FilmsDTO [title=" + title + ", episodeId=" + episodeId + ", openingCrawl=" + openingCrawl
				+ ", director=" + director + ", producer=" + producer + ", releaseDate=" + releaseDate + ", characters="
				+ characters + ", planets=" + planets + ", starships=" + starships + ", vehicles=" + vehicles
				+ ", species=" + species + ", created=" + created + ", edited=" + edited + ", url=" + url + "]";
	}
	
	
	
	

}
