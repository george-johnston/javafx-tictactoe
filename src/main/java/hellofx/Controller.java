package hellofx;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller {
	
	private final static String XTURN = "Player X's Turn";
	private final static String OTURN = "Player O's Turn";
	boolean playerX = true;
	
//	int [][] winningArray = {{1,2,3}, {4,5,6}, {7,8,9},
//							 {1,4,7}, {2,5,8}, {3,6,9},
//							 {1,5,9}, {3,5,7}};
	
	
	
	//String[] movesPlayed = new String[10];
	
	void markField(TextField field) {
		
		if (playerX) {
			field.setText("X");
			playerTurnText.setText(OTURN);
			System.out.println(field.getClass().getName());
		} else {
			field.setText("O");
			playerTurnText.setText(XTURN);
		}
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
    
    TextField[][] winningFieldArray = {{field1,field2,field3}, {field4,field5,field6}, {field7,field8,field9},
			 						  {field1,field4,field7}, {field2,field5,field8}, {field3,field6,field9},
	 								  {field1,field5,field9}, {field3,field5,field7}};
    ArrayList<TextField[]> winArray = new ArrayList<>();
    
	
    void checkVictory(String whoPlayed) {
    	
		for (TextField[] win : winningFieldArray) {
			int streak = 0;
			for (TextField field : win) {
				System.out.println("field value: " + field1.getText());
				System.out.println("field value: " + field.getText());
				if (field.getText().equals(whoPlayed)){
					streak++;
				} else {
					break;
				}
			}
			if (streak == 3) {
				//Winner logic
				System.out.println(whoPlayed + " WINS!");
				break;
			}
		}
	}

    @FXML
    /** for loop taken from https://stackoverflow.com/questions/19804751/get-all-text-fields-values-and-id-in-javafx
     * 
     * @param event
     */
    void buttonClick(ActionEvent event) {           
    	for (Node node : anchor.getChildren()) {
    	    System.out.println("Id: " + node.getId());
    	    if (node instanceof TextField) {
 
    	        ((TextField)node).setText("");
    	    }
    	}
    	playerX = true;
    	playerTurnText.setText(XTURN);

    }

    @FXML
    void field1Click(MouseEvent event) {
    	String whoPlayed = (playerX ? "X" : "O");
    	TextField field = (TextField)event.getSource();
    	if (field.getText().equals("")) {
    		markField(field);
    		//checkVictory(whoPlayed);
    	}    	
    }

    @FXML
    void field2Click(MouseEvent event) {
    	markField((TextField)event.getSource());

    }

    @FXML
    void field3Click(MouseEvent event) {
    	markField((TextField)event.getSource());

    }

    @FXML
    void field4Click(MouseEvent event) {
    	markField((TextField)event.getSource());

    }

    @FXML
    void field5Click(MouseEvent event) {
    	markField((TextField)event.getSource());

    }

    @FXML
    void field6Click(MouseEvent event) {
    	markField((TextField)event.getSource());

    }

    @FXML
    void field7Click(MouseEvent event) {
    	markField((TextField)event.getSource());

    }

    @FXML
    void field8Click(MouseEvent event) {
    	markField((TextField)event.getSource());

    }

    @FXML
    void field9Click(MouseEvent event) {
    	markField((TextField)event.getSource());

    }

}


//
//	private Text text = new Text();
//	private boolean turnFlag = true;
//	
//	TextField markTile() {
//		if (turnFlag) {
//			TextField text = new TextField("X"); 
//			text.setFont(Font.font(72));
//			return text;
//		}
//		return null;
//	}
//	
//
//    @FXML
//    private Text playerTurnText;
//
//    @FXML
//    void buttonClick(ActionEvent event) {
//
//    }
//
//    @FXML
//    void tile1Click(MouseEvent event) {
//    	
//    	//anchor.getChildren().add(markTile());
//    	//anchor.getChildren();
//    	tile1.getChildren().get(0).setTranslateX(100);
//    	System.out.println("tile 1 clicked");
//
//    }
//
//    @FXML
//    void tile2Click(MouseEvent event) {
//    	tile2.getChildren().get(0);
//    	tile2text.setText("O");
//
//    }
//    
//    @FXML
//    void tile2textClick(MouseEvent event) {
//    	tile2text.setText("O");
//    	System.out.println("Textfield 2 clicked");
//
//    }

