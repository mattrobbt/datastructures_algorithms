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
    private float num;
    
    
    // TODO: Add a field to store a reference to the next node in the list after this one
    private ListNode next;

    /**
     * Default constructor. Initialise fields to default values
     */
    public ListNode()
    {
        
        next = null;
    }

    /**
     * Alternative constructor. Set fields to given values.
     *
     * @param id The id for the student
     * @param mark The student's mark
     */
    public ListNode(float num)
    {
        // set id and mark to values provided
        this.num = num;
        

        // TODO: set next node to null - no valid next node yet
       this.next = next;
    }

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
		return null;
       
    }
    public float getnum() {
    	return num;
    }
}
