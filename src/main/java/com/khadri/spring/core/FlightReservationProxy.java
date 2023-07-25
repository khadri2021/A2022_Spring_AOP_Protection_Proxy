package com.khadri.spring.core;

import java.time.LocalDate;

public class FlightReservationProxy extends FlightReservation {
    @Override
    public void ticketBooking(LocalDate reservationDate) {

       LocalDate EndReserbation =  LocalDate.of(2023, 07, 30);

        // This the protection logic for actual object
        boolean isAllwoed = reservationDate.isBefore(EndReserbation);

        if (isAllwoed) {
            super.ticketBooking(reservationDate);
        }else{
            System.out.println(" You are after the End Reservation "+EndReserbation);
        }
    }
 }
