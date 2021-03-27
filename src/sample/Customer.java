package sample;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String sex;
    private LocalDate birthDate;
    private String address;
    private String stateOfOrigin;
    private static int customerCount = 0;
    private int customerID = customerCount;


    public Customer() {
        this.firstName = "";
        this.lastName = "";
        this.emailAddress = "";
        this.phoneNumber = "";
        this.sex = "";
        this.birthDate = null;
        this.address = "";
        this.stateOfOrigin = "";
        this.customerID = customerCount++;
    }

    public Customer(String firstName, String lastName, String emailAddress, String phoneNumber, String sex, LocalDate birthDate, String address, String stateOfOrigin, int customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.birthDate = birthDate;
        this.address = address;
        this.stateOfOrigin = stateOfOrigin;
        this.customerID = customerID;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String toCustomString(){
        int j = 0;
        j++;
        return "\n" +"List of customers. \n"+
                j +". \n" +
                "firstName='" + firstName + '\'' +"\n" +
                "lastName='" + lastName + '\''  +"\n" +
                "emailAddress='" + emailAddress + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                "sex='" + sex + '\'' +
                "birthDate= " + birthDate +
                "address='" + address + '\'' +
                "stateOfOrigin= '" + stateOfOrigin + '\'' +
                "\n \n";

    }

    @Override
    public String toString() {

        return "\n" + "\n" +
                "Customer ID: " + customerID +"\n" +
                "First Name: " + firstName  +"\n" +
                "Last Name: " + lastName + "\n" +
                "Email Address: " + emailAddress  + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Sex: " + sex + "\n" +
                "Birth Date: " + birthDate + "\n" +
                "Address: " + address + "\n" +
                "State Of Origin:" + stateOfOrigin + "" ;

    }
}
