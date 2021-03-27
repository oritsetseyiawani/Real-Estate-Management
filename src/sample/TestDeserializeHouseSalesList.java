package sample;

import java.io.IOException;

public class TestDeserializeHouseSalesList {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataHandler.readHouseSalesInvoiceList("houseSalesInvoiceListAsObjects.dat");
    }
}
