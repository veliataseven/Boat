package model;

public class Boat {
    private int boatId;
    private String boatType;
    private int numberOfSeats;
    private double minimumHourlyPrice;
    private double dayPrice;
    private  int chargingTime;
    private boolean isRented;
    private String boatStatus;

    public Boat() {
    }

    public Boat(int boatId, String boatType, boolean isRented, String boatStatus) {
        this.boatId = boatId;
        this.boatType = boatType;
        this.isRented = isRented;
        this.boatStatus = boatStatus;
        setPrices(boatType);
        setSeats(boatType);
        setChargingTimes(boatType);
    }

    public int getBoatId() {
        return boatId;
    }

    public String getBoatType() {
        return boatType;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getMinimumHourlyPrice() {
        return minimumHourlyPrice;
    }

    public void setMinimumHourlyPrice(double minimumHourlyPrice) {
        this.minimumHourlyPrice = minimumHourlyPrice;
    }

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(int chargingTime) {
        this.chargingTime = chargingTime;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String getBoatStatus() {
        return boatStatus;
    }

    public void setBoatStatus(String boatStatus) {
        this.boatStatus = boatStatus;
    }

    private void setPrices(String boatType) {
        if (boatType.equals("Kajak")) {
            setMinimumHourlyPrice(23);
            setDayPrice(120);
        }
        if (boatType.equals("Rowing Boat")) {
            setMinimumHourlyPrice(27.5);
            setDayPrice(140);
        }
        if (boatType.equals("Supboard")) {
            setMinimumHourlyPrice(17.5);
            setDayPrice(90);
        }
        if (boatType.equals("Electrical Boat")) {
            setMinimumHourlyPrice(35);
            setDayPrice(180);
        }
    }

    private void setSeats(String boatType) {
        if (boatType.equals("Kajak")) {
            setNumberOfSeats(2);
        }
        if (boatType.equals("Rowing Boat")) {
            setNumberOfSeats(4);
        }
        if (boatType.equals("Supboard")) {
            setNumberOfSeats(1);
        }
        if (boatType.equals("Electrical Boat")) {
            setNumberOfSeats(4);
        }
    }

    private void setChargingTimes(String boatType) {
        if (boatType.equals("Kajak") || boatType.equals("Rowing Boat") || boatType.equals("Supboard")) {
            setChargingTime(0);
        }
        if (boatType.equals("Electrical Boat")) {
            setChargingTime(30);
        }
    }

    @Override
    public String toString() {
        return "Boat{" +
                "boatId=" + boatId +
                ", boatType='" + boatType + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", minimumHourlyPrice=" + minimumHourlyPrice +
                ", dayPrice=" + dayPrice +
                ", chargingTime=" + chargingTime +
                ", isRented=" + isRented +
                ", boatStatus='" + boatStatus + '\'' +
                '}';
    }
}

