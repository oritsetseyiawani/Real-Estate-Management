package sample;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {

    @Test
    void getCustomerCount() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( 0, a.getCustomerCount());
    }

    @Test
    void getCustomerID() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( 1, a.getCustomerID());
    }

    @Test
    void getFirstName() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( "Melvyn", a.getFirstName());
    }

    @Test
    void setFirstName() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        a.setFirstName("Lucas");
        assertEquals( "Lucas", a.getFirstName());
    }

    @Test
    void getLastName() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( "Awani", a.getLastName());
    }

    @Test
    void setLastName() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        a.setLastName("Andrew");
        assertEquals( "Andrew", a.getLastName());

    }

    @Test
    void getEmailAddress() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( "melvyn.awani@northampton.ac.uk", a.getEmailAddress());
    }

    @Test
    void setEmailAddress() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        a.setEmailAddress("tseyiawani@yahoo.com");
        assertEquals( "tseyiawani@yahoo.com", a.getEmailAddress());

    }

    @Test
    void getPhoneNumber() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( "08165521443", a.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        a.setPhoneNumber("00114646");
        assertEquals( "00114646", a.getPhoneNumber());

    }

    @Test
    void getSex() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( "Male", a.getSex());
    }

    @Test
    void setSex() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        a.setSex("Female");
        assertEquals( "Female", a.getSex());

    }

    @Test
    void getBirthDate() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( LocalDate.of(1996,5,14), a.getBirthDate());
    }

    @Test
    void setBirthDate() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        a.setBirthDate(LocalDate.of(2000,1,1));
        assertEquals( LocalDate.of(2000,1,1), a.getBirthDate());

    }

    @Test
    void getAddress() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( "Waterside", a.getAddress());
    }

    @Test
    void setAddress() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        a.setAddress("Town Centre");
        assertEquals( "Town Centre", a.getAddress());

    }

    @Test
    void getStateOfOrigin() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        assertEquals( "Delta", a.getStateOfOrigin());
    }

    @Test
    void setStateOfOrigin() {
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        a.setStateOfOrigin("Abia");
        assertEquals( "Abia", a.getStateOfOrigin());

    }
}