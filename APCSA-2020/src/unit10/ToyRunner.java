package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy();
		test.setName("sorry");
		test.setCount(1);
		Toy test2 = new Toy();
		test2.setName("gi joe");
		test2.setCount(5);
		System.out.println(test);
		System.out.println(test2);
	}
}