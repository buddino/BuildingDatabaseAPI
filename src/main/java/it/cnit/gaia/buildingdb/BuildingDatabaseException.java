package it.cnit.gaia.buildingdb;

public class BuildingDatabaseException extends Exception{
	public BuildingDatabaseException() {
	}

	public BuildingDatabaseException(String message) {
		super(message);
	}

	public BuildingDatabaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BuildingDatabaseException(Throwable cause) {
		super(cause);
	}

	public BuildingDatabaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
