package controller;

import model.ReservationList;

public class ReservationController {
    public ReservationList reservationList;

    public ReservationController() {}

    public ReservationController(ReservationList reservationList) {
        this.reservationList = reservationList;
    }

    public void execute() {}

    @Override
    public String toString() {
        return "ReservationController{" +
                "reservationList=" + reservationList +
                '}';
    }
}
