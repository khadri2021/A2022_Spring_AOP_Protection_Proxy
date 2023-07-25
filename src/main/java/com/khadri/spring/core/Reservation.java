package com.khadri.spring.core;

import java.time.LocalDate;

public interface Reservation {
      default  void ticketBooking(LocalDate reservationDate){
        System.out.println("!!!!!! Reservation not opened !!!!"+reservationDate);
    }
}
