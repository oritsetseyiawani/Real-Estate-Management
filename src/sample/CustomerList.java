package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerList implements Serializable {
    private static final long serialVersionUID = 1L;

    List<Customer> customerList;
    public CustomerList() {
        customerList = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
        System.out.println("Customer has been added to the customerArrayList");
    }
    public void displayCustomerArrayList(){
        System.out.println(customerList);
    }

    public void displayCustomerArrayListSize(){
        System.out.println("The size of the arrayList is  "+ customerList.size());
    }

    public int size (){
        return customerList.size();
    }
    public List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
    public String toString() {
        return "customerList=" + customerList ;
    }

    public String getValue (int index){
        Customer temp =  customerList.get(index);
        return  temp.getFirstName() + " " + temp.getLastName();
    }

    public void customDisplayCustomerList(CustomerList list) {
        System.out.println("Customers in the list are stated below: ");
        System.out.println();
        int j = 1;
        for (int i = 0; i < list.getCustomerList().size(); i++) {

            System.out.println("No " + j + ".");
            System.out.println("First Name: " + list.getCustomerList().get(i).getFirstName());
            System.out.println("Last Name: " + list.getCustomerList().get(i).getLastName());
            System.out.println("Email address: " + list.getCustomerList().get(i).getEmailAddress());
            System.out.println("Address: " + list.getCustomerList().get(i).getAddress());
            System.out.println("Birth Date: " + list.getCustomerList().get(i).getBirthDate());
            System.out.println("Phone No: " + list.getCustomerList().get(i).getPhoneNumber());
            System.out.println("State of Origin: " + list.getCustomerList().get(i).getStateOfOrigin());
            System.out.println("Sex: " + list.getCustomerList().get(i).getSex());
            j++;
            System.out.println();
        }
    /*    public void writeToFile(Customer entry){

        FileWriter fw = null;
        try {
            fw = new FileWriter("Students.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(entry);
            System.out.println("Customer has been written to file");
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }




    }*/


    }
}
