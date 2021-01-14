package domain;

/**
 * Class that describes some employee
 * @author Milka
 */
public class Employee {

    /** 
     * Method that override method toString()
     * @return all information about employee 
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    /**
     * Constructor for employee
     * @param name name of employee 
     * @param jobTitle job title of employee
     * @param level level of employee
     * @param dept dept of employee
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     * Change job title
     * @param job job title of employee
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * Return job title
     * @return string with job title
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * Return employee`s name
     * @return string with name
     */
    public String getName() {
        return name;
    }
    /**
     * Change level of employee
     * @param level level of employee 
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * Return level of employee
     * @return int value of level
     */
    public int getLevel() {
        return level;
    }
    /**
     * Return debt of employee
     * @return string value of debt
     */
    public String getDept() {
        return dept;
    }
    /**
     * Change debt of employee
     * @param dept dept of employee
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * Change name of employee
     * @param name name of employee
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
