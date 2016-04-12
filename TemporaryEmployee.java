/**the subclass for the temporary employee object
  *@author Minghao Shan
  *@version 03/20/2016
  **/
public class TemporaryEmployee extends Employee {
  
  private static final int NUMBER_HOURS_PER_YEAR = 1920;
  /**This is the constructor for the temporary employee
    *@param name is the employees name
    *@param designation means the employee is either part time or fulltime
    *@param department is the department of the employee
    *@param salary is the employee's salary
    **/
  public TemporaryEmployee(String name, String designation, String department, int salary) {
    super(name, designation, department, salary);
  }
  /**converts salary from per hour to annually by multiplying number by amount of hours in one year,
    *and return the salary
    **/
  public int getSalary()
  {
    return super.getSalary() * NUMBER_HOURS_PER_YEAR;
  }
  
}
