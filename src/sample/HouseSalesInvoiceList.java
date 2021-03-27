package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HouseSalesInvoiceList implements Serializable {

    List<HouseSale> houseSaleList;
    private static final long serialVersionUID = 1L;

    public HouseSalesInvoiceList() {
        houseSaleList = new ArrayList<HouseSale>();
    }




    public void add(HouseSale houseSale){
        houseSaleList.add(houseSale);
        System.out.println(houseSale);
        System.out.println("Invoice has been added to the list of invoices");
    }
    public void displayHouseSalesInvoiceList(){
        System.out.println(houseSaleList);
    }

    public void displayHouseSalesInvoiceListSize(){
        System.out.println("The size of the houseArrayList is  "+ houseSaleList.size());
    }

    public List<HouseSale> getHouseSalesInvoiceList() {
        return houseSaleList;
    }

    public int getSize(){
        return houseSaleList.size();
    }
    @Override
    public String toString() {

        return   "SALES INVOICE LIST" + houseSaleList +"\n";



    }







}
