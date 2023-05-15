package com.movie.starwars.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"name","model","manufacturer","costInCredits","length","maxAtmospheringSpeed","crew","passengers","cargoCapacity","consumables","vehicleClass", "pilots", "films","created","edited","url"})
public class VehiclesDTO {

	private String name;
	private String model;
	private String manufacturer;
	private String costInCredits; 
	private String length; 
	private String maxAtmospheringSpeed; 
	private String crew; 
	private String passengers; 
	private String cargoCapacity; 
	private String consumables; 
	private String vehicleClass; 
	private String pilots;
	private String films; 
	private String created; 
	private String edited; 
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCostInCredits() {
		return costInCredits;
	}
	public void setCostInCredits(String costInCredits) {
		this.costInCredits = costInCredits;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getMaxAtmospheringSpeed() {
		return maxAtmospheringSpeed;
	}
	public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
		this.maxAtmospheringSpeed = maxAtmospheringSpeed;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	public String getPassengers() {
		return passengers;
	}
	public void setPassengers(String passengers) {
		this.passengers = passengers;
	}
	public String getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(String cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public String getConsumables() {
		return consumables;
	}
	public void setConsumables(String consumables) {
		this.consumables = consumables;
	}
	public String getVehicleClass() {
		return vehicleClass;
	}
	public void setVehicleClass(String vehicleClass) {
		this.vehicleClass = vehicleClass;
	}
	public String getPilots() {
		return pilots;
	}
	public void setPilots(String pilots) {
		this.pilots = pilots;
	}
	public String getFilms() {
		return films;
	}
	public void setFilms(String films) {
		this.films = films;
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
		return "VehiclesDTO [name=" + name + ", model=" + model + ", manufacturer=" + manufacturer + ", costInCredits="
				+ costInCredits + ", length=" + length + ", maxAtmospheringSpeed=" + maxAtmospheringSpeed + ", crew="
				+ crew + ", passengers=" + passengers + ", cargoCapacity=" + cargoCapacity + ", consumables="
				+ consumables + ", vehicleClass=" + vehicleClass + ", pilots=" + pilots + ", films=" + films
				+ ", created=" + created + ", edited=" + edited + ", url=" + url + "]";
	}

	
	
	
	
	
	




}
