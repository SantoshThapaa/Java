// Java Program to illustrate Final keyword
// Where No final keyword Is Used

// Importing required classes
import java.io.*;
import java.util.*;

// Class 1
// Super-class
class P {

	// Method 1
	// To declare first name
	public void firstName()
	{

		// Passing name and print it
		System.out.println("Mayank");
	}

	// Method 2
	// To declare last name
	public void surName()
	{

		// Passing name and print it
		System.out.println("Trivedi");
	}
}

class C extends P {
	public void surName()
	{
		// Display surname
		System.out.println("Sharma");
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		System.out.println("GFG");
	}
}
