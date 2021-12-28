package view.boatview;

import model.Boat;
import model.BoatList;

public class BoatListView {
    public BoatList boatList;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";

    public BoatListView(BoatList boatList) {
        this.boatList = boatList;
    }

    public void get() {
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_PURPLE + "## list boats ##" + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "Boat ID   Boat Type   Seats   Min Price   Day Price   Charging Time   Is Rented   Boat Status" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-------   ---------   -----   ---------   ---------   -------------   ---------   -----------" + ANSI_RESET);
        for (Boat boat : boatList.getBoats()) {
            // System.out.println("boat = " + boat);
            System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "  " + boat.getBoatId() + "       " + boat.getBoatType().substring(0, 3) + "         " + boat.getNumberOfSeats() + "       " + boat.getMinimumHourlyPrice() + "         " + String.format("%03d", ((int)boat.getDayPrice())) + "            " + boat.getChargingTime() + "           " + String.valueOf(boat.isRented()).substring(0, 4) + "        " + boat.getBoatStatus().substring(0, 7) + "  " + ANSI_RESET);
        }
    }
}
