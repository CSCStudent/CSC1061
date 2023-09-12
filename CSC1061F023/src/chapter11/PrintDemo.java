package chapter11;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bobgils
 * Java program to demonstrate scope 
 * of static method in inheritance. 
 */
class Printer {


    // Static Method 
    static void hello() 
    { 
            System.out.println("Called from class Printer"); 
    } 
} 

public class PrintDemo extends Printer { 

	public static void main(String[] args) 
	{ 
            Printer p = new PrintDemo();
            
            if (p instanceof Printer)
                System.out.println("detected object of type class Printer");
            
		// Call Interface method as Interface 
		// name is preceeding with method 
		Printer.hello(); 

		// Call Class static method 
		hello(); 
	} 

	// Class Static method is defined 
	static void hello() 
	{ 
		System.out.println("Called from Class PrintDemo"); 
	} 
} 
