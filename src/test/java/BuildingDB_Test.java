import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.cnit.gaia.buildingdb.AreaDTO;
import it.cnit.gaia.buildingdb.BuildingDTO;
import it.cnit.gaia.buildingdb.BuildingDatabaseException;
import it.cnit.gaia.buildingdb.BuildingDatabaseService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BuildingDB_Test {

	ObjectMapper mapper = new ObjectMapper();
	BuildingDatabaseService db = new BuildingDatabaseService();

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

}
