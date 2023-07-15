package com.example.guestbook.service;

import com.example.guestbook.domain.Guest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GuestService {
    private JdbcTemplate template;

    public GuestService(JdbcTemplate template) {
        this.template = template;
    }

    public int createGuest(Guest guest){
        String sql = "INSERT INTO GUEST VALUES(?, ?, ?, ?, ?)";
        int i = template.update(sql,guest.getId(),
                guest.getFirstName(),
                guest.getLastName(),
                guest.getPhoneNumber(),
                guest.getAddress());
        return i;
    }

    public Guest updateGuest(Guest guest){
        return null;
    }

    public Guest deleteGuest(int id){
        return null;
    }

    public Guest getGuest(int id){
        return null;
    }

    public List<Guest> getGuest(){
       return this.template.query("SELECT * FROM GUEST",new BeanPropertyRowMapper<>(Guest.class));
    }

    //List<Guest> guests = new ArrayList<>();


//    public void addGuest(Guest guest){
//
//
//        //   guests.add(guest);
//    }
//    public void removeGuest(int id){
//
//
////        Optional<Guest> guestOptional = guests.stream().filter(g -> g.getId() == id).findFirst();
////        if(guestOptional.isPresent()){
////            guests.remove(guestOptional.get());
////        }
//    }
//    public void printGuest(){
//
//
//       // guests.stream().forEach(System.out::println);
//    }
}
