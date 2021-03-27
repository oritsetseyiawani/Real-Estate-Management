package sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseListTest {

    @Test
    void addHouse() {
        HouseList list = new HouseList();
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        House b = new House("Abington",2,1,1,"Detached",true,false,true,true,false,3500);
        list.addHouse(a);
        assertEquals(1, list.size());
        list.addHouse(b);
        assertEquals(2, list.size());
    }

    @Test
    void getHouseArrayList() {
        HouseList list = new HouseList();
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        list.addHouse(a);
        HouseList expectedValue =new HouseList();
        expectedValue.addHouse(a);
        assertEquals(expectedValue.getHouseArrayList(),list.getHouseArrayList());
    }

    @Test
    void size() {
        HouseList list = new HouseList();
        House a = new House("Duston",4,2,2,"Flat",true,false,true,true,false,4500);
        list.addHouse(a);
        assertEquals(1,list.size());
    }

}