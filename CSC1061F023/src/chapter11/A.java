package chapter11;
/*
 Used with Lesson3.InheritanceDemo.java
 */


/**
 *
 * @author bobgils
 */

// class A is intended to be a base class only!
public class A {
    protected A(){  // modifier assures creation of type class A objects 
        System.out.println("class A constructor here");        
    }
    public double f(int n){
        return (double)n;
    }
}