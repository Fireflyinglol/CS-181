/**
 * This is the class of the employee object type.
 * Test for Github commit
 * @author Minghao Shan
 * @version 03/20/2016
 **/
public class Employee {
  
  private String name;
  private String designation;
  private String department;
  private int salary;
  /**This is the constructor for the employee object
    @param name is the employees name
    @param designation means the employee is either part time or fulltime
    @param department is the department of the employee
    @param salary is the employee's salary
    **/
  public Employee(String name, String designation, String department, int salary)
  {
    this.name = name;
    this.designation = designation;
    this.department = department;
    this.salary = salary;   
  }
  /**
   * returns name of employee
  **/
  public String getName() {
    return name;
  }
   /**
   * change the name of employee
  
  public void setName(String name) {
    this.name = name;
  }
   /**
   * returns name of designation
  **/
  public String getDesignation() {
    return designation;
  }
   /**
   * change name of designation
  
  public void setDesignation(String designation) {
    this.designation = designation;
  }
   /**
   * returns name of Department
  **/
  public String getDepartment() {
    return department;
  }
   /**
   * returns name of employee
 
  public void setDepartment(String department) {
    this.department = department; 
  }
   /**
   * returns salary of employee
  **/
  public int getSalary() {
    return salary;
  }
   /**
   * returns name of employee
  
  public void setSalary(int salary) {
    this.salary = salary;
    
  }**/
}

