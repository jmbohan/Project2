
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BlackJackTableGUI extends Application {
	public static void main(String[] args) {
		// Launch the application.
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label dealer = new Label("Dealer Hand");
		Label player = new Label("Player Hand");
		Label dealerValue = new Label("Value: ");
		Label playerValue = new Label("Value: ");
		Label dealerScore = new Label("Dealer Score: ");
		Label playerScore = new Label("Player Score: ");

		// ButtonBar
		Button start = new Button("Start");
		Button hit = new Button("Hit");
		Button stand = new Button("Stand");
		ButtonBar buttonBar = new ButtonBar();
		hit.setDisable(true);
		stand.setDisable(true);
		buttonBar.getButtons().addAll(start, hit, stand);
		HBox buttons = new HBox(buttonBar);
		buttons.setAlignment(Pos.CENTER);

		// top Hbox
		HBox topHbox = new HBox();
		topHbox.setSpacing(100);
		topHbox.setPadding(new Insets(50));
		topHbox.setAlignment(Pos.BASELINE_CENTER);
		topHbox.getChildren().addAll(dealer, dealerValue);

		// dealer HBox

		// middle Hbox

		HBox middleHBox = new HBox();
		middleHBox.setSpacing(100);
		middleHBox.setPadding(new Insets(50));
		middleHBox.setAlignment(Pos.CENTER);
		middleHBox.getChildren().addAll(player, playerValue);
		// bottom VBox
		VBox bottomVBox = new VBox();
		bottomVBox.setAlignment(Pos.BOTTOM_LEFT);
		bottomVBox.getChildren().addAll(playerScore, dealerScore);

		// background
		HBox background = new HBox();

		background.getChildren().addAll(topHbox, middleHBox, buttons, bottomVBox);
		background.getStyleClass().add("background");
		Scene blackjackScene = new Scene(background, 1200, 650);
		blackjackScene.getStylesheets().add("Style.css");
		primaryStage.setTitle("Blackjack");
		primaryStage.setScene(blackjackScene);
		primaryStage.show();

	}

	void startGame() {

	}

	void updateHand(Player p, HBox box, Label handValue) {

	}

	void endGame() {

	}

}
