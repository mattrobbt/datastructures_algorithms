import java.util.Scanner;

/**
 * 
 */

/**
 * @author matthewrobb
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Tester RPNtest;
		RPNtest = new Tester();
		RPNtest.processUserChoice();
	
	}
	public void RPNTester() {
		Calculator myRPN;
		myRPN = new Calculator();
		myRPN.rpn();
		
	}
	public static void displayMenu() {
		System.out.println("Welcome to Matt's RPN Calculator!" + "\n");
		System.out.println("Please select one of the options below");
		System.out.println("1 Calculator Instructions");
		System.out.println("2 Run the Calculator");
		System.out.println("3 Run Automated Test Method");
		System.out.println("4 Create a Stack");
		System.out.println("5 Exit");
	}
	public static void processUserChoice() {
		int getChoice;
		do {
			displayMenu();
			System.out.println(" ");
			Scanner choiceListener = new Scanner(System.in); 
			getChoice = choiceListener.nextInt();
			
			if (getChoice == 1) {
				System.out.println("Select option 2 back in the menu.");
				System.out.println("Input rpn calculation as stated below");
				System.out.println("4,5,6,+,-");
				System.out.println("This will do 6 + 5 and then 4 - 11");
				System.out.println("The answer should be -7");
				processUserChoice();
			}
			
			else if (getChoice == 2) {
				Calculator myRPN;
				myRPN = new Calculator();
				myRPN.rpn();
			}
			else if (getChoice == 3) {
				autoStack();
			}
			else if (getChoice == 4) {
				stackMenu();
			}
			
			
				
		}while (getChoice != 5);		
	}
	public static void stackMenu() {
		Stack myStack;
		myStack = new Stack();
		int getChoice;
		do {
			System.out.println("Stack has been created!");
			System.out.println("1 Push to Stack");
			System.out.println("2 Pop from Stack");
			System.out.println("3 Print Stack");
			System.out.println("4 Exit");
			Scanner choiceListener = new Scanner(System.in); 
			getChoice = choiceListener.nextInt();
			
			if (getChoice == 1) {
				int addToStack;
				System.out.println("Enter number to push: ");
				Scanner numListener = new Scanner(System.in); 
				addToStack = choiceListener.nextInt();
				myStack.push(addToStack);
			
			}
			
			else if (getChoice == 2) {
				if(myStack.isStackEmpty()==false) {
					myStack.pop();
				}
				else {
					System.out.println("Error the stack is empty!");
				}
			}
			else if (getChoice == 3) {
				myStack.printStack();
			}
			
			
			
				
		}while (getChoice != 4);	
	}
	public static void autoStack() {
		Stack myStack;
		myStack = new Stack();
		System.out.println("Creating new stack");
		myStack.push(4);
		System.out.println("Pushing 4,6,9 to stack");
		myStack.push(6);
		myStack.push(9);
		System.out.println("Printing stack");
		myStack.printStack();
		System.out.println("Popping from stack");
		myStack.pop();
		myStack.printStack();
		
		
	}
}
