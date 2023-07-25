package com.khadri.spring.core;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate reservationDate = LocalDate.now().plusDays(3);
        System.out.println("trying to book on "+reservationDate);
        Reservation reservation = new FlightReservationProxy();
        reservation.ticketBooking(reservationDate);
    }
}