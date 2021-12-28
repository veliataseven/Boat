package view.boatview;

import controller.BoatController;
import model.Boat;

public class BoatView {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static String color;

    public static void get(Boat boat){

        switch (BoatController.choice){
            case 1:
            case 2:
                color = ANSI_BLUE;
                break;
            case 3:
            case 5:
                color = ANSI_GREEN;
                break;
            case 4:
                color = ANSI_RED;
                break;
        }

        System.out.println(ANSI_BLACK_BACKGROUND + color + "Boat ID   Boat Type   Seats   Min Price   Day Price   Charging Time   Is Rented   Boat Status" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + color + "-------   ---------   -----   ---------   ---------   -------------   ---------   -----------" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + color + "  " + boat.getBoatId() + "       " + boat.getBoatType().substring(0, 3) + "         " + boat.getNumberOfSeats() + "       " + boat.getMinimumHourlyPrice() + "         " + String.format("%03d", ((int)boat.getDayPrice())) + "            " + boat.getChargingTime() + "           " + String.valueOf(boat.isRented()).substring(0, 4) + "        " + boat.getBoatStatus().substring(0, 7) + "  " + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "Returning boat menu.." + ANSI_RESET);
    }
}
