package model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

public class Model {
    public CustomerList customerList = new CustomerList();
    public WorkerList workerList = new WorkerList();
    public BoatList boatList = new BoatList();
    public ReservationList reservationList = new ReservationList();

    public Model() { }

    public CustomerList getCustomerList() {
        return customerList;
    }

    public void setCustomerList(CustomerList customerList) {
        this.customerList = customerList;
    }

    public WorkerList getWorkerList() {
        return workerList;
    }

    public void setWorkerList(WorkerList workerList) {
        this.workerList = workerList;
    }

    public BoatList getBoatList() {
        return boatList;
    }

    public void setBoatList(BoatList boatList) {
        this.boatList = boatList;
    }

    public ReservationList getReservationList() {
        return reservationList;
    }

    public void setReservationList(ReservationList reservationList) {
        this.reservationList = reservationList;
    }

    public static Model readModel() {
        Model model = new Model();

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            model = mapper.readValue(new File("c:\\temp\\model1.json"), Model.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }

    public static void writeModel() {
        Model model = new Model();

        Customer customer1 = new Customer(11, "Mary", "Kocak", "yushakocak@gmail.com", "0684448668", "WillemKalfstraat", "203A", "1234KL", "Amsterdam", "Netherland");
        Customer customer2 = new Customer(12, "Maria", "Kocak", "yushakocak1@gmail.com", "0684448568", "AllemKalfstraat", "2A", "4434KL", "Amsterdam", "Netherland");
        Worker worker1 = new Worker(1, "Veli", "Kocak", "veli@gmail.com", "0684448563", "Supervisor", "Veli1", "12345", "working", "willem", "34", "2345km", "Utrecht", "Holland");
        Worker worker2 = new Worker(2, "Nihat", "Kocak", "nihat@gmail.com", "0685548568", "Supervisor", "Nihat1", "1234567", "working", "willemstraat", "34", "4445km", "Utrecht", "Holland");
        Boat boat1 = new Boat(101, "Kajak", true, "working");
        Boat boat2 = new Boat(102, "Supboard", true, "working");
        Boat boat3 = new Boat(103, "Supboard", true, "working");
        Reservation reservation1 = new Reservation(123, 30 , "done", customer1, boat1, worker1);
        Reservation reservation2 = new Reservation(124, 120, "done", customer2, boat2, worker2);
        reservation2.setDelayTime(30);

        model.customerList.customers.add(customer1);
        model.customerList.customers.add(customer2);
        model.workerList.workers.add(worker1);
        model.workerList.workers.add(worker2);
        model.boatList.boats.add(boat1);
        model.boatList.boats.add(boat2);
        model.boatList.boats.add(boat3);
        model.reservationList.reservations.add(reservation1);
        model.reservationList.reservations.add(reservation2);

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            mapper.writeValue(new File("c:\\temp\\model1.json"), model);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Model{" +
                "customerList=" + customerList +
                ", workerList=" + workerList +
                ", boatList=" + boatList +
                ", reservationList=" + reservationList +
                '}';
    }
}
