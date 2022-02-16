package model;

public class Function {
	private String name;
	private  String room;
    private Date date;
    private Hour hour;
    private Hour duration;
    
    public Function(String name, String room,int hourHour,int hourMinutes,int durationHour,int durationMinutes,String day,String month) {
    	this.name = name;
    	this.room = room;
    	this.date = new Date(day,month);
    	this.hour = new Hour(hourHour, hourMinutes);
    	this.duration = new Hour(durationHour,durationMinutes);
    }
    
    public String getName() {
    	return name;
    }
    public String getroom() {
    	return room;
    }
    public Date getDate() {
    	return date;
    }
    
    public Hour getHour() {
    	return hour;
    }
    
    public Hour getDuration() {
    	return duration;
    }
}
