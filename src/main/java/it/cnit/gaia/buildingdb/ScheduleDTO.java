package it.cnit.gaia.buildingdb;

import java.util.Collection;

public class ScheduleDTO {
	Collection<String> cronstrs;
	Boolean negative;
	Long areaId;

	public Collection<String> getCronstrs() {
		return cronstrs;
	}

	public ScheduleDTO setCronstrs(Collection<String> cronstrs) {
		this.cronstrs = cronstrs;
		return this;
	}

	public Boolean getNegative() {
		return negative;
	}

	public ScheduleDTO setNegative(Boolean negative) {
		this.negative = negative;
		return this;
	}

	public Long getAreaId() {
		return areaId;
	}

	public ScheduleDTO setAreaId(Long areaId) {
		this.areaId = areaId;
		return this;
	}
}
