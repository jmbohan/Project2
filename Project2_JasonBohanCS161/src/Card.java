import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card extends ImageView {

	static String[] FACES = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	static int HEIGHT = 130;
	private static String Card;
	String face;

	// TODO
	Card(String face) {
		super(Card);
		Card card = new Card(face);
		Image cardFace = new Image("file:10_Spades");
		// ImageView
		ImageView imageView = new ImageView(cardFace);

		return;

	}

	String getFace() {
		return face;
	}

	// TODO

	int valueOF(int cardValue) {

		return cardValue;

	}

}
