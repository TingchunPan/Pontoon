//Tingchun Pan 
import java.util.ArrayList;

public class Player {
	private String nickName;
	private ArrayList<Card> playerHand;
	public Player(String name) {
		nickName = name;
		playerHand = new ArrayList<>();
	}
	
	public String getName() {
		return nickName;
	}
	public void dealToPlayer(Card card) {
		 playerHand.add(card);
		
	      }
	public void removeCard(Card card) {
		playerHand.remove(card);
		 
	}
	public ArrayList<Integer> getNumericalHandValue(){
		ArrayList<Integer> values = new ArrayList<>();
		for(Card card:playerHand) {
			values.addAll(card.getNumericalValue());
		}
		return values;
	}  
public int getBestNumericalHandValue() {
	int maxValue = 0;
    for (int value : getNumericalHandValue()) {
        if (value > maxValue) {
            maxValue = value;
        }
    }
    return maxValue;
	} 

public ArrayList<Card> getCards() {
    return playerHand;
}

public int getHandSize() {
    return playerHand.size();

}

} 
