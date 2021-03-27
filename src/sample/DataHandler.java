package sample;

import java.io.*;

public class DataHandler {

    public static void WriteToFileAsObject(CustomerList list, String filename) throws IOException {
        //To create the stream objects

        try {
            FileOutputStream outputStream = new FileOutputStream(filename);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            //Write the serialized object to file
            objectOutputStream.writeObject(list);

            //Close the File
            objectOutputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("The serialized objects were written to "+filename);
    }

    public static void WriteToHouseFileAsObject(HouseList list, String filename) throws IOException {
        //To create the stream objects

        try {
            FileOutputStream outputStream = new FileOutputStream(filename);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            //Write the serialized object to file
            objectOutputStream.writeObject(list);

            //Close the File
            objectOutputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("The serialized objects were written to "+filename);
    }

    public static CustomerList readCustomerList(String filename) throws IOException, ClassNotFoundException {

        CustomerList list = new CustomerList();

        try{
            File f = new File(filename);
            FileInputStream inputStream;
            ObjectInputStream objectInputStream = null;

            if(f.exists()){
                inputStream = new FileInputStream(filename);
                objectInputStream = new ObjectInputStream(inputStream);
            }

            else{
                System.out.println("File  "+filename +"does not exist");
                return list;
            }

            if(f.length() > 0){
                //Read the serialized objects from the file
                list = (CustomerList) objectInputStream.readObject();


                //Close the file
                objectInputStream.close();

            }
            else{
                System.out.println("File  "+filename + "is empty");
            }

        }

        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("List size: " + list.getCustomerList().size());

        if(list.getCustomerList().size() > 0){
            System.out.println("Customers in the list are stated below: ");
            System.out.println();
            int j =1;
            for(int i = 0; i<list.getCustomerList().size(); i++){

                System.out.println("No " + j +".");
                System.out.println("First Name: " +list.getCustomerList().get(i).getFirstName() );
                System.out.println("Last Name: " +list.getCustomerList().get(i).getLastName() );
                System.out.println("Email address: " +list.getCustomerList().get(i).getEmailAddress() );
                System.out.println("Address: " +list.getCustomerList().get(i).getAddress() );
                System.out.println("Age: " +list.getCustomerList().get(i).getBirthDate() );
                System.out.println("Phone No: " +list.getCustomerList().get(i).getPhoneNumber() );
                System.out.println("State of Origin: " +list.getCustomerList().get(i).getStateOfOrigin() );
                System.out.println("Sex: " +list.getCustomerList().get(i).getSex());
                j++;
                System.out.println();

            }

        }
        else{
            System.out.println("List is empty");
        }
        return list;
    }

    public static HouseList readHouseList (String filename) throws IOException, ClassNotFoundException {

        HouseList list = new HouseList();

        try{
            File f = new File(filename);
            FileInputStream inputStream;
            ObjectInputStream objectInputStream = null;

            if(f.exists()){
                inputStream = new FileInputStream(filename);
                objectInputStream = new ObjectInputStream(inputStream);
            }

            else{
                System.out.println("File  "+filename +"does not exist");
                return list;
            }

            if(f.length() > 0){
                //Read the serialized objects from the file
                list = (HouseList) objectInputStream.readObject();


                //Close the file
                objectInputStream.close();

            }
            else{
                System.out.println("File  "+filename + "is empty");
            }

        }

        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("List size: " + list.getHouseArrayList().size());

        if(list.getHouseArrayList().size() > 0){
            System.out.println("Houses in the list are stated below: ");
            System.out.println();
            int j =1;
            for(int i=0; i<list.getHouseArrayList().size();i++){

                System.out.println("No " + j +".");
                System.out.println("Location: " +list.getHouseArrayList().get(i).getLocation() );
                System.out.println("Type: " +list.getHouseArrayList().get(i).getType() );
                System.out.println("Number of Bathrooms: " +list.getHouseArrayList().get(i).getNumberOfBathrooms() );
                System.out.println("Number of Bedrooms: " +list.getHouseArrayList().get(i).getNumberOfBedrooms() );
                System.out.println("Number of Living Rooms: " +list.getHouseArrayList().get(i).getNumberOfLivingRooms() );
                System.out.println("Has Garden? : " +list.getHouseArrayList().get(i).isHasGarden() );
                System.out.println("Has Car Park? : " +list.getHouseArrayList().get(i).isHasCarPark() );
                System.out.println("Has Pool? : " +list.getHouseArrayList().get(i).isHasPool());
                System.out.println("For Rent? : " +list.getHouseArrayList().get(i).isForRent());
                System.out.println("For Sale? : " +list.getHouseArrayList().get(i).isForSale() );
                System.out.println("Is On Offer?: " +list.getHouseArrayList().get(i).isOnOffer());
                j++;
                System.out.println();

            }

        }
        else{
            System.out.println("List is empty");
        }
        return list;
    }

    public static HouseSalesInvoiceList readHouseSalesInvoiceList (String filename) throws IOException, ClassNotFoundException {

        HouseSalesInvoiceList list = new HouseSalesInvoiceList();

        try{
            File f = new File(filename);
            FileInputStream inputStream;
            ObjectInputStream objectInputStream = null;

            if(f.exists()){
                inputStream = new FileInputStream(filename);
                objectInputStream = new ObjectInputStream(inputStream);
            }

            else{
                System.out.println("File  "+filename +"does not exist");
                return list;
            }

            if(f.length() > 0){
                //Read the serialized objects from the file
                list = (HouseSalesInvoiceList) objectInputStream.readObject();


                //Close the file
                objectInputStream.close();

            }
            else{
                System.out.println("File  "+filename + "is empty");
            }

        }

        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("List size: " + list.getHouseSalesInvoiceList().size());

        if(list.getHouseSalesInvoiceList().size() > 0){
            System.out.println("Houses in the list are stated below: ");
            System.out.println();
            int j =1;
            for(int i=0; i<list.getHouseSalesInvoiceList().size();i++){

                System.out.println("No " + j +".");
                System.out.println("Purchase Date: " +list.getHouseSalesInvoiceList().get(i).getPurchaseDate() );
                System.out.println("Type: " +list.getHouseSalesInvoiceList().get(i).generateHouseSalesInvoice());
                j++;
                System.out.println();

            }

        }
        else{
            System.out.println("List is empty");
        }
        return list;
    }

    public static void writeToHouseSalesInvoiceListAsObject(HouseSalesInvoiceList list, String filename) throws IOException {
        //To create the stream objects

        try {
            FileOutputStream outputStream = new FileOutputStream(filename);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            //Write the serialized object to file
            objectOutputStream.writeObject(list);

            //Close the File
            objectOutputStream.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("The serialized objects were written to "+filename);
    }

}


