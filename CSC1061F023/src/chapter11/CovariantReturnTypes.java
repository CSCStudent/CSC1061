package chapter11;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bobgils
 */
public class CovariantReturnTypes {
// Covariant return type means that whan one overrides a method, the return type of the overriding method
// is allowed to be a subtype of the overridden method's return type.
    
// Java program to demonstrate that we can havedifferent return types if return type in 
// overridden method is sub-type. 

// Two classes used for return types. 
class A {} 
class B extends A {} 

class Base 
{ 
	A fun() 
	{ 
		System.out.println("Base fun()"); 
		return new A(); 
	} 
} 

class Derived extends Base 
{ 
	B fun() 
	{ 
		System.out.println("Derived fun()"); 
		return new B(); 
	} 
} 


public static void main(String args[]) {
    new CovariantReturnTypes().run();
}

void run()
{ 
Base base = new Base(); 
base.fun(); 

Derived derived = new Derived(); 
derived.fun(); 
} 

    
}
