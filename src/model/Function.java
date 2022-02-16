package model;

import java.util.ArrayList;


public class Function {
	private String name;
	private  String room;
    private ArrayList<Date> date = new ArrayList<Date>();
    private ArrayList<Hour> hours = new ArrayList<Hour>();
    private ArrayList<Hour> duration = new ArrayList<Hour>();
    
    public Function(String name, String room,int hourHour,int hourMinutes,int durationHour,int durationMinutes,String day,String month) {
    	this.name = name;
    	this.room = room;
    	date.add(new Date(day,month));
    	hours.add(new Hour(hourHour, hourMinutes));
    	duration.add(new Hour(durationHour,durationMinutes));
    }
    
    public String getName() {
    	return name;
    }
    public String room() {
    	return room;
    }
}
