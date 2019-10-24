package com.codeclan.example.coursebookingservice.repositories;

import com.codeclan.example.coursebookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
