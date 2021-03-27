package sample;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseTest {

    @org.junit.jupiter.api.Test
    void getAgentFee() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        assertEquals(4500*1.5/100,a.getAgentFee());

    }

    @org.junit.jupiter.api.Test
    void getTotalPrice() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        assertEquals((4500*1.5/100)+4500, a.getTotalPrice());
    }

    @org.junit.jupiter.api.Test
    void setTotalPrice() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        a.setTotalPrice(5000);
        assertEquals(5000,a.getTotalPrice());
    }

    @org.junit.jupiter.api.Test
    void getLocation() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        assertEquals("Duston",a.getLocation());
    }

    @org.junit.jupiter.api.Test
    void setLocation() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        a.setLocation("Wooton");
        assertEquals("Wooton",a.getLocation());
    }

    @org.junit.jupiter.api.Test
    void getNumberOfBedrooms() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        assertEquals(4,a.getNumberOfBedrooms());
    }

    @org.junit.jupiter.api.Test
    void setNumberOfBedrooms() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        a.setNumberOfBedrooms(3);
        assertEquals(3,a.getNumberOfBedrooms());
    }

    @org.junit.jupiter.api.Test
    void getNumberOfBathrooms() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        assertEquals(2, a.getNumberOfBathrooms());
    }

    @org.junit.jupiter.api.Test
    void setNumberOfBathrooms() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        a.setNumberOfBathrooms(1);
        assertEquals(1,a.getNumberOfBathrooms());
    }

    @org.junit.jupiter.api.Test
    void getNumberOfLivingRooms() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        assertEquals(2, a.getNumberOfLivingRooms());
    }

    @org.junit.jupiter.api.Test
    void setNumberOfLivingRooms() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        a.setNumberOfLivingRooms(1);
        assertEquals(1, a.getNumberOfLivingRooms());
    }

    @org.junit.jupiter.api.Test
    void getType() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        assertEquals("Flat", a.getType());
    }

    @org.junit.jupiter.api.Test
    void setType() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        a.setType("Detached");
        assertEquals("Detached", a.getType());
    }

    @org.junit.jupiter.api.Test
    void getSellingPrice() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        assertEquals(4500,a.getSellingPrice());
    }

    @org.junit.jupiter.api.Test
    void setSellingPrice() {
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        a.setSellingPrice(2000);
        assertEquals(2000, a.getSellingPrice());
    }
}