package fizzBuzz;

import org.joda.time.LocalTime;

public class FizzBuzz {
	
	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		String printString = "";
		for(int currentIndex = start; currentIndex < end + 1; currentIndex++){
			if(currentIndex%15 == 0)
			{
				printString += " fizzBuzz";
			}
			else if(currentIndex%5 == 0)
			{
				printString += " buzz";
			}
			else if(currentIndex%3 == 0)
			{
				printString += " fizz";
			}
			else
			{
				printString += " " + currentIndex;
			}
		}
		System.out.println(printString);
    }
}
