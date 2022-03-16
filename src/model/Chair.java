package model;

public class Chair {
	
	private String ubication;
	private boolean isEmpty;
	
	public Chair(String ubication) {
		this.ubication = ubication;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public boolean getIsEmpty() {
		return isEmpty;
	}

	public void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	

}
