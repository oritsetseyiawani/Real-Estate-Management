package sample;

import java.io.IOException;

public class TestDeserializeMemberList {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       DataHandler.readCustomerList("studentsAsObjects.dat");
    }
}
