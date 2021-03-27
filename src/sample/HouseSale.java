package sample;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;

public class HouseSale implements Serializable {
    private static final long serialVersionUID = 1L;
    private House house;
    private Customer customer;
    private LocalDate purchaseDate;
    private static int id = 0;
    private int noOfHousesSold = id++;
    private int invoiceNo;

    private CustomerList customerList;
    private HouseList houseList;

    public void initialize() throws ClassNotFoundException, IOException {
        //houseList = DataHandler.readHouseList("houseSalesAsObjects.dat");
        //System.out.println("Initialised House Sale List");
//        houseSalesInvoiceList = DataHandler.readSalesInvoiceList("salesInvoiceListAsObjects.dat");
    }


    public HouseSale(House house, Customer customer) throws IOException {
        this.house = house;
        this.customer = customer;
        purchaseDate = LocalDate.now();
        invoiceNo = id;
        this.noOfHousesSold = id;
//        this.invoiceNo = noOfHousesSold;

        house.setOnOffer(true); //The house is now on an offer
        house.setForSale(true); // The house has been sold
        //DataHandler.WriteToHouseFileAsObject(houseList,"housesAsObjects.dat");
//        houseSalesInvoiceList.addInvoice(generateSalesInvoice());
//
//        DataHandler.writeToSalesInvoiceFileAsObject(houseSalesInvoiceList,"housesAsObjects.dat");
        System.out.println(generateHouseSalesInvoice());
//
}

    @Override
    public String toString() {

        String result = "";
        result+=        "\n\nRECEIPT ID:" +this.invoiceNo +"\n";
        result+=        "                            *** APPROVED ***\n";
        result+=        "                         *** OFFICIAL COPY ***\n";
        result+=        "Date: "+ purchaseDate + "\n";
        result+=        "CUSTOMER NAME: "+ customer.getFirstName() +" " +customer.getLastName() +"\n";
        result+=        "HOUSE DETAILS:";
        result+=        ""+ house.toStringForInvoice();
        result+=        "Agent Fee: £"+ house.getAgentFee()+ "\n";
        result+=        "House Price: £"+ house.getSellingPrice()+ "\n";
        result+=        "                         ****************\n";
        result+=        "                             £" + house.getTotalPrice() + "\n";
        result+=        "                         ****************\n";
        result+=        "                Transaction Completed Succesfully\n\n";



        return result;
        }



    public String generateHouseSalesInvoice(){
        String result = "                            *** APPROVED ***\n";
        result+=        "                         *** CUSTOMER COPY ***\n";
        result+=        "Date: "+ purchaseDate + "\n";
        result+=        "CUSTOMER NAME: "+ customer.getFirstName() +" " +customer.getLastName() +"\n";
        result+=        "HOUSE DETAILS:";
        result+=        ""+ house.toStringForInvoice();
        result+=        "Agent Fee: "+ house.getAgentFee()+ "\n";
        result+=        "House Price: £"+ house.getSellingPrice()+ "\n";
        result+=        "                         ****************\n";
        result+=        "                             £" + house.getTotalPrice() + "\n";
        result+=        "                         ****************\n";
        result+=        "                Transaction Completed Succesfully";



        return result;
    }



    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
