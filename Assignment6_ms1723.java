import java.util.ArrayList;
import java.util.Scanner;
//@author Minghao Shan
//@version 4/12/2016
//This program takes in employee information, then prints print a summary of employee information, 
//sorted by ascending yearly salary.

public class Assignment6_ms1723 {
  
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    
    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    System.out.print("Input employee name('none'to stop): ");
    String name = in.nextLine();
    while(!name.equals("none"))
    {
      System.out.print("Input employee designation('temporary' or 'permanent'): ");
      String designation = in.nextLine();
      System.out.print("Input employee department: ");
      String department = in.nextLine();
      System.out.print("Input employee salary: ");
      int salary = in.nextInt();
      in.nextLine();
      
      if (designation.equals("permanent"))
      {
        Employee employee = new PermanentEmployee(name, designation, department, salary);
        employeeList.add(employee);
      }
      else
      {
        Employee employee = new TemporaryEmployee(name, designation, department, salary);
        employeeList.add(employee);
      }
      
      System.out.print("Input employee name('none' to stop): ");
      name = in.nextLine();
    }
    
    System.out.print("Please enter attributes to sort on(name, department, salary): ");
    String attribute = in.nextLine();
    
    System.out.print("Please enter the sorting algorithms: ");
    String sortAlgorithms = in.nextLine();
    
    if 
    
    while (!employeeList.isEmpty()) 
    {
      int minIndex = 0;
      int minSalary = employeeList.get(0).getSalary();
      
      for (int i = 1; i < employeeList.size(); i++)
      {
        if (employeeList.get(i).getSalary() < minSalary)
        {
          minSalary = employeeList.get(i).getSalary();
          minIndex = i;
        }
      }
      
      Employee minEmployee = employeeList.remove(minIndex);
      System.out.println(minEmployee.getName() + " " + minEmployee.getDepartment() + 
                         " " + minEmployee.getSalary());
    }
  }
  
}
