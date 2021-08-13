import java.util.ArrayList;

public class Player {
	ArrayList<Card> hand = new ArrayList<Card>(12);

	static void Deck() {
	}

	public Player() {
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	int valueOfHand(int value) {
		return value;
	}

	boolean stand(int otherPlayerValue) {
		return false;

	}

	void hit() {

	}

	boolean bust(int handValue) {
		return false;

	}
}
