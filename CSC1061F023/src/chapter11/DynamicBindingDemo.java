package chapter11;



public class DynamicBindingDemo {
  public static void main(String[] args) {
	Object o = new GraduateStudent(); // implicit casting
	
	Object o1 = new GraduateStudent();
	
	if (o1 instanceof GraduateStudent) {
            System.out.println("Never got here");
            GraduateStudent gs = (GraduateStudent)o1; // explicit casting
	}
	
    m(o);
    m(new Student());
    m(new Individual());
    m(new Object());
  }

  // enables generic programming 
  public static void m(Object x) {
    System.out.println(x.toString());
  }
}

class GraduateStudent extends Student {
}

class Student extends Individual {
  public String toString() {
    return "Student";
  }
}

class Individual extends Object {
  public String toString() {
    return "Individual";
  }
}
