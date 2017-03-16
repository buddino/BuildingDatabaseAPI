package it.cnit.gaia.buildingdb;

public class GatewayByIdResultDTO {
	String result;
	GatewayDTO item;
	String error;

	public String getError() {
		return error;
	}

	public GatewayByIdResultDTO setError(String error) {
		this.error = error;
		return this;
	}

	public String getResult() {
		return result;
	}

	public GatewayByIdResultDTO setResult(String result) {
		this.result = result;
		return this;
	}

	public GatewayDTO getItem() {
		return item;
	}

	public GatewayByIdResultDTO setItem(GatewayDTO item) {
		this.item = item;
		return this;
	}
}
