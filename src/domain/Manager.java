package domain;
/** 
 * Class that inherited from Employee and discription Manager
 * @see Employee
 * @author Milka
 */
public class Manager extends Employee {

    /**
     * Construstor for manager
     * @param employees employees
     * @param name name of manager
     * @param jobTitle job title of manager
     * @param level level of manager
     * @param dept dept of manager
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /** 
     * Method that override method toString()
     * @return all information about manager
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    /**
     * Constructor for manager
     * @param employees employee
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * Constructor for manager
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    
    /**
     * Return employee on string fomat
     * @return employee (string)
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Change employee 
     * @param employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Return employee
     * @return employee (employee)
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
