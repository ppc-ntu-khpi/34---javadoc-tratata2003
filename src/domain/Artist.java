package domain;
/** 
 * Class that inherited from Employee and discription Artist
 * @see Employee
 * @author Milka
 */
public class Artist extends Employee {
    /**
     * Constructor of Artist
     * @param skiils skills of artist
     * @param name name of artist
     * @param jobTitle job title of artist
     * @param level level of artist
     * @param dept dept of artist
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     * Constructor of Artist
     * @param skiils skills of artist
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * Constructor of Artist
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /** 
     * Method that override method toString()
     * @return all information about artist
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: " + getSkills();
    }

    private String[] skiils;
    /** 
     * Return skills in string format
     * @return string value skills
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    
    /**
     * Change skills
     * @param skills skills of artist 
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    
    /**
     * Return skills of Artist
     * @return array string with skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
