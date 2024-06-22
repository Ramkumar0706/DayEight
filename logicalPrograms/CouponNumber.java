package logicalPrograms;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to generate the coupon number");
		int n=scan.nextInt();
		int re=isDistrictCoupon(n);
		System.out.println("there are "+re+" time generating the number between "+1+" to "+n);
	}

	public static int isDistrictCoupon(int n) {
		boolean[] br=new boolean[n];
		int dcount=0;
		int count=0;
		while(count<n) {
			int re=generateRandom(n);
			dcount++;
			if(!br[re]) {
				br[re]=true;	
				count++;
			}
		}
		return dcount;
	}

	public static int generateRandom(int n) {
		Random r=new Random();
		
		return r.nextInt(n);
	}

}
