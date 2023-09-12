package chapter13;
// PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest 
{
   public static void main(String[] args) 
   {
      // create four-element Employee array and define subclass objects
      Payable[] employees = new Employee[4]; 

      // initialize array with Employees
      employees[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
      employees[1] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
      employees[2] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06); 
      employees[3] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

      System.out.printf("Employees processed polymorphically:%n%n");
      
      // generically process each element in array employees
      for (Payable currentEmployee : employees) 
      {
          // invoke subclass type method earnings()
        System.out.printf("%n%s%n%s: $%,.2f%n%n", currentEmployee, "earned:", ((Employee)currentEmployee).earnings());
        System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         System.out.printf("earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
      } 

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++)
         System.out.printf("Employee %d is a %s%n", j, 
            employees[j].getClass().getName()); 
   } // end main
} // end class PayrollSystemTest

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
