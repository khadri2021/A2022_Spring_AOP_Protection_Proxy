package com.khadri.spring.core;

import java.time.LocalDate;

public class FlightReservation implements  Reservation{

    @Override
    public void ticketBooking(LocalDate reservationDate) {
        System.out.println(reservationDate+" Booked Flight Ticket");
    }

}
