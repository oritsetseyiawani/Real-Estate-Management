package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {


    @FXML
    private Button loginButton;

    @FXML
    private Label emailAddressLabel;

    @FXML
    private Label passwordLabel;


    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField emailAddressTextField;


    @FXML
    private Button registerButton;

    public void loginButtonListener (ActionEvent e) throws IOException{

        System.out.println("Login Button was pressed");
       // welcomePageController w = new welcomePageController();
        Parent root = FXMLLoader.load(getClass().getResource("welcomePage.fxml"));
        // Build the scene graph
        Scene welcomePage = new Scene(root);
        Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        stage.setTitle("Welcome");
        stage.setScene(welcomePage);
        stage.show();
    }


    public void registerButtonListener (ActionEvent e) throws IOException {
        System.out.println("Register Button was clicked.");
        Parent node1 = FXMLLoader.load(getClass().getResource("registrationPage.fxml"));

        // Build the scene graph
        Scene scene = new Scene(node1);

        Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();
    }

}
