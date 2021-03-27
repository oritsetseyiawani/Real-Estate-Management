package sample;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerListTest {

    @Test
    void addCustomer() {
        CustomerList list = new CustomerList();
        Customer a = new Customer("Melvyn","Awani","melvyn.awani@northampton.ac.uk","08165521443","Male", LocalDate.of(1996,5,14) ,"Waterside","Delta",1);
        list.addCustomer(a);
        assertEquals(1, list.size());
    }

    @Test
    void size() {
        CustomerList list = new CustomerList();
        assertEquals(0,list.size());
    }
}