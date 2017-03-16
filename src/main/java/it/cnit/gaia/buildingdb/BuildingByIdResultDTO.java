package it.cnit.gaia.buildingdb;

public class BuildingByIdResultDTO {
	String result;
	BuildingDTO item;
	String error;

	public String getError() {
		return error;
	}

	public BuildingByIdResultDTO setError(String error) {
		this.error = error;
		return this;
	}

	public String getResult() {
		return result;
	}

	public BuildingByIdResultDTO setResult(String result) {
		this.result = result;
		return this;
	}

	public BuildingDTO getItem() {
		return item;
	}

	public BuildingByIdResultDTO setItem(BuildingDTO item) {
		this.item = item;
		return this;
	}
}
