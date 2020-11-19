package Visuel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button connexion;

    public Controller() {
    }

    @FXML
    public void initialize() { }

    public void buttonlogin(ActionEvent event) throws Exception {

        Stage stage;
        Parent root;
        stage = (Stage) connexion.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        ControllerAccueil AccueilController = new ControllerAccueil();
    }
}





