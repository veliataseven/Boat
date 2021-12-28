package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private int reservationId;
    private LocalDateTime startTime;
    private LocalDate reservationDate;
    private int reservationDuration;
    private int delayTime;
    private String paymentType;
    private Customer customer;
    private Boat boat;
    private Worker worker;

    public Reservation() {
    }

    public Reservation(int reservationId, int reservationDuration, String paymentType, Customer customer, Boat boat, Worker worker) {
        this.reservationId = reservationId;
        this.paymentType = paymentType;
        this.customer = customer;
        this.boat = boat;
        this.worker = worker;
        this.startTime = getLocaleDateTime();
        this.reservationDate = getLocaleDate();
        this.reservationDuration = reservationDuration;
        this.delayTime = 0;
    }

    public int getReservationId() {
        return reservationId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getReservationDuration() {
        return reservationDuration;
    }

    public void setReservationDuration(int reservationDuration) {
        this.reservationDuration = reservationDuration;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
        if (delayTime > 0) {
            calculateReservationDurationWithDelayTime();
        }
    }

    public LocalDateTime getEndTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String endTimeString = startTime.plusMinutes(reservationDuration).format(formatter); // add startTime to duration and calculate endTime
        LocalDateTime endTime = LocalDateTime.parse(endTimeString, formatter);
        return endTime;
    }

    public double getPrice() {
        double priceForPerQuarter = boat.getMinimumHourlyPrice() / 4; // price for per 15 minutes
        int numberOfQuarter = (int) (reservationDuration / 15); // number of quarter in reservation duration
        if ((reservationDuration % 15) == 0) {
            return (double) numberOfQuarter * priceForPerQuarter;
        } else {
            int rest = (int) (reservationDuration % 15);
            if (rest > 7) {
                numberOfQuarter++;
            }
            return (double) numberOfQuarter * priceForPerQuarter;
        }
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    private LocalDateTime getLocaleDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String nowString = LocalDateTime.now().format(formatter);
        return LocalDateTime.parse(nowString, formatter);
    }

    private LocalDate getLocaleDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String nowString = LocalDate.now().format(formatter);
        return LocalDate.parse(nowString, formatter);
    }

    private void calculateReservationDurationWithDelayTime() {
        setReservationDuration(reservationDuration + delayTime); // add delayTime to duration and set new duration
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", startTime=" + startTime +
                ", reservationDate=" + reservationDate +
                ", reservationDuration=" + reservationDuration +
                ", delayTime=" + delayTime +
                ", paymentType='" + paymentType + '\'' +
                ", customer=" + customer +
                ", boat=" + boat +
                ", worker=" + worker +
                '}';
    }
}
