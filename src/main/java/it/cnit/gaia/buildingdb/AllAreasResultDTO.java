package it.cnit.gaia.buildingdb;

import java.util.List;

public class AllAreasResultDTO {
	String result;
	List<AreaDTO> items;
	String error;

	public String getError() {
		return error;
	}

	public AllAreasResultDTO setError(String error) {
		this.error = error;
		return this;
	}
	public String getResult() {
		return result;
	}

	public AllAreasResultDTO setResult(String result) {
		this.result = result;
		return this;
	}

	public List<AreaDTO> getItems() {
		return items;
	}

	public AllAreasResultDTO setItems(List<AreaDTO> items) {
		this.items = items;
		return this;
	}
}
