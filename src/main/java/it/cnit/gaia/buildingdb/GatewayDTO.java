package it.cnit.gaia.buildingdb;

public class GatewayDTO {
	String name;
	Long id;
	Long building_id;
	String description;
	String producer;
	String uri_resource;
	String json;

	public String getName() {
		return name;
	}

	public GatewayDTO setName(String name) {
		this.name = name;
		return this;
	}

	public Long getId() {
		return id;
	}

	public GatewayDTO setId(Long id) {
		this.id = id;
		return this;
	}

	public Long getBuilding_id() {
		return building_id;
	}

	public GatewayDTO setBuilding_id(Long building_id) {
		this.building_id = building_id;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public GatewayDTO setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getProducer() {
		return producer;
	}

	public GatewayDTO setProducer(String producer) {
		this.producer = producer;
		return this;
	}

	public String getUri_resource() {
		return uri_resource;
	}

	public GatewayDTO setUri_resource(String uri_resource) {
		this.uri_resource = uri_resource;
		return this;
	}

	public String getJson() {
		return json;
	}

	public GatewayDTO setJson(String json) {
		this.json = json;
		return this;
	}
}
