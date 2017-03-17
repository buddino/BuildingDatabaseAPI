package it.cnit.gaia.buildingdb;

import java.util.List;

public class AreasResultDTO {
	String result;
	List<AreaDTO> items;
	String error;

	public String getError() {
		return error;
	}

	public AreasResultDTO setError(String error) {
		this.error = error;
		return this;
	}
	public String getResult() {
		return result;
	}

	public AreasResultDTO setResult(String result) {
		this.result = result;
		return this;
	}

	public List<AreaDTO> getItems() {
		return items;
	}

	public AreasResultDTO setItems(List<AreaDTO> items) {
		this.items = items;
		return this;
	}
}
