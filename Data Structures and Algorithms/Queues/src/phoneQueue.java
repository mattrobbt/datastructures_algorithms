import java.util.LinkedList;
import java.util.Queue;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Stores a queue of DVD objects
 */
public class phoneQueue
{
    private Queue<PhoneInfo> phoneQueue; // stores a queue of DVDs.

    /**
     * Default constructor. Initialise fields to default values.
     */
    public phoneQueue()
    {
        phoneQueue = new LinkedList<PhoneInfo>();
    }

    
    public boolean addToQueue(PhoneInfo CallerToAdd)
    {
        // call method on queue object to add object to end of it
        return phoneQueue.add(CallerToAdd);
    }

    
    public boolean addToQueue(String CallerName, String phoneNumber, Date timeOfCall)
    {
        // create a DVD object using the details provided
        PhoneInfo caller = new PhoneInfo(CallerName, phoneNumber, timeOfCall);

        // call method on queue object to add DVD object to the end of it
        return phoneQueue.add(caller);
    }

    /**
     * Remove the DVD at the front of Queue and return a reference to it.
     * 
     * @return A reference to the DVD object removed from the front of the queue, or null if the queue is empty 
     * 
     * NOTE: an exception will be thrown if an attempt is made to remove an item
     * from an empty queue.
     */
    public PhoneInfo removeFromQueue()
    {
        PhoneInfo callerRemoved; // stores a reference to the removed item
        
        try
        {
            // call method on queue object which removes and returns a reference to the 
            // item at the front of the queue
            callerRemoved = phoneQueue.remove();
        }
        catch (NoSuchElementException e)
        {
            // attempt to remove item from an empty queue
            // no element to return
            callerRemoved = null;
        }
        
        // return item removed
        return callerRemoved;
    }

    /**
     * Determine if the queue is empty or not
     * 
     * @return True if queue is empty
     */
    public boolean isEmpty()
    {
        // call method on queue object to check if empty
        return phoneQueue.isEmpty();
    }

    /**
     * Get the length of the queue, i.e. the number of items it contains
     * 
     * @return The number of items in the queue
     */
    public int getLength()
    {
        // call method on queue object to get queue size
        return phoneQueue.size();
    }

    /**
     * Get the iterator for the queue, so it can be traversed
     * 
     * @return The iterator for the queue 
     */
    public Iterator<PhoneInfo> getIterator()
    {
        // call method on queue object to get iterator
        return phoneQueue.iterator();
    }

}
