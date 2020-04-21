package finalLabAssessment;

import java.util.ArrayList;
import java.util.Scanner;

public class SwimmerTimes {
	private ArrayList<Double> times;
	
	public SwimmerTimes() {
		times = new ArrayList<Double>();
		setTimes("");
	}
	
	public SwimmerTimes(String timeList) {
		times = new ArrayList<Double>();
		setTimes(timeList);
	}
	
	public void setTimes(String timeList) {
		Scanner input = new Scanner(timeList);
		while(input.hasNextDouble()) {
			times.add(Double.parseDouble(input.next()));
		}
	}
	
	public void setTime(int index, double time) {
		times.set(index, time);
	}
	
	public double getAvg() {
		double sum =0;
		for(double time:times) {
			sum +=time;
		}
		return sum/times.size();
	}
	
	public void sortTimes() {
		for(int j = 1; j< times.size(); j++) {
			double temp = times.get(j);
			int index = j;
			while(index > 0 && temp < times.get(index-1)) {
				times.set(index, times.get(index-1));
				index--;
			}
			times.set(index, temp);
		}
	}
	
	public double getLowest() {
		sortTimes();
		return times.get(0);
	}
	
	public double getHighest() {
		sortTimes();
		return times.get(times.size()-1);
	}
	
	public ArrayList<Double> getTimes(){
		return times;
	}
	
	public int getNumTimes() {
		return times.size();
	}
	
	public String toString() {
		String output = "";
		for(double time:times) {
			output += time + " ";
		}
		return output;
		
	}
}
