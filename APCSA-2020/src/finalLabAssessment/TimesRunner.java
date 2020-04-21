package finalLabAssessment;

public class TimesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwimmerTimes test = new SwimmerTimes("49.92 50.32 50.21 55.02");
		System.out.println(test);
		System.out.println(test.getAvg());
		System.out.println(test.getLowest());
		System.out.println(test.getHighest());
		System.out.println(test.getTimes());
	}

}
