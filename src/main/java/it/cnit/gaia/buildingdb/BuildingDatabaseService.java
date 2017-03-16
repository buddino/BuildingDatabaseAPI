package it.cnit.gaia.buildingdb;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO Make API
public class BuildingDatabaseService {

	RestTemplate restTemplate = new RestTemplate();
	final String baseURL;

	public String getBaseURL() {
		return baseURL;
	}

	public BuildingDatabaseService(String baseURL) {
		this.baseURL = baseURL;
	}

	public BuildingDatabaseService() {
		baseURL = "http://150.140.5.64:8080/GaiaAnalytics/gaia/";
	}

	public BuildingDTO getBuildingById(Long id) throws BuildingDatabaseException {
		String uri = baseURL + "utility/buildings/getbyid/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(id));
		BuildingByIdResultDTO result = restTemplate.getForObject(uri, BuildingByIdResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItem();
	}

	public List<BuildingDTO> getBuildings() throws BuildingDatabaseException {
		String uri = baseURL + "utility/buildings/getall";
		AllBuildingsResultDTO result = restTemplate.getForObject(uri, AllBuildingsResultDTO.class);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItems();
	}

	public List<AreaDTO> getAreas(Long buildingId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/areas/getall/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(buildingId));
		AllAreasResultDTO result = restTemplate.getForObject(uri, AllAreasResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItems();
	}

	public AreaDTO getAreaById(Long areaId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/areas/getbyid/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(areaId));
		AreaByIdResultDTO result = restTemplate.getForObject(uri, AreaByIdResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItem();
	}

	public List<GatewayDTO> getGateways(Long buildingId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/gateways/getbyid/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(buildingId));
		AllGatewaysResultDTO result = restTemplate.getForObject(uri, AllGatewaysResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItems();
	}

	public GatewayDTO getGatewayById(Long gwId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/gateways/getbyid/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(gwId));
		GatewayByIdResultDTO result = restTemplate.getForObject(uri, GatewayByIdResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItem();
	}


}
