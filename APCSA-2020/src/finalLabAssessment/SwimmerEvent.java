package finalLabAssessment;

import java.util.ArrayList;

public class SwimmerEvent {
	private String eventName;
	private SwimmerTimes eventTimes;
	private int distance;
	
	public SwimmerEvent() {
		seteventName("");
		seteventTimes("");
		setDistance();
	}
	
	public SwimmerEvent(String n, String t) {
		seteventName(n);
		seteventTimes(t);
		setDistance();
	}
	
	public void seteventName(String n) {
		eventName = n;
	}
	
	public void seteventTimes(String t) {
		eventTimes = new SwimmerTimes(t);
	}
	
	private void setDistance() {
		int endIndex = eventName.indexOf(" ");
		distance = Integer.parseInt(eventName.substring(0, endIndex));
	}
	
	public void setTime(int index, double time) {
		eventTimes.setTime(index, time);
	}
	
	public String getEventName() {
		return eventName;
	}
	
	public double getAvg() {
		return eventTimes.getAvg();
	}
	
	public double getHighest() {
		return eventTimes.getHighest();	
	}
	
	public double getLowest() {
		return eventTimes.getLowest();
	}
	
	public int getSize() {
		return eventTimes.getNumTimes();
	}
	
	public int getDistance() {
		return distance;
	}

	public double get25time() {
		return eventTimes.getAvg()*25/distance;
	}
	
	public void sortTimes() {
		eventTimes.sortTimes();
	}
	
	public String toString() {
		String output = "";
		output += eventName + " - " + eventTimes.toString();
		return output;
	}
}
