package chapter11;
/**
 * CSC161 Example showing how chaining constructors works. 
 */


/**
 *
 * @author bobgils
 */
public class ChainingConstructors {
    public static void main(String[] args){
        Faculty Jay = new Faculty();
        System.out.println("inheritance tree height: " + Jay.lvl);
    }
}

class Faculty extends Employee{
    Faculty(){
        lvl = 4;
        System.out.println(lvl + " Class Faculty constructor here.");
    }
}

class Employee extends Person {
    Employee(){
        this(" Class Employee constructor here.");
        this.lvl = 3;
        System.out.println(lvl + " Class Employee constructor here.");
    }
    Employee(String s){
        lvl = 2;
        System.out.println(lvl + s);
    }
}

class Person {
    protected int lvl = 0;
    Person(){
        lvl = 1;
        System.out.println(lvl + " Class Person constructor here.");
    }
}
