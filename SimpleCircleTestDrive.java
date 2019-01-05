package week13;

import java.util.Scanner;

import week13.SimpleCircle;

public class SimpleCircleTestDrive {

	public static void main(String[] args) {

    // create a new SimpleCircle object so we can test out the methods.
		SimpleCircle sc = new SimpleCircle(5);
		sc.setRadius(3.0);

    // test out each method we wrote in SimpleCircle
		System.out.println("The radius is " + sc.getRadius());
		System.out.println("The area of the sc is " + sc.findArea());
		System.out.println("The circumference of the sc is " + sc.findCircumference());
		System.out.println("The diameter of the sc is " + sc.findDiameter());

		// loop that prints out the area for circles with radius 1 through 10
		for (int i = 1; i < 11; i++) {
			sc.setRadius(i);
			System.out.println("radius = " + sc.getRadius() + "\t area = " + sc.findArea());
		}


    /*
    *  Now lets get the radius from a user typing it in the command line instead:
    */
  
		// instantiate a new Scanner object (we will improve upon this later)
		Scanner s = new Scanner(System.in);

		// tell the user what to do by printing out instructions.
		System.out.println("Enter a radius:");

		// initialize a variable to store the users input from the Scanner and get the
		// next line of input
		String inputStr = s.nextLine();

		if (inputStr != null && !inputStr.trim().isEmpty()) {

			// while the user has not entered the string quit, keep looping
			while (!inputStr.equalsIgnoreCase("quit")) {

				if (inputStr != null && !inputStr.trim().isEmpty()) {
					// parse the string to a double
					double radius = Double.parseDouble(inputStr);
					// set the value as the radius
					sc.setRadius(radius);
					// print out the area
					System.out.println(sc.findArea());
					// prompt user again
					System.out.println("Enter another radius:");
					// read the next line from console
					inputStr = s.nextLine();
				}else {
					// prompt user again
					System.out.println("Did not compute...Enter another radius:");
					// read the next line from console
					inputStr = s.nextLine();
				}
			}
		}
    
    // close the Scanner object
		s.close();
	}

}
