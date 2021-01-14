package domain;
/** 
 * Class that inherited from Employee and discription Editor
 * @see Employee
 * @author Milka
 */
public class Editor extends Artist {
    /**
     * Constructor for editor 
     * @param electronicEditing electronic editing of editor
     * @param skiils skills of editor
     * @param name name of editor
     * @param jobTitle job title of editor
     * @param level level of editor
     * @param dept dept of editor
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Constructor of editor
     * @param electronicEditing electronic editing of editor
     * @param skiils skills of editor
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Constructor of editor
     * @param electronicEditing electronic editing of editor
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Constructor of editor
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    
    /** 
     * Method that override method toString()
     * @return all information about editor
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /** 
     * Return preferences of editor
     * @return booleean value 
     */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * Change preferences of editor
     * @param electronic electronic (boolean)
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
