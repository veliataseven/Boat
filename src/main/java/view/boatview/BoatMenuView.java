package view.boatview;

import java.util.Scanner;

public class BoatMenuView {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public BoatMenuView() {
    }

    public static int get() {
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_PURPLE + "## Boat Maintenance ##" + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "1. list boats       " + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "2. find a boat      " + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "3. create a boat    " + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "4. delete a boat    " + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "5. update a boat    " + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "6. back to main menu" + ANSI_RESET);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-> Type your choice: " + ANSI_RESET);
            int choice = sc.nextInt();

            if (choice >= 1 || choice <= 6)
                return choice;
        }
    }

    @Override
    public String toString() {
        return "BoatMenuView{}";
    }
}
