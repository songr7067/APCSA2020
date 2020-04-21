package finalLabAssessment;

import java.util.ArrayList;
import java.util.Arrays;

public class Swimmer {
	private String name;
	private ArrayList<SwimmerEvent> eventList;
	
	public Swimmer(){
		name = "";
		eventList = new ArrayList<SwimmerEvent>();
	}
	
	public Swimmer(String n) {
		eventList = new ArrayList<SwimmerEvent>();
		this.name = n;
	}
	
	public void addEvent(SwimmerEvent sE) {
		eventList.add(sE);
	}
	
	public String getSwimmerName() {
		return this.name;
	}
	
	public ArrayList<SwimmerEvent> getEventList(){
		return eventList;
	}
	
	public SwimmerEvent getEvent(int index) {
		return eventList.get(index);
	}
	
	public double getAvg(int index) {
		return eventList.get(index).getAvg();
	}
	
	public double getAvg(String eventName) {
		double average = 0.0;
		
		for(SwimmerEvent sE: eventList) {
			if(sE.getEventName().equals(eventName)) {
				average = sE.getAvg();
			}
		}
		return average;
	}
	
	public SwimmerEvent getFastestTime() {
		int index = 0;
		double fast = eventList.get(0).get25time();
		for (int i = 0; i < eventList.size(); i++) {
			if(eventList.get(i).get25time()<fast) {
				fast = eventList.get(i).get25time();
				index = i;
			}
		}
		return eventList.get(index);
	}
	
	public SwimmerEvent getSlowestTime() {
		int index = 0;
		double slow = eventList.get(0).get25time();
		for (int i = 0; i < eventList.size(); i++) {
			if(eventList.get(i).get25time()>slow) {
				slow = eventList.get(i).get25time();
				index = i;
			}
		}
		return eventList.get(index);
	}
	
	public void sortEvents() {
		for(SwimmerEvent sE: eventList) {
			sE.sortTimes();
		}
		for(int j = 1; j< eventList.size(); j++) {
			SwimmerEvent temp = eventList.get(j);
			int index = j;
			while(index > 0 && temp.get25time()<eventList.get(index-1).get25time()) {
				eventList.set(index, eventList.get(index-1));
				index--;
			}
			eventList.set(index, temp);
		}
	}
	
	public String toString() {
		String output = "" + getSwimmerName() + "\n";
		for(SwimmerEvent sE:eventList) {
			output += sE.toString() + "\n";
		}
		return output;
	}
}
