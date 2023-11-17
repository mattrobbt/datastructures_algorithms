import java.util.Scanner;
/**
 * 
 */

/**
 * @author matthewrobb
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public void rpn() {
		float num1;
		float num2;
		float answer = 0;
		Stack myStack;
		myStack = new Stack();
		String[] parts;
		do {
			System.out.println("Enter numbers Ex. (5,4,+): ");
			Scanner numgetter = new Scanner(System.in);
			String line = numgetter.nextLine();
			parts = line.split(",");
		}while(inputChecker(parts) == true);
		
        String operator; 
        int operand;
        int numNumbers = 0;
        for(int i=0;i<parts.length; i++)
        {
            if (parts[i].equals("+"))
            {
            	num1 = myStack.pop();
            	num2 = myStack.pop();
            	answer = num1 + num2;
            	myStack.push(answer);
            }
            else if (parts[i].equals("-"))
            {	
            	num1 = myStack.pop();
            	num2 = myStack.pop();
            	answer = num2 - num1;
            	myStack.push(answer);
            }
            else if (parts[i].equals("*"))
            {
            	num1 = myStack.pop();
            	num2 = myStack.pop();
            	answer = num1 * num2;
            	myStack.push(answer);
            }
            else if (parts[i].equals("/"))
            {
            	num1 = myStack.pop();
            	num2 = myStack.pop();
            	answer = num2 / num1;
            	myStack.push(answer);
            }
            
            else
            {
                myStack.push(Integer.parseInt(parts[i]));
                numNumbers++;
            }
            
           
        }
        
        myStack.printStack();
        myStack.pop();
		if(myStack.isStackEmpty()==false) {
			System.out.println("Error stack is not null!");
		}
	
			
		
		
	}
	public boolean inputChecker(String[] parts) {
		return false;
		
	}
	

	
}
