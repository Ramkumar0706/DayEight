package logicalPrograms;

import java.util.Scanner;

public class StopWatch {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long startTime=0;
		long stopTime=0;
		System.out.println("Press S to Start ");
		String ss=scan.next();
		if(ss.equalsIgnoreCase("s")) {
			startTime=System.currentTimeMillis();
		}
		else
			System.out.println("you are enter wrong key");
		
		System.out.println("and Press T to Stop");
		ss=scan.next();
		if(ss.equalsIgnoreCase("t"))
			stopTime=System.currentTimeMillis();
		else
		System.out.println("you are enter wrong key");
		long time=stopTime-startTime;
		
		double elapsedTimeInSeconds = time / 1000.0;
		System.out.println(elapsedTimeInSeconds);
	}
	
	

}
