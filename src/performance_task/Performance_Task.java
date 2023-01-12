package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter launch velocity (m/s) >>> ");
		double launchVelocity = inKey.nextDouble();
		System.out.println("Enter launch angle (degrees) >>> ");
		double launchAngle = inKey.nextDouble();
		int time = 0;
		double xPosition = 0;
		double yPosition = 0;
		int stop = 0;
		System.out.println("\nProjectile's path:\n");
		while (yPosition>=0&&stop==0) {
			System.out.println("Time: "+time+"s");
			xPosition = Math.cos(Math.toRadians(60))*time*launchVelocity;
			System.out.println("   x-pos: "+xPosition+"m");
			yPosition = Math.sin(Math.toRadians(60))*time*launchVelocity-.5*9.8*Math.pow(time, 2);
			if (yPosition<0) {
				yPosition=0;
				stop++;
			}
			System.out.println("   y-pos: "+yPosition+"m");
			time++;
		}
		
	}
	
}