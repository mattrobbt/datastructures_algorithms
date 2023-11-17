import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Stores a collection of DVDs and provides access to them
 */
public class phoneCollection
{
    phoneQueue phoneQueue; // a queue to store DVDs in

    /**
     * Default constructor.
     */
    public phoneCollection()
    {
        // create the DVD queue
        phoneQueue = new phoneQueue();
    }

    /**
     * A main() method to start / launch the DVD collection program
     */
    public static void main(String[] args)
    {
        // create instance of DVD collection object
        phoneCollection switchboard = new phoneCollection();

        // call method to display menu and start program running
        switchboard.processUserChoices();
    }

    /**
     * Display a menu to the user and get their (validated) choice
     * 
     * @return The user's choice
     */
    private int displayMenu()
    {
        boolean validChoiceProvided = false;
        int userChoice = 0;

        // while loop repeats until a valid choice is received from the user
        while (!validChoiceProvided)
        {
            // display menu
            System.out.println(""); // empty line for formatting purposes
            System.out.println("Please select one of the following choices");
            System.out.println("1. Add a new call to the collection.");
            System.out.println("2. Remove a call from the collection and display its details.");
            System.out.println("3. Display details of all calls in the collection.");
            System.out.println("4. Find a call in your collection");
            System.out.println("5. Display the number of calls in the collection.");
            System.out.println("6. Exit the program.");

            // get the user's choice
            userChoice = getInt("Enter choice: ");

            // if the choice is valid
            if ((userChoice >= 1) && (userChoice <= 6))
            {
                // record that a valid choice has been received, ends while loop
                validChoiceProvided = true;  
            }
            else
            {
                // display message to user
                System.out.println("Sorry, that is not a valid choice");
            }
        }

        // return the choice provided
        return userChoice;
    }

    /**
     * Process a menu selection made by the user until they decide to exit the program.
     */
    private void processUserChoices()
    {
        boolean exitChoiceSelected = false;
        int userChoice = 0  ;

        // while loop repeats until user selects option to exit
        while (!exitChoiceSelected)
        {
            // display menu of choices to user and get their choice
            userChoice = displayMenu();

            // handle selection made by user
            switch (userChoice)
            {
                case 1:
                    // add a new call to the collection
                    // call method to add a new call
                    addCall();
                    break;
                case 2:
                    // remove a DVD from the collection
                    // call method to remove a DVD
                    removeDVD();
                    break;
                case 3:
                    // display details of all DVDs in the collection
                    // call method to display all DVDs
                    displayCollection();
                    break;
                case 4:
                    // check if the DVD collection is empty or not
                    // call method to check if collection is empty
                    findCaller();
                    break;
                case 5:
                    // display the number of DVDs in the collection
                    // call method to display number of items in collection
                    displayNumberOfDVDsInCollection();
                    break;
                case 6: 
                    // exit the program
                    System.out.println("Program exiting, thank you....");
                    exitChoiceSelected = true;
                    break;
                default:
                // unrecognised choice
                break;
            }
        }
    }

    /**
     * Add a DVD to the end of the collection / queue
     */
    private void addCall()
    {
        // ask the user for the title and lead actor of the DVD
        String CallerName = getString("Please enter the name of the caller: ");
        String PhoneNumber = getString("Please enter the phone number: ");
        Date timeOfCall = getDate();
        // add the DVD to the collection
        // Option 1: create a new DVD object and add it to the DVD queue
        PhoneInfo call = new PhoneInfo(CallerName,PhoneNumber,timeOfCall);
        phoneQueue.addToQueue(call);

   
    }

    /**
     * Remove a DVD from the beginning of the collection / queue and display its details
     */
    private void removeDVD()
    {
        PhoneInfo call; // to store the DVD which is removed

        // call method on queue object to remove and return DVD at front of queue
        call = phoneQueue.removeFromQueue();

        // if valid DVD retrieved
        if (call != null)
        {
            // display the DVD details
            System.out.println("The following call has been removed from your collection.");
            System.out.println("Caller title: " + call.getCallerName());        
            System.out.println("Number of Call: " + call.getPhoneNumber());
        }
        else
        {
            // no DVD obtained, the collection may be empty
            System.out.println("Failed to remove DVD from your collection. Your collection may be empty.");
        }
    }

    /**
     * Display all items in the collection
     */
    private void displayCollection()
    {
        // if the queue isn't empty
        if (!phoneQueue.isEmpty())
        {
            // get the iterator for the dvd queue
            Iterator<PhoneInfo> iterator = phoneQueue.getIterator();

            // while still items in the collection to iterate through
            while (iterator.hasNext())
            {
                // get the next DVD in the queue
                PhoneInfo nextCall = iterator.next();

                // display its details
                System.out.println("Next Caller Name: '" + nextCall.getCallerName() + "' Caller Number: " + nextCall.getPhoneNumber() + " Date: " + nextCall.getTimeOfCall());
            }
        }
        else
        {
            System.out.println("Sorry, the collection is empty. No items to display");
        }
    }

    /**
     * Find a DVD in the collection, e.g. based on its title or name of lead actor
     */
    private void findCaller()
    {
        // store the title provided
        String titleToSearchFor = getString("Please enter the caller name to search for: ");

        // iterate through the DVD collection until a matching DVD is found - as below

        // get an iterator for the collection
        Iterator<PhoneInfo> iterator = phoneQueue.getIterator();

        // a variable to store the DVD which is found (or not)
        PhoneInfo callFound = null;

        // while we haven't reached the end of the collection and DVD not found
        while ((iterator.hasNext()) && (callFound == null))
        {
            // get the next DVD in the queue
            PhoneInfo nextcall = iterator.next();

            // if the title of this DVD matches the one we are looking for
            if (nextcall.getCallerName().equals(titleToSearchFor))
            {
                // store this as a the DVD found
                callFound = nextcall;
            }
            else
            {
                // do nothing, we will automatically progress to the next item in the collection
            }
        }

        // if a DVD was found
        if (callFound != null)
        {
            // display details of DVD found            
            System.out.println("The following Call was found in your Switchboard.");
            System.out.println("Caller Name title: " + callFound.getCallerName());        
            System.out.println("Call Number: " + callFound.getPhoneNumber());
            System.out.println("Call Date: " + callFound.getTimeOfCall());
        }
        else
        {
            // inform user that no DVD was found
            System.out.println("Sorry, no Caller with that title was found");
        }
    }

    /**
     * Display the number of DVDs in the collection
     */
    private void displayNumberOfDVDsInCollection()
    {
        System.out.println("You have " + phoneQueue.getLength() + " calls in your switchboard");
    }
    
    /**
     * Uses Scanner to get a new String from the user
     */
    public String getString(String userPrompt)
    {
    	Scanner s = new Scanner(System.in);
		System.out.print(userPrompt);
		while (!s.hasNext())
		{
			s.next();
			System.out.print(userPrompt);
		}
		
		return s.next();
    }
    
	public int getInt(String userPrompt)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print(userPrompt);
		while (!s.hasNextInt())
		{
			s.next();
			System.out.print(userPrompt);
		}
		
		int num = s.nextInt();
		return num;
	}
	
	public Date getDate()
    {
        Date time_now = new Date();
        long date;
        
        date = time_now.getTime(); 
        Date d = new Date(date);
        return d;
    }
	
}
