package finalLabAssessment;

public class EventRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwimmerEvent test = new SwimmerEvent("200 Butterfly", "122.32 126.98 138.32 119.32");
		System.out.println(test.getAvg());
		System.out.println(test.get25time());
		System.out.println(test.getDistance());
		System.out.println(test.getEventName());
		System.out.println(test);
		test.setTime(2, 120.34);
		System.out.println(test);
		test.sortTimes();
		System.out.println(test);
		}

}
