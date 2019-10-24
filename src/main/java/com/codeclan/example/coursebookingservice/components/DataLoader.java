package com.codeclan.example.coursebookingservice.components;

import com.codeclan.example.coursebookingservice.models.Booking;
import com.codeclan.example.coursebookingservice.models.Course;
import com.codeclan.example.coursebookingservice.models.Customer;
import com.codeclan.example.coursebookingservice.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.coursebookingservice.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebookingservice.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepsitory;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Sarah","Halifax",32);
        customerRepsitory.save(customer1);

        Customer customer2 = new Customer("Kevin", "Frankfurt", 45);
        customerRepsitory.save(customer2);

        Course course1 = new Course("Horticulture", "Oban", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Java", "London", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("24-10-19",course1,customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("25-12-19",course2,customer2);
        bookingRepository.save(booking2);







    }
}
