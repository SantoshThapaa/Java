import java.io.*;
import java.util.*;

class P {
	public void firstName()
	{
		System.out.println("Mayank");
	}
	public void surName()
	{

		// Passing name and print it
		System.out.println("Trivedi");
	}
}

class C extends P {
	public void surName()
	{
		System.out.println("Sharma");
	}

	public static void main(String[] args)
	{

		System.out.println("GFG");
	}
}
