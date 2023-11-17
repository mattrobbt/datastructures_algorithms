/**
 * 
 */

/**
 * @author matthewrobb
 *
 */

/**
 * AC12001 Lab 1 Starting files
 * 
 * @author Computing, School of Science and Engineering, University of Dundee.
 *		   Note. Change this to comment to describe this class and add your name!
 * @version v1.0
 */
public class ListNode    
{
    // fields to store the data being held in this list node (a student ID and mark)
    private String id;
    private int mark;
    
    // TODO: Add a field to store a reference to the next node in the list after this one
    private ListNode next;

    /**
     * Default constructor. Initialise fields to default values
     */
    public ListNode()
    {
        // set id and mark to default / empty values 
        id = "";
        mark = 0;

        // TODO: set next node to null - no valid next node yet
        next = null;
    }

    /**
     * Alternative constructor. Set fields to given values.
     *
     * @param id The id for the student
     * @param mark The student's mark
     */
    public ListNode(String id, int mark)
    {
        // set id and mark to values provided
        this.id = id;
        this.mark = mark;

        // TODO: set next node to null - no valid next node yet
       this.next = next;
    }

    /**
     * Get the student ID contained in this list node
     * 
     * @return The student's ID as a String
     */
    public String getID()
    {
        return id;
    }

    /**
     * Get the student mark contained in this list node
     * 
     * @return The student mark
     */
    public int getMark()
    {
        return mark;
    }

    /**
     * Get the next node in the list after this one
     * 
     * @return A reference to the next node (or null if
     *         there is no next node)
     */
    public ListNode getNext()
    {
       // TODO: return your list node reference
    	return next;
    }

    /**
     * Set the next node in the list after this one
     * 
     * @param next A reference to a ListNode object which 
     *             represents the next node in the list after
     *             this one.
     */
    public void setNext(ListNode node)
    {
    	// TODO: store your list node reference
    	next = node;
    }

    /**
     * Return a string containing summary data from this node
     * 
     * @return A String containing a summary of the data contained in this list node
     */
    public String getSummaryData()
    {
        String data;		
        data = "Student with ID " + id + " obtained the following mark: " + mark + "%";		
        return data;
    }
}
