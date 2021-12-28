package view.boatview;

import model.Boat;
import model.BoatList;

import java.util.Scanner;

public class BoatDeleteView {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public BoatList boatList;

    public BoatDeleteView(BoatList boatList) {
        this.boatList = boatList;
    }

    public void get(){
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_PURPLE + "## delete a boat ##" + ANSI_RESET);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-> Type boatId: " + ANSI_RESET);
        int boatId = sc.nextInt();
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_RED + "Boat deleted.." + ANSI_RESET);
        System.out.println();
        Boat deletedBoat = boatList.deleteBoat(boatId);
        BoatView.get(deletedBoat);
    }
}
