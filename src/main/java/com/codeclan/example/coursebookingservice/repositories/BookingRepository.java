package com.codeclan.example.coursebookingservice.repositories;

import com.codeclan.example.coursebookingservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
