/******************************************************************

Program to calculate position of a body moving under the influence
of Earth's gravity
Author: Farhan Khan
Email: fkhan.1337 at gmail.com
Source: MIT 6.092 Assignments

Copyright (c) MIT.

*******************************************************************/

class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81;  // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
	double initialPosition = 0.0;
        
	double finalPosition = 0.0;
	finalPosition = (gravity * fallingTime * fallingTime) / 2;
	finalPosition += (initialVelocity*fallingTime + initialPosition);
        

	System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
} 
