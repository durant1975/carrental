package com.carrental.service;

import com.carrental.model.Reservation;
import com.carrental.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    

    @Autowired
    private ReservationRepository reservationRepository;


    @Override
    public List<Reservation> getAllReservation() {
        return getAllReservation();
    }
    @GetMapping("/ReservationteamForm")
    public String ReservationteamForm(Model model) {
        // create model attribute to bind form data
        Reservation reservation = new Reservation();
        model.addAttribute("Reservation", reservation);
        return "new_reservation";
    }



}
