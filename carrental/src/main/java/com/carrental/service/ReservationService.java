package com.carrental.service;

import com.carrental.model.Reservation;

import java.util.List;

public interface ReservationService {
    List< Reservation > getAllReservation();
    void saveReservation(Reservation reservation);
    Reservation getReservationById(Integer id);
    void deleteReservationById(Integer  id);
}


