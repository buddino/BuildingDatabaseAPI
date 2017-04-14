package it.cnit.gaia.buildingdb;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO Make API
public class BuildingDatabaseServiceImpl implements BuildingDatabaseService {

	RestTemplate restTemplate = new RestTemplate();
	String baseURL;

	@Override
	public String getBaseURL() {
		return baseURL;
	}

	public BuildingDatabaseServiceImpl(String baseURL) {
		this.baseURL = baseURL;
	}

	public BuildingDatabaseServiceImpl() {
		baseURL = "http://150.140.5.64:8080/GaiaAnalytics/gaia/";
	}

	@Override
	public BuildingDTO getBuildingById(Long id) throws BuildingDatabaseException {
		String uri = baseURL + "utility/buildings/getbyid/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(id));
		BuildingByIdResultDTO result = restTemplate.getForObject(uri, BuildingByIdResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItem();
	}

	@Override
	public List<BuildingDTO> getBuildings() throws BuildingDatabaseException {
		String uri = baseURL + "utility/buildings/getall";
		AllBuildingsResultDTO result = restTemplate.getForObject(uri, AllBuildingsResultDTO.class);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItems();
	}

	@Override
	public List<AreaDTO> getAreas(Long buildingId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/areas/getall/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(buildingId));
		AreasResultDTO result = restTemplate.getForObject(uri, AreasResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItems();
	}

	@Override
	public AreaDTO getAreaById(Long areaId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/areas/getbyid/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(areaId));
		AreaByIdResultDTO result = restTemplate.getForObject(uri, AreaByIdResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItem();
	}

	@Override
	public List<GatewayDTO> getGateways(Long buildingId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/gateways/getbyid/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(buildingId));
		AllGatewaysResultDTO result = restTemplate.getForObject(uri, AllGatewaysResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItems();
	}

	@Override
	public GatewayDTO getGatewayById(Long gwId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/gateways/getbyid/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(gwId));
		GatewayByIdResultDTO result = restTemplate.getForObject(uri, GatewayByIdResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItem();
	}

	@Override
	public List<AreaDTO> getSubareas(Long parentAreaId) throws BuildingDatabaseException {
		String uri = baseURL + "utility/subareas/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", String.valueOf(parentAreaId));
		AreasResultDTO result = restTemplate.getForObject(uri, AreasResultDTO.class, params);
		if (result.getResult().equals("KO"))
			throw new BuildingDatabaseException(result.getError());
		return result.getItems();
	}

	@Override
	public BuildingDTO getBuildingStructure(Long buildingId) throws BuildingDatabaseException {
		BuildingDTO building = getBuildingById(buildingId);
		//Add the school to the map
		Map<Long,AreaDTO> unusedAreas = new HashMap<>();  //Riguarda try better approach
		List<AreaDTO> areas = getAreas(buildingId);
		//Add all the area to the map
		areas.forEach(a -> unusedAreas.put(a.getId(),a));
		//Iterate all the areas and for each get the subareas
		for(AreaDTO area : areas){
			List<AreaDTO> subareas = getSubareas(area.getId());
			//Iterate all the subareas of the area and add them to the list
			for(AreaDTO subarea : subareas){
				AreaDTO subareaFromAreas = unusedAreas.remove(subarea.getId());
				area.add(subareaFromAreas);
			}
		}
		//Add the unused areas to the school
		building.addAll(unusedAreas.values());
		return building;
	}

	@Override
	public ScheduleDTO getScheduleForArea(Long areaId) throws BuildingDatabaseException {
		return null;
	}

}
