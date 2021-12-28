package view.boatview;

import model.Boat;
import model.BoatList;

import java.util.Scanner;

public class BoatFindView {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public BoatList boatList;

    public BoatFindView(BoatList boatList) {
        this.boatList = boatList;
    }

    public void get(){
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_PURPLE + "## find a boat ##" + ANSI_RESET);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-> Type boatId: " + ANSI_RESET);
        int boatId = sc.nextInt();
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "Boat founded.." + ANSI_RESET);
        System.out.println();
        Boat foundedBoat = boatList.getBoat(boatId);
        BoatView.get(foundedBoat);
    }

}
