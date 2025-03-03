package hi.verkefni.vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
public class VelkominnController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button buttonOne;
    @FXML
    private Button buttonTwo;
    @FXML
    private Button buttonThree;
    @FXML
    private ButtonBar newButtonbar;

    @FXML
    protected void initialize() {
        buttonOne = new Button("Back");
        buttonTwo = new Button("Accept");
        buttonThree = new Button("Cancel");

        newButtonbar = new ButtonBar();
        newButtonbar.getButtons().addAll(buttonOne, buttonTwo, buttonThree);
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
