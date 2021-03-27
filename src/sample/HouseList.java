package sample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HouseList implements Serializable {
    private static final long serialVersionUID = 1L;

    List<House> houseList;

    public HouseList() {
        houseList = new ArrayList<House>();
    }

    public void addHouse(House house){
        houseList.add(house);
        System.out.println("House has been added to the list of Houses");
    }

    public void displayHouseArrayList(){
        System.out.println(houseList);
    }

    public void displayHouseArrayListSize(){
        System.out.println("The size of the houseArrayList is  "+ houseList.size());
    }


    public List<House> getHouseArrayList() {
        return houseList;
    }

    @Override
    public String toString() {
        return  "houseList=" + houseList;
    }

    public int size (){
        return houseList.size();
    }

    public String getValue (int index){
        House temp =  houseList.get(index);
        return  temp.getNumberOfBedrooms() + " Bedroom " + temp.getType() + " with " + temp.getNumberOfLivingRooms() +" Living room(s), and " + temp.getNumberOfBathrooms() +" Bathroom(s).";
    }

    public String getStringValue (int index){
        House temp =  houseList.get(index);
        return  temp.getNumberOfBedrooms() + " Bedroom " + temp.getType() + " with " + temp.getNumberOfLivingRooms() +" Living room(s), and " + temp.getNumberOfBathrooms() +" Bathroom(s).";
    }
}
