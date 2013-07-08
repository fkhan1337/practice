/**************************************************

Program to caculate salary of FooCorp's employees

Author: Farhan Khan
Email: fkhan.1337@gmail.com
Source MIT 6.092 Assignment.

Copyright (c) MIT.

**************************************************/

import java.util.Scanner;

class FooCorporation {

    /* double, double -> double
       Takes base pay and the number of hours worked and calculates total pay/salary

       Requirements:
       - totalPay is basePay * hoursWorked
       - overtime (> 40 hours) pay is 1.5 times basePay

       Constraints:
       - basePay is atleast 8.00
       - hoursWorked is atmost 60
    */
    private static double calculatePay( double basePay, int hoursWorked ) {
	
	// Check if base pay is the required minimum
	if (basePay < 8.0) {
	    System.out.println("Error: Base Pay should be atleast 8.00");
	    return 0.0;
	} else if (hoursWorked > 60) {
	    // Check if hoursWorked is less than 60.0
	    System.out.println("Error: Number of hours worked should be less than 60");
	}

	double totalPay = 0.0;
	
	// Required working hours
	if (hoursWorked <= 40)
	    totalPay += basePay * hoursWorked;
	
	// OVertime
	if (hoursWorked > 40)
	    totalPay += (1.5 * basePay) * (hoursWorked - 40);

	return totalPay;
    }

    public static void main( String[] agrs ) {
	Scanner scanner = new Scanner(System.in);

	while (true) {
	    System.out.println("\n--------FOO--CORP--------");
	    System.out.println("Employee's Pay Calculator");
	    System.out.println("-------------------------");
	    System.out.print("Enter base pay: ");
	    double basePay = scanner.nextDouble();
	    System.out.print("Enter hours worked: ");
	    int hoursWorked = scanner.nextInt();
	    
	    // Calculate and display totalPay
	    double totalPay = calculatePay(basePay, hoursWorked);
	    if (totalPay > 0.0) {
		System.out.println("Employee's total pay is: " + totalPay);
	    }
	    
	    // Ask user to quit?
	    System.out.print("Quit? (y/n): ");
	    char c = scanner.next().charAt(0);
	    if (c == 'y') break;
	}
    }
}
	
	
	
