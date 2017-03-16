package it.cnit.gaia.buildingdb;

import org.apache.commons.lang.builder.ToStringBuilder;

public class AreaDTO {
	String name;
	Long id;
	String description;
	String type;
	Object json;

	public String getName() {
		return name;
	}

	public AreaDTO setName(String name) {
		this.name = name;
		return this;
	}

	public Long getId() {
		return id;
	}

	public AreaDTO setId(Long id) {
		this.id = id;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public AreaDTO setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getType() {
		return type;
	}

	public AreaDTO setType(String type) {
		this.type = type;
		return this;
	}

	public Object getJson() {
		return json;
	}

	public AreaDTO setJson(Object json) {
		this.json = json;
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("name", name)
				.append("id", id)
				.append("description", description)
				.append("type", type)
				.append("json", json)
				.toString();
	}
}
