package sample;

import java.io.IOException;

public class TestDeserializeHouseList {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataHandler.readHouseList("housesAsObjects.dat");
    }

}
