package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}


	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int i = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int j = inKey.nextInt();
		for (int num = 0; num < 100; num++) {
			if (i>j) {
				int x = i-j;
				System.out.print((int) (Math.random()*x)+j+" ");
			} else {
				int x = j-i;
				System.out.print((int) (Math.random()*x)+i+" ");
			}
		}
		System.out.println();
	}


	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		double r = Math.PI * Math.pow(inKey.nextDouble(),2);
		double h = inKey.nextDouble() * r;
		System.out.println(h);
	}
// V= PIr^2*h

	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		double xl = inKey.nextDouble();
		double yl = inKey.nextDouble();
		double xz = Math.pow(inKey.nextDouble() - xl, 2);
		double yz = Math.pow(inKey.nextDouble() - yl, 2);
		System.out.println("Distance between points = " + Math.sqrt(xz + yz));
		
	}
/* a^2 + b^2 = c^2
 * The hypotenuse is the distance between the points
 * Calculate the distance between the x variables
 * Then do the same with the y variables
 * Then, multiply them with the power of 2 (separately)
 * Add them, and then find  the square root of them
 * when will I see Mr. Willikinz again? :(
 */
	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		double a = inKey.nextDouble();
		double b = inKey.nextDouble();
		double c = inKey.nextDouble();
		System.out.println("x1 = "+ (-b + Math.sqrt(Math.pow(b, 2)- 4*a*c))/(2*a));
		System.out.println("x2 = "+ (-b - Math.sqrt(Math.pow(b, 2)- 4*a*c))/(2*a));
	}
/* I  never learned about the quadratic formula... ;-;
 * x = (-b +/- Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a
 */


}
