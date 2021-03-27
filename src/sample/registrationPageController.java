package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.IOException;
import java.time.LocalDate;

public class registrationPageController {
    @FXML
    private Button submitButton;

    @FXML
    private DatePicker birthDatePicker;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField emailAddressTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private Label registrationSuccess;

    @FXML
    private Button displayMembersButton;

    @FXML
    private TextField sexTextField;

    @FXML
    private TextField addressTextField;

    @FXML
    private TextField lastNameTextField;

      @FXML
    private TextField stateOfOriginTextField;

    @FXML
    private Button backButton;

    @FXML
    private Button logOutButton;

    private CustomerList customerList;
    private Customer customer;

    public void initialize() throws ClassNotFoundException, IOException{
        customerList = DataHandler.readCustomerList("customersAsObjects.dat");
        customer = new Customer();
        System.out.println("Initialise");
        submitButton.setVisible(true);
        registrationSuccess.setVisible(false);
    }

    public void setBirthDatePicker(){
        LocalDate birthdate = birthDatePicker.getValue();
        System.out.println(birthdate);
    }

    public void submitButtonListener (ActionEvent e) throws IOException, ClassNotFoundException {

        customer.setFirstName(firstNameTextField.getText());
        customer.setLastName(lastNameTextField.getText());
        customer.setEmailAddress(emailAddressTextField.getText());
        customer.setPhoneNumber(phoneNumberTextField.getText());
        customer.setSex(sexTextField.getText());
        customer.setBirthDate(birthDatePicker.getValue());
        customer.setAddress(addressTextField.getText());
        customer.setStateOfOrigin(stateOfOriginTextField.getText());
        customerList.addCustomer(customer);
        System.out.println("");
        System.out.println("");
        customerList.displayCustomerArrayList();
        DataHandler.WriteToFileAsObject(customerList,"customersAsObjects.dat");
        firstNameTextField.clear();
        lastNameTextField.clear();
        emailAddressTextField.clear();
        phoneNumberTextField.clear();
        sexTextField.clear();
        birthDatePicker.hide();
        addressTextField.clear();
        stateOfOriginTextField.clear();
        addressTextField.clear();

        submitButton.setVisible(false);
        registrationSuccess.setVisible(true);
    }

    public void displayMembersButtonListener (ActionEvent e) throws Exception, IOException, EOFException {
        customerList.displayCustomerArrayListSize();
        DataHandler.readCustomerList("customersAsObjects.dat");
    }


    public void logOutButtonListener (ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        //Build the scene graph
        Scene loginScene = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setTitle("Login Page");
        stage.setScene(loginScene);
        stage.show();
    }

    public void backButtonListener (ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("welcomePage.fxml"));
        //Build the scene graph
        Scene loginScene = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setTitle("Welcome Page");
        stage.setScene(loginScene);
        stage.show();
    }

}
