package it.cnit.gaia.buildingdb;

import org.apache.commons.lang.builder.ToStringBuilder;

public class BuildingDTO extends AreaDTO {
	Double sqmt;
	Long people;
	String country;

	public Long getId() {
		return id;
	}

	public BuildingDTO setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public BuildingDTO setName(String name) {
		this.name = name;
		return this;
	}

	public Double getSqmt() {
		return sqmt;
	}

	public BuildingDTO setSqmt(Double sqmt) {
		this.sqmt = sqmt;
		return this;
	}

	public Long getPeople() {
		return people;
	}

	public BuildingDTO setPeople(Long people) {
		this.people = people;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public BuildingDTO setCountry(String country) {
		this.country = country;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("id", id)
				.append("name", name)
				.append("sqmt", sqmt)
				.append("people", people)
				.append("country", country)
				.toString();
	}




}
