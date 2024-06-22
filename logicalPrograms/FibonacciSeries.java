package logicalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scanner.nextInt();
		isFibonacciSeries(number);
		
	}

	public static void isFibonacciSeries(int number) {
		int n1=0;
		int n2=1;
		for(int i=1;i<=number;i++) {
			int sum=0;
			if(i==1)
				System.out.println(n1);
			else if(i==2)
				System.out.println(n2);
			else {
				sum=n1+n2;
				System.out.println(sum);
				n1=n2;
				n2=sum;
			}
		}
		
	}

}
