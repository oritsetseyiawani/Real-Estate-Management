package sample;

import java.io.Serializable;

public class House implements Serializable {
    private static final long serialVersionUID = 1L;
    private String location;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private int numberOfLivingRooms;
    private String type;
    private boolean hasCarPark;
    private boolean hasPool;
    private boolean hasGarden;
    private boolean forSale;
    private boolean forRent;
    private boolean onOffer;
    private double sellingPrice;
    private static int houseCount = 0;
    private double agentFee;
    private int houseID = houseCount;
    private double totalPrice;

    public House(String location, int numberOfBedrooms, int numberOfBathrooms, int numberOfLivingRooms, String type, boolean hasCarPark, boolean hasPool, boolean hasGarden, boolean forSale, boolean forRent, double sellingPrice) {
        this.location = location;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
        this.type = type;
        this.hasCarPark = hasCarPark;
        this.hasPool = hasPool;
        this.hasGarden = hasGarden;
        this.forSale = forSale;
        this.forRent = forRent;
        this.onOffer = false;
        this.houseID = houseCount++;
        this.sellingPrice = sellingPrice;
        this.agentFee = 1.5/100*sellingPrice;
        this.totalPrice = sellingPrice + agentFee;

    }

    public House() {
        this.location = "";
        this.numberOfBedrooms = 0;
        this.numberOfBathrooms = 0;
        this.numberOfLivingRooms = 0;
        this.type = "";
        this.hasCarPark = true;
        this.hasPool = false;
        this.hasGarden = true;
        this.forSale = false;
        this.forRent = false;
        this.onOffer = false;
        this.houseID = houseCount++;
        this.sellingPrice = 0;
        totalPrice = sellingPrice+agentFee;
    }

    public double calculateTotalPrice(){
        return this.sellingPrice + this.agentFee;
    }
    public double calculateAgentFee(){
        return 1.5/100*this.sellingPrice;
    }
    public double getAgentFee() {
        return agentFee;
    }

    public void setAgentFee(double agentFee) {
        this.agentFee = agentFee;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasCarPark() {
        return hasCarPark;
    }

    public void setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public boolean isForRent() {
        return forRent;
    }

    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }

    public boolean isOnOffer() {
        return onOffer;
    }

    public void setOnOffer(boolean onOffer) {
        this.onOffer = onOffer;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    //Status sold,unsold, on offer

    public String toStringForInvoice(){
        return '\n' +
                "\nHouse ID: " + houseID + "\n" +
                "Location: " + location + "\n" +
                "Number Of Bedrooms: " + numberOfBedrooms + "\n" +
                "Number Of Bathrooms: " + numberOfBathrooms + "\n" +
                "Number Of LivingRooms: " + numberOfLivingRooms + "\n" +
                "Type: " + type + "\n" +
                "Has Car Park? : " + hasCarPark +"\n" +
                "Has Pool? : " + hasPool +"\n" +
                "Has Garden? : " + hasGarden +"\n";

    }


    @Override
    public String toString() {
        return '\n' +
                "\nHouse ID: " + houseID + "\n" +
                "Location: " + location + "\n" +
                "Number Of Bedrooms: " + numberOfBedrooms + "\n" +
                "Number Of Bathrooms: " + numberOfBathrooms + "\n" +
                "Number Of LivingRooms: " + numberOfLivingRooms + "\n" +
                "Type: " + type + "\n" +
                "Has Car Park? : " + hasCarPark +"\n" +
                "Has Pool? : " + hasPool +"\n" +
                "Has Garden? : " + hasGarden +"\n" +
                "For Sale? : " + forSale +"\n" +
                "On Offer? : " + onOffer +"\n" +
                "Selling Price? : £" + sellingPrice  +"\n" +
                "Total: £"+ totalPrice;
    }
}
