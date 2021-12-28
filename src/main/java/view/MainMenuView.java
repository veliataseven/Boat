package view;

import java.util.Scanner;

public class MainMenuView {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";

    public MainMenuView(){}
    public static int get() {
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_PURPLE + "## MAIN MENU ##" + ANSI_RESET);
        System.out.println();
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "1. boat maintenance       " + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "2. customer maintenance   " + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "3. reservation maintenance" + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "4. worker maintenance     " + ANSI_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "5. end program            " + ANSI_RESET);

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.print(ANSI_BLACK_BACKGROUND + ANSI_BLUE + "-> Type your choice: " + ANSI_RESET);
            int choice = sc.nextInt();

            if (choice >= 1 || choice <= 5)
                return choice;
        }
    }
}
