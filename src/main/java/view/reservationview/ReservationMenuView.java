package view.reservationview;

import java.util.Scanner;

public class ReservationMenuView {
    public static int get() {
        System.out.println();
        System.out.println("## Reservation Maintenance ##");
        System.out.println();
        System.out.println("1. list reservations");
        System.out.println("2. find a reservation");
        System.out.println("3. add a reservation");
        System.out.println("4. delete a reservation");
        System.out.println("5. update a reservation");
        System.out.println("6. back to main menu");

        Scanner sc = new Scanner(System.in);
        while(true) {
            int choice = sc.nextInt();

            if (choice >= 1 || choice <= 6)
                return choice;
        }
    }
}
