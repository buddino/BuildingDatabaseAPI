package it.cnit.gaia.buildingdb;

import java.util.List;

public interface BuildingDatabaseService {
	String getBaseURL();

	BuildingDTO getBuildingById(Long id) throws BuildingDatabaseException;

	List<BuildingDTO> getBuildings() throws BuildingDatabaseException;

	List<AreaDTO> getAreas(Long buildingId) throws BuildingDatabaseException;

	AreaDTO getAreaById(Long areaId) throws BuildingDatabaseException;

	List<GatewayDTO> getGateways(Long buildingId) throws BuildingDatabaseException;

	GatewayDTO getGatewayById(Long gwId) throws BuildingDatabaseException;

	List<AreaDTO> getSubareas(Long parentAreaId) throws BuildingDatabaseException;

	BuildingDTO getBuildingStructure(Long buildingId) throws BuildingDatabaseException;

	ScheduleDTO getScheduleForArea(Long areaId) throws BuildingDatabaseException;
}
