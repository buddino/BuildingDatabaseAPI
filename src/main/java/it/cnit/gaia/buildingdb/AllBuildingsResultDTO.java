package it.cnit.gaia.buildingdb;

import java.util.List;

public class AllBuildingsResultDTO {
	String result;
	List<BuildingDTO> items;
	String error;

	public String getError() {
		return error;
	}

	public AllBuildingsResultDTO setError(String error) {
		this.error = error;
		return this;
	}
	public String getResult() {
		return result;
	}

	public AllBuildingsResultDTO setResult(String result) {
		this.result = result;
		return this;
	}

	public List<BuildingDTO> getItems() {
		return items;
	}

	public AllBuildingsResultDTO setItems(List<BuildingDTO> items) {
		this.items = items;
		return this;
	}
}
