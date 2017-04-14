import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.cnit.gaia.buildingdb.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BuildingDB_Test {

	ObjectMapper mapper = new ObjectMapper();
	BuildingDatabaseService db = new BuildingDatabaseServiceImpl();

	@Test
	public void testGetBuildings() throws BuildingDatabaseException {
		List<BuildingDTO> buildings = db.getBuildings();
		buildings.forEach(b -> {
			try {
				System.out.println(mapper.writeValueAsString(b));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
	}

	@Test
	public void testGetAreas() throws BuildingDatabaseException {
		List<AreaDTO> areas = db.getAreas(155076L);
		areas.forEach(b -> {
			try {
				System.out.println(mapper.writeValueAsString(b));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
	}

	@Test
	public void testGetAreasFail() throws BuildingDatabaseException {
		try {
			List<AreaDTO> areas = db.getAreas(0L);
		}
		catch (BuildingDatabaseException e){
			Assertions.assertEquals("Invalid parameter value: BUILDING ID", e.getMessage());
			return;
		}
		Assertions.fail("No BuildingException thrown");
	}

	@Test
	public void testGetSubAreas() throws BuildingDatabaseException {
		List<AreaDTO> areas = db.getSubareas(20L);
		areas.forEach(subarea -> {
			try {
				System.out.println(mapper.writeValueAsString(subarea));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
	}

	@Test
	public void testTree() throws BuildingDatabaseException, JsonProcessingException {
		BuildingDTO school = db.getBuildingStructure(155076L);
		ObjectMapper jsonMapper = new ObjectMapper();
		System.out.println(jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(school));
	}

}
