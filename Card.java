// Tingchun Pan
import java.util.ArrayList;

public class Card {
private Suit suit;
private Value value;

public Card(Suit suit, Value value){
	this.suit=suit;
	this.value=value;
	
}

public enum Suit {
	CLUBS, HEARTS, DIAMONDS, SPADES
}
public enum Value {
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

}
public Suit getSuit() {
	return this.suit;
}
public void setSuit(Suit s) {
	suit=s;
} 
public Value getValue() {
	return this.value;
}
public void setValue(Value v) {
	value=v;
} 


public ArrayList<Integer> getNumericalValue(){
	ArrayList<Integer> value = new ArrayList<Integer>();
	if (Value.ACE.equals(getValue())) {
		value.add(1);
		value.add(11);
	  
	}
	else if(Value.TWO.equals(getValue()))
		value.add(2);
	else if(Value.THREE.equals(getValue()))
		value.add(3);
	else if(Value.FOUR.equals(getValue()))
		value.add(4);
	else if(Value.FIVE.equals(getValue()))
		value.add(5);
	else if(Value.SIX.equals(getValue()))
		value.add(6);
	else if(Value.SEVEN.equals(getValue()))
		value.add(7);
	else if(Value.EIGHT.equals(getValue()))
		value.add(8);
	else if(Value.NINE.equals(getValue()))
		value.add(9);
	else if(Value.TEN.equals(getValue()))
		value.add(10);
	else if(Value.JACK.equals(getValue()))
		value.add(10);
	else if(Value.QUEEN.equals(getValue()))
		value.add(10);
	else if(Value.KING.equals(getValue()))
		value.add(10);
	
	return value; 
 
}
  
}
