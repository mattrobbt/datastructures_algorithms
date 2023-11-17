/**
 * @author matthewrobb
 *
 */

/**
 * AC12001/AC22007 Lab 1 Starting files
 * 
 * @author School of Computing, University of Dundee.
 *         Note. Change this comment to describe this class and add your name!
 * @version v1.0
 */
public class Stack 
{
    private ListNode head; // used to hold a reference to an instance of a ListNode object
    // which will be the first item in the list, i.e. at the 'head'
    // of the list

    /**
     * Default constructor. Initialise fields to default values.
     */
    public Stack()
    {
        // set the list to be empty, i.e. not referring to anything valid yet
        head = null;
    }

    /**
     * Get the list node which is at the 'head' of the list
     * 
     * @return A reference to a ListNode object which represents the node at the
     *         head of the list (or null if the list is empty, i.e. no 'head' has
     *         been set yet).    
     */
    public ListNode getHead()
    {
        return head;
    }

    /**
     * Set the 'head' of the list to the given node
     * 
     * @param  newHead A reference to a ListNode object which will be
     *                 the head of the list. 
     *                 
     * NOTE: if a list already exists, the existing listing will be 
     * lost since the head is being assigned to something new.
     */
    public void setHead(ListNode newHead)
    {
        head = newHead;
    }

    /**
     * Add a new node to the start of the list which will contain
     * the data provided (a student ID and mark).
     * 
     * @param id The id of the student to be placed in this list node
     * @param mark The student's mark 
     */
    public void push(float num) 
    {
       ListNode newNode;
       newNode = new ListNode(num);
       newNode.setNext(head);
       head = newNode;
    }
    public float pop() {
    	ListNode nextNode;
    	nextNode = head;
    	if(head==null) {
    		
    	}
    	if(head=head.getNext()==null) {
    		System.out.print("Error the input is invalid!");
    	}
    	head=head.getNext();
    	return nextNode.getnum();
    }

    public void printStack() {
    	ListNode nextNode = null;
    	nextNode = head;
    	System.out.println(nextNode.getnum());
    	while(nextNode.getNext() != null) { 
    		nextNode = nextNode.getNext();
    		System.out.println(nextNode.getnum());
    	}
    }
    public void findNode(int search) {
    	ListNode marker = head;
    	Boolean foundNode = false;
    	while(marker != null && foundNode==false) {
    		 if(marker.getnum() == search) {
    			 foundNode = true;
    		 }
    		 marker= marker.getNext();
    		 
    	}
    	if(foundNode==true) {
    		System.out.println("The item " + search + " is in the list!" );
    	}
    	else {
    		System.out.println("The item is not in the list!" );
    	}
    }
    public boolean isStackEmpty() {
    	if(head==null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}

