package com.example.guestbook;

import com.example.guestbook.Configuration.ApplicationConfig;
import com.example.guestbook.domain.Address;
import com.example.guestbook.domain.Guest;
import com.example.guestbook.service.GuestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GuestBookApplication {

    public static void main(String[] args) {
        //SpringApplication.run(GuestBookApplication.class, args);
        //ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ApplicationContext context = SpringApplication.run(GuestBookApplication.class, args);
        GuestService guestService = context.getBean("guestService", GuestService.class);
        //guestService.createGuest(context.getBean("guest", Guest.class));
        Guest guest = Guest.builder()
                .id(101)
                .firstName("chintan")
                .lastName("patel")
                .phoneNumber("3434")
                .address("hamilton").build();
        guestService.createGuest(guest);
        System.out.println(guestService.getGuest());
    }
}
