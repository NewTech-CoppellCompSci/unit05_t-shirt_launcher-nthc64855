package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		int first = inKey.nextInt();
		System.out.print("Enter another positive integer:");
		int second = inKey.nextInt();
		System.out.println(first+"^"+second+" = "+Math.pow(first, second));
	}
	
	
	
	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive number:");
		int i = inKey.nextInt();
		System.out.println("The square root of "+i+" is "+Math.sqrt(i));			
	}
	
	
	
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Length of side A:");
		int a = inKey.nextInt();
		System.out.print("Length of side B:");
		int b = inKey.nextInt();
		System.out.println("Hypotenuse = "+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
	}
	
	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int i = -1;
		
		while (i!=0) {
			System.out.println("Enter an integer:");
			i=inKey.nextInt();
			max = Math.max(max, i);
			min = Math.min(min, i);
		}
		System.out.println("Max = "+ max);
		System.out.println("Min = "+ min);
	}
	/* 
	 * Make a for loop that stops when they input zero. 
	 * It will keep the biggest number and the smallest number
	 */
	
	
}
