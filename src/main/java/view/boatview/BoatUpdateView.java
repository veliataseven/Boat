package view.boatview;

import model.Boat;
import model.BoatList;

import java.util.Scanner;

public class BoatUpdateView {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public BoatList boatList;

    public BoatUpdateView(BoatList boatList) {
        this.boatList = boatList;
    }

    public void get(){
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_PURPLE + "## update a boat ##" + ANSI_RESET);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-> Type boatId: " + ANSI_RESET);
        int boatId = sc.nextInt();
        System.out.println();
        System.out.print(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-> Type boatType: " + ANSI_RESET);
        String boatType = sc.next();
        System.out.println();
        System.out.print(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-> Type isRented: " + ANSI_RESET);
        Boolean isRented = sc.nextBoolean();
        System.out.println();
        System.out.print(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-> Type boatStatus: " + ANSI_RESET);
        String boatStatus = sc.next();
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_GREEN + "Boat updated.." + ANSI_RESET);
        System.out.println();
        Boat newBoat = boatList.updateBoat(boatId, boatType,isRented, boatStatus);
        BoatView.get(newBoat);
    }
}
