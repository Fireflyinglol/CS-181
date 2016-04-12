//the subclass for the permanent employee object
//@author Minghao Shan
//@version March 20, 2016
public class PermanentEmployee extends Employee 
{
/**constructor for the permanent employee
    @param name is the employees name
    @param designation means the employee is either part time or fulltime
    @param department is the department of the employee
    @param salary is the employee's salary
    **/
 public PermanentEmployee(String name, String designation, String department, int salary) {
  super(name, designation, department, salary);
 }

}
