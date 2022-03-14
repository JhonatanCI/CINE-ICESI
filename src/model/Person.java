package model;

public class Person {
	
	private String id;
	private String fullName;
	private Chair chair;
	
	public Person(String id, String fullName) {
		this.id = id;
		this.fullName = fullName;
		chair = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Chair getChair() {
		return chair;
	}

	public void setChair(Chair chair) {
		this.chair = chair;
	}
	
	
	
}
