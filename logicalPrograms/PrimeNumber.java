package logicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number To find The Prime Number");
		int number=scanner.nextInt();
		boolean re=isPrime(number);
	if(re)
		System.out.println("The user Enter number is Prime Number ");
	else
		System.out.println("The User Enter Number is Not a Prime number");
		
	}

	public static boolean isPrime(int number) {
		if(number==1)
			return false;
		for(int i=2;i<number/2;i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}

}
