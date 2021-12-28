package model;

import java.util.ArrayList;
import java.util.List;

public class BoatList {
    public List<Boat> boats = new ArrayList<>();

    public BoatList() {
    }

    public List<Boat> getBoats() {
        return boats;
    }

    public Boat getBoat(int boatId) {
        for (Boat boat : boats) {
            if (boat.getBoatId() == boatId) {
                return boat;
            }
        }
        return null;
    }

    public Boat createBoat(int boatId, String boatType,String boatStatus) {
        Boat newBoat = new Boat(boatId, boatType, false, boatStatus);
        boats.add(newBoat);
        return newBoat;
    }

    public Boat deleteBoat(int boatId){
        Boat boatToBeRemoved = getBoat(boatId);
        boats.remove(boatToBeRemoved);
        return boatToBeRemoved;
    }

    public Boat updateBoat(int boatId, String boatType,boolean isRented,String boatStatus) {
        Boat boatToBeUpdated = getBoat(boatId);
        boatToBeUpdated.setBoatType(boatType);
        boatToBeUpdated.setRented(isRented);
        boatToBeUpdated.setBoatStatus(boatStatus);

        return boatToBeUpdated;
    }

    @Override
    public String toString() {
        return "BoatList{" +
                "boats=" + boats +
                '}';
    }
}




