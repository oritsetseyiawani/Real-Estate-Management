package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class purchasePageController {

        @FXML
        private ComboBox<String> customerListCombobox;

        @FXML
        private ComboBox<String> houseListComboBox;

        @FXML
        private TextField priceTextField;

        @FXML
        private TextArea invoiceTextArea;

        @FXML
        private Button purchaseButton;

        @FXML
        private Button backButton;

        @FXML
        private Button logOutButton;


        private CustomerList customerList;
        private HouseList houseList;
        private HouseSalesInvoiceList houseSalesInvoiceList;
        String selectedHouseString;
        String selectedCustomer;
        int indexOfSelectedCustomer;
        int indexOfSelectedHouse;
        House chosenHouse;
        Customer chosenCustomer;

    public void initialize() throws ClassNotFoundException, IOException {
        customerList = DataHandler.readCustomerList("customersAsObjects.dat");
        System.out.println("Initialised Customer List");
        customerListCombobox.setVisible(true);
        priceTextField.setEditable(false);
        purchaseButton.setVisible(false);
        houseSalesInvoiceList = DataHandler.readHouseSalesInvoiceList("houseSalesInvoiceListAsObjects.dat");
        System.out.println("Initialized House Sales Invoice List");

        //To create a String Array List of customers from the Customer List which is of type Customer
        ArrayList<String> customerStringArrayList = new ArrayList<String>();
        for(int i = 0; i< customerList.size();i++){
            customerStringArrayList.add(customerList.getValue(i));
        }
        customerListCombobox.getItems().addAll(customerStringArrayList);

        customerListCombobox.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                purchaseButton.setVisible(true);
                selectedCustomer = newValue;
                System.out.println("Selected Customer is "+selectedCustomer);

                for(int i = 0; i< customerList.size();i++){
                    if(selectedCustomer.equals(customerList.getValue(i))){
                        // To Set the price text field to display the price of the house selected in the combobox
                        indexOfSelectedCustomer = i;
                        chosenCustomer = customerList.customerList.get(i);
                        //priceTextField.setText(String.valueOf(houseList.getHouseArrayList().get(i).getSellingPrice()));
                    }
                }
            }
        });
        houseList = DataHandler.readHouseList("housesAsObjects.dat");
        System.out.println("Initialised House List");
        houseListComboBox.setVisible(true);
        ArrayList<String> houseStringArrayList = new ArrayList<String>();
        for(int i = 0; i< houseList.size();i++){

            if(houseList.getHouseArrayList().get(i).isOnOffer()==false) {
                houseStringArrayList.add(houseList.getValue(i));
            }
        }
        houseListComboBox.getItems().addAll(houseStringArrayList);

        houseListComboBox.valueProperty().addListener(new ChangeListener<String>() {


            @Override
            public void changed(ObservableValue observable, String oldValue, String newValue) {
                purchaseButton.setVisible(true);
                selectedHouseString = newValue;
                System.out.println("Selected House is "+ selectedHouseString);
                for(int i = 0; i< houseList.size();i++){

                    if(selectedHouseString.equals(houseList.getValue(i))){
                        indexOfSelectedHouse = i;
                        chosenHouse= houseList.houseList.get(i);
                        // To Set the price text field to display the price of the house selected in the combobox
                        priceTextField.setText("£" + (chosenHouse.getSellingPrice()));
                        System.out.println(chosenHouse);
                    }
                }
            }
        });

    }

    public void purchaseButtonListener (ActionEvent e) throws IOException {
        System.out.println("Purchase button is working");
        HouseSale houseSale = new HouseSale(chosenHouse,chosenCustomer);
        invoiceTextArea.setText(houseSale.generateHouseSalesInvoice());
        purchaseButton.setVisible(false);
        houseSalesInvoiceList.add(houseSale);
        chosenHouse.setOnOffer(true);
        chosenHouse.setForSale(false);
        DataHandler.writeToHouseSalesInvoiceListAsObject(houseSalesInvoiceList,"houseSalesInvoiceListAsObjects.dat");
        DataHandler.WriteToHouseFileAsObject(houseList,"housesAsObjects.dat");
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
