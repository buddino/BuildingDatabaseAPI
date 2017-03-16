package it.cnit.gaia.buildingdb;

public class AreaByIdResultDTO {
	String result;
	AreaDTO item;
	String error;

	public String getError() {
		return error;
	}

	public AreaByIdResultDTO setError(String error) {
		this.error = error;
		return this;
	}

	public String getResult() {
		return result;
	}

	public AreaByIdResultDTO setResult(String result) {
		this.result = result;
		return this;
	}

	public AreaDTO getItem() {
		return item;
	}

	public AreaByIdResultDTO setItem(AreaDTO item) {
		this.item = item;
		return this;
	}
}
