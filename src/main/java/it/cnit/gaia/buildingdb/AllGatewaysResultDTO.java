package it.cnit.gaia.buildingdb;

import java.util.List;

public class AllGatewaysResultDTO {
	String result;
	List<GatewayDTO> items;
	String error;

	public String getError() {
		return error;
	}

	public AllGatewaysResultDTO setError(String error) {
		this.error = error;
		return this;
	}

	public String getResult() {
		return result;
	}

	public AllGatewaysResultDTO setResult(String result) {
		this.result = result;
		return this;
	}

	public List<GatewayDTO> getItems() {
		return items;
	}

	public AllGatewaysResultDTO setItems(List<GatewayDTO> items) {
		this.items = items;
		return this;
	}
}
