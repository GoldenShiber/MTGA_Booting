package GameEssentials;

public class Dice {

	private int sides;
	private int value;
	
	public Dice() {
		setSides(6);
	}
	
	public Dice(int sides) {
		this.setSides(sides);
	}

	public int roll() {
		value = (int) (Math.random()*sides) +1;
		return value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}
	
}
