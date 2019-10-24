package com.codeclan.example.coursebookingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private String date;

    @JsonIgnoreProperties(value = "bookings")
    @ManyToMany
    @JoinTable(
            name = "customers_bookings",
            joinColumns = {
                    @JoinColumn(
                            name = "booking_id",
                            nullable = false,
                            updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                            name = "customer_id",
                            nullable = false,
                            updatable = false)
            }
    )
    private List<Customer> customers;

    public Booking(String date, List<Customer> customers) {
        this.date = date;
        this.customers = new ArrayList<>();
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }
}
