package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class AddHousePageController {

    @FXML
    private AnchorPane registrationSuccesfulLabel;

    @FXML
    private Button submitButton;

    @FXML
    private TextField locationTextField;

    @FXML
    private TextField numberOfBedroomsTextField;

    @FXML
    private TextField sellingPriceTextField;

    @FXML
    private TextField numberOfBathroomsTextField;

    @FXML
    private TextField numberOfLivingRoomsTextField;

    @FXML
    private TextField typeTextField;

    @FXML
    private TextField hasCarParkTextField;

    @FXML
    private Button backButton;

    @FXML
    private Label registrationSuccess;

    @FXML
    private Label registrationUnsuccessful;

    @FXML
    private Button logOutButton;

    @FXML
    private TextField hasGardenTextField;

    @FXML
    private TextField hasPoolTextField;

    private HouseList houseList;
    private House  house;

    public void initialize() throws ClassNotFoundException, IOException {
        houseList = DataHandler.readHouseList("housesAsObjects.dat");
        house = new House();
        System.out.println("Initialised addHousePageController");
        submitButton.setVisible(true);
        registrationSuccess.setVisible(false);
        registrationUnsuccessful.setVisible(false);
    }

        @FXML
    void backButtonListener(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("welcomePage.fxml"));
        //Build the scene graph
        Scene loginScene = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setTitle("Welcome Page");
        stage.setScene(loginScene);
        stage.show();
    }

    @FXML
    void logOutButtonListener(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        //Build the scene graph
        Scene loginScene = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setTitle("Login Page");
        stage.setScene(loginScene);
        stage.show();
    }

    @FXML
    void submitButtonListener(ActionEvent event) throws IOException {

        try {
            house.setLocation(locationTextField.getText());
            house.setNumberOfBedrooms(Integer.parseInt(numberOfBedroomsTextField.getText()));
            house.setNumberOfBathrooms(Integer.parseInt(numberOfBathroomsTextField.getText()));
            house.setNumberOfLivingRooms(Integer.parseInt(numberOfLivingRoomsTextField.getText()));
            house.setType(typeTextField.getText());
            house.setSellingPrice(Double.parseDouble(sellingPriceTextField.getText()));
            house.setOnOffer(false);
            house.setForSale(true);
            house.setAgentFee(house.calculateAgentFee());
            house.setTotalPrice(house.calculateTotalPrice());
            typeTextField.clear();
            sellingPriceTextField.clear();
            houseList.addHouse(house);
            locationTextField.clear();
            numberOfLivingRoomsTextField.clear();
            numberOfBedroomsTextField.clear();
            numberOfBathroomsTextField.clear();
            locationTextField.clear();
            typeTextField.clear();
            sellingPriceTextField.clear();
            registrationSuccesfulLabel.setVisible(true);
            registrationSuccess.setVisible(true);
            registrationUnsuccessful.setVisible(false);
            DataHandler.WriteToHouseFileAsObject(houseList,"housesAsObjects.dat");
        }
        catch (Exception e){
            System.out.println("Invalid entries, please check and try again");
            registrationUnsuccessful.setVisible(true);

        }
    }
}
