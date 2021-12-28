package model;

import java.util.ArrayList;
import java.util.List;

public class ReservationList {
    public List<Reservation> reservations = new ArrayList<>();

    public ReservationList(){}

    @Override
    public String toString() {
        return "ReservationList{" +
                "reservations=" + reservations +
                '}';
    }
}
