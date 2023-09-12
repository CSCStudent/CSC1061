package chapter11;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bobgils
 * 
 */
public class TestDemos {
    public static void main(String[] args){
    // demonstrate hierarchy constructor invocation
        new TestDemos().demo1();
        new TestDemos().demo2();
        
        new Person().printPerson();
        new Student().printPerson(); 
    }
    
    private void demo1(){
        Object a1 = new AB();
        Object a2 = new AB();
        boolean tv = a1.equals(a2); //which class is method defined?
        System.out.println(tv);
    }
    private void demo2(){
        AB a1 = new AB();
        AB a2 = new AB();
        boolean tv = a1.equals(a2); //which class is method defined?
        System.out.println(tv);        
    }
}

class AB {
    int x;
    public boolean equals(AB a){
        return this.x == a.x;
    }
}

class Person{
    private String getInfo(){
        return "class Person " + this.toString();
    }
    
    public void printPerson(){
        getInfo();
        System.out.println(getInfo());
    }
}

class Student extends Person{
    private String getInfo(){
        return "class Student " + this.toString();
    }
//    public void printPerson(){
//        System.out.println(getInfo());
//    }   
}
