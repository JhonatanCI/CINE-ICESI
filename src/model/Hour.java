package model;

public class Hour {
	int hour;
	int minutes;
	public Hour(int hour, int minutes) {
		this.hour = hour;
		this.minutes = minutes;
	}
	public int getHour() {
		return hour;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int calculateFinish(int duration) {
		int out = hour+duration;
		return out;
	}
}
