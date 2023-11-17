import java.util.LinkedList;
import java.util.Scanner;
/**
 * @author matthewrobb
 *
 */
public class LotteryPlayer {
	LinkedList<LotteryNumbers> players = new LinkedList<LotteryNumbers>();
	/**
	 * @param args
	 */
	public LotteryPlayer() {
		LotteryNumbers lottery = new LotteryNumbers();
		lottery.lotteryRange();
		lottery.randNumbers();
		for(int i = 0; i<numberOfPlayers();i++) {
			players.add(lottery.getNumbers());
		}
		
		
	}
	public int numberOfPlayers() {
		Scanner choice = new Scanner(System.in);
		int numPlayers = choice.nextInt();
		return numPlayers;
	}

}
