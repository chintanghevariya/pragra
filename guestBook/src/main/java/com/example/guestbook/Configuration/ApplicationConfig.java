package com.example.guestbook.Configuration;

import com.example.guestbook.domain.Address;
import com.example.guestbook.domain.Guest;
import com.example.guestbook.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:guestapp.properties")
public class ApplicationConfig {

    @Bean
    public Guest guest(@Value("${guest.id}") int id,
                       @Value("${guest.firstName}")String firstName,
                       @Value("${guest.lastName}") String lastName,
                       @Value("${guest.phoneNumber}")String phoneNumber,
                       @Value("${guest.address.city}") String city){
        return Guest.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .phoneNumber(phoneNumber)
                .address("tornto")
                .build();
    }

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:h2:./appdb");
        builder.username("sa");
        builder.password("");
        return builder.build();
    }
}
