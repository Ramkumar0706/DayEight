package logicalPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scanner.nextInt();
		int re =isPerfect(number);
		if(re==number)
			System.out.println("the User Enter number : "+number+" and the return number : "+re+""
					+ "\n is Same . So It is perfect Number" );
		else
			System.out.println("The user Enter Number is Not Perfect Number : "+number);
	}

	public static int isPerfect(int number) {
		int sum=0;
		for (int i = 1; i <=number/2; i++) {
			if(number%i==0)
				sum+=i;
		}
		return sum;
	}

}
