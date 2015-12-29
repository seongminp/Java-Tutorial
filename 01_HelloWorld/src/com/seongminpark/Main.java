package com.seongminpark;

/**
 * Main!!
 * Prints "Hello World" in the console.
 * @author seongmin
 *
 */
public class Main {

	/**
	 * Mandatory hello world.
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		// The normal way:
		System.out.println("Hello World");

		// The inappropriate way:
		System.out.print("Hello World\n");
	
		// And just for the sake of it:
		String helloWorld = "Hello World";
		System.out.println(helloWorld);
	}

}