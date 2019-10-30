package hellofx;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller {

	private final static String XTURN = "Player X's Turn";
	private final static String OTURN = "Player O's Turn";
	boolean playerX = true;

	int [][] winningArray = {{1,2,3}, {4,5,6}, {7,8,9},
							 {1,4,7}, {2,5,8}, {3,6,9},
							 {1,5,9}, {3,5,7}};

	ArrayList<String> movesPlayed = new ArrayList<String>() {{
		for (int i = 0; i < 10; i++) {
			add("");
		}
	}};
	

	void markField(TextField field) {

		if (playerX) {
			field.setText("X");
			playerTurnText.setText(OTURN);
			System.out.println(field.getClass().getName());
		} else {
			field.setText("O");
			playerTurnText.setText(XTURN);
		}
		String it = field.getId().substring(5);
		System.out.println("field played: " + it);
		movesPlayed.set(Integer.parseInt(it), (playerX ? "X" : "O"));
		
		System.out.println(movesPlayed.toString());
		playerX = !playerX;
	}

	@FXML
	private AnchorPane anchor;

	@FXML
	private Button button;

	@FXML
	private Text playerTurnText;

	@FXML
	private TextField field1;

	@FXML
	private TextField field2;

	@FXML
	private TextField field3;

	@FXML
	private TextField field4;

	@FXML
	private TextField field5;

	@FXML
	private TextField field6;

	@FXML
	private TextField field7;

	@FXML
	private TextField field8;

	@FXML
	private TextField field9;

	TextField[][] winningFieldArray = { { field1, field2, field3 }, { field4, field5, field6 },
			{ field7, field8, field9 }, { field1, field4, field7 }, { field2, field5, field8 },
			{ field3, field6, field9 }, { field1, field5, field9 }, { field3, field5, field7 } };
	
	

	void checkVictory(String whoPlayed) {

		for (int[] win : winningArray) {
			int streak = 0;
			for (int field : win) {
				if (movesPlayed.get(field).equals(whoPlayed)) {
					streak++;
				} else {
					break;
				}
			}
			if (streak == 3) {
				// Winner logic
				Alert alert = new Alert(AlertType.INFORMATION, "Player " + whoPlayed + " WINS!");
				alert.showAndWait();
				System.out.println(whoPlayed + " WINS!");
				buttonClick(new ActionEvent());
				break;
			}
		}
	}

	@FXML
	/**
	 * for loop taken from
	 * https://stackoverflow.com/questions/19804751/get-all-text-fields-values-and-id-in-javafx
	 * 
	 * @param event
	 */
	void buttonClick(ActionEvent event) {
		for (Node node : anchor.getChildren()) {
			if (node instanceof TextField) {
				((TextField) node).setText("");
			}
		}
		playerX = true;
		playerTurnText.setText(XTURN);

	}

	@FXML
	void field1Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}
	}

	@FXML
	void field2Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}

	}

	@FXML
	void field3Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}

	}

	@FXML
	void field4Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}

	}

	@FXML
	void field5Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}

	}

	@FXML
	void field6Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}

	}

	@FXML
	void field7Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}

	}

	@FXML
	void field8Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}

	}

	@FXML
	void field9Click(MouseEvent event) {
		String whoPlayed = (playerX ? "X" : "O");
		TextField field = (TextField) event.getSource();
		if (field.getText().equals("")) {
			markField(field);
			 checkVictory(whoPlayed);
		}

	}

}
