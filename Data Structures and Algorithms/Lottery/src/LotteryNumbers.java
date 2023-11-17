import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.util.Random;
/**
 * Date Created 08/02/2018
 * Time: 15:38 
 */

/**
 * @author matthewrobb
 *
 */
public class LotteryNumbers {

	private Set<Integer> lotteryNumbers;
	private Set<Integer> userNumbers;
	private String name;
	private int lottery_max = 10;
	
	
	public LotteryNumbers(){
		lotteryNumbers = new HashSet<Integer>();
		userNumbers = new HashSet<Integer>();
		
		
	}
	public void lotteryRange() {
		int range;
		do {
		System.out.println("What type of lottery would you like to enter:");
		System.out.println("1. Small Lottery");
		System.out.println("2. Large Lottery");
		Scanner choice = new Scanner(System.in);
		range = choice.nextInt();
		}while(range > 2 || range < 1);
		if(range==1) {
			lottery_max = 11;
		}
		else if(range==2) {
			lottery_max=49;
		}
		
	}
	public void getNumbers() {
		for(int x=0;x<6;x++ ) {
			int numberInput;
			do {
				System.out.print("Enter Users name: ");
				Scanner nameGetter = new Scanner(System.in);
				name = nameGetter.nextLine();
				System.out.println("Enter lottery number " + (x+1) + " that is less than " + lottery_max + ": " );
				Scanner Input = new Scanner(System.in);
				numberInput = Input.nextInt();
				if(numberInput > lottery_max) {
					System.out.println("Error invalid number");
				}
			}while(numberInput > lottery_max || numberInput < 1);
			userNumbers.add(numberInput);
			
		}
	}
	
	public void randNumbers() {
		Random randGenerator = new Random();
		int num;
		for(int x=0;x<6;x++ ) {
			num = (randGenerator.nextInt(lottery_max)) + 1 ;
			lotteryNumbers.add(num);
		} 
		
	}
	
	public void checkNumbers() {
		if(userNumbers.retainAll(lotteryNumbers) == false) {
			System.out.println("You have won the £1,000,000,000 prize!");
		}
		int numbersInLotto = 0;
		Iterator iterator = userNumbers.iterator();
		while(iterator.hasNext()){
			  int element = (int) iterator.next();
			  numbersInLotto++;
			  System.out.println(element);
			}
		if(numbersInLotto == 3) {
			System.out.println("You have 3 numbers in the lottery you've won £25!");
		}
		else if(numbersInLotto == 4) {
			System.out.println("You have 4 numbers in the lottery you've won £100!");
		}
		else if(numbersInLotto == 5) {
			System.out.println("You have 5 numbers in the lottery you've won £1000!");
		}
	}
	
}