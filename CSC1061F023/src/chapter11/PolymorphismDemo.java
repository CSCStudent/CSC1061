package chapter11;


public class PolymorphismDemo {
  /** Main method */
  public static void main(String[] args) {
    // Display circle and rectangle properties
    displayObject(new Circle
        (1, "red", false));
    displayObject(new Rectangle
        (1, 1, "black", true));
    
    Object[] assortedObjs = {new Circle(1, "red", false), 
        new Rectangle(1, 1, "black", true),
        new Object[] {new Integer(3)}};
    
    displayObjects(assortedObjs);
  }

  /** Display geometric object properties */
  public static void displayObject(GeometricObject object) {
    System.out.println("Created on " + object.getDateCreated() +
      ". Color is " + object.getColor());
  }
  
    public static void displayObjects(Object[] objects) {
        for (Object s : objects)
            if(s instanceof GeometricObject)
                System.out.println(s + " Created on " + ((GeometricObject)s).getDateCreated() +
                ". Color is " + ((GeometricObject)s).getColor());
  }
}
