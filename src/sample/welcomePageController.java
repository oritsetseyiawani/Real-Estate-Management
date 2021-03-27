package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class welcomePageController {


    @FXML
    private Button viewAllCustomersRecords;

    @FXML
    private Label welcomeMemberLabel;

    @FXML
    private Button createNewCustomerButton;

    @FXML
    private Button displayHousesForSaleButton;

    @FXML
    private TextArea textArea1;

    @FXML
    private Button purchasePropertyButton;

    @FXML
    private Button addHouseToInventoryButton;


    @FXML
    private Button logOutButton;
    private String welcomeName;
    public void setWelcomeName(String s){
        welcomeName = s;
    }
    void initialize(){
        welcomeMemberLabel.setText("Welcome Agent");
    }

    CustomerList customerList;
    HouseList houseList;
    HouseSalesInvoiceList houseSalesInvoiceList;

    public void purchasePropertyButtonOnAction (ActionEvent e) throws IOException, ClassNotFoundException{
        System.out.println("Purchase Property Button was clicked.");
        Parent root = FXMLLoader.load(getClass().getResource("purchasePage.fxml"));
        Scene purchasePropertyPage = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(purchasePropertyPage);
        stage.setTitle("Purchase Property Page");
    }


    public void viewAllCustomersRecordsButtonOnAction (ActionEvent e) throws IOException, ClassNotFoundException {
        DataHandler.readCustomerList("customersAsObjects.dat");
        customerList = DataHandler.readCustomerList("customersAsObjects.dat");
        textArea1.setText(customerList.toString());
        textArea1.setEditable(false);
    }


    public void viewAllSalesInvoicesRecordsButtonOnAction (ActionEvent e) throws IOException, ClassNotFoundException {
        DataHandler.readHouseSalesInvoiceList("houseSalesInvoiceListAsObjects.dat");
        houseSalesInvoiceList = DataHandler.readHouseSalesInvoiceList("houseSalesInvoiceListAsObjects.dat");
        textArea1.setText(houseSalesInvoiceList.toString());
    }

    public void displayHousesForSaleButtonOnAction (ActionEvent e) throws IOException, ClassNotFoundException {
        DataHandler.readHouseList("housesAsObjects.dat");
        houseList = DataHandler.readHouseList("housesAsObjects.dat");
        textArea1.setText(houseList.toString());
        textArea1.setEditable(false);
    }

    public void createNewCustomerButton (ActionEvent e)throws IOException {
        System.out.println("Create New Customer Button was clicked.");
        Parent root = FXMLLoader.load(getClass().getResource("registrationPage.fxml"));
        Scene registrationPage = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(registrationPage);
        stage.setTitle("Customer Registration Page");
    }

    public void addHouseToInventoryButtonOnAction (ActionEvent e)throws IOException {
        System.out.println("Add House To Inventory Button was clicked.");
        Parent root = FXMLLoader.load(getClass().getResource("addHousePage.fxml"));
        Scene addHousePage = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(addHousePage);
        stage.setTitle("House Registration Page");
    }

    public void logOutButtonOnAction (ActionEvent e)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        Scene logInPage = new Scene(root);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(logInPage);
    }
}
