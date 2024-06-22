package logicalPrograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number To reverse The Number");
		int number = scan.nextInt();
		int re=isReverseNumber(number);
		System.out.println("the Reverse number of : "+number+" is : "+re );
	}

	public static int isReverseNumber(int number) {
		int reverse=0;
		while(number!=0) {
			int d=number%10;
			reverse=reverse*10+d;
			number=number/10;
		}
		return reverse;
	}

}
