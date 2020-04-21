package finalLabAssessment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SwimmerRunner {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Welcome to the Swim Team");
		
		Scanner file = new Scanner(new File("src/finalLabAssessment/swimmerdata.dat"));
		String name = file.next();
		Swimmer test = new Swimmer(name);
		int index = 0;
		while(file.hasNextLine()) {
			String eventName = file.nextInt() + " " + file.next();
			String timesList = file.nextLine();
			test.addEvent(new SwimmerEvent(eventName,timesList));
		}
		System.out.println(test);
		for(SwimmerEvent sE:test.getEventList()) {
			sE.sortTimes();
		}
		System.out.println(test);
		test.sortEvents();
		System.out.println(test);
		for(int i =0; i<test.getEventList().size();i++) {
			System.out.println(String.format(test.getEvent(i).getEventName() + " average time: %.2f",test.getEvent(i).getAvg()));
			System.out.println(String.format(test.getEvent(i).getEventName() + " average 25 time: %.2f", test.getEvent(i).get25time())+ "\n");
		}
		
		System.out.println("Fastest 25 time: " + test.getFastestTime().getEventName()+ String.format(" - %.2f", test.getFastestTime().get25time()));
		System.out.println("Slowest 25 time: " + test.getSlowestTime().getEventName()+ String.format(" - %.2f", test.getSlowestTime().get25time()));
		
		
		
	}

}
