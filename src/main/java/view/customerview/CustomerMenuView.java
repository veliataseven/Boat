package view.customerview;

import java.util.Scanner;

public class CustomerMenuView {
    public static int get() {
        System.out.println();
        System.out.println("## Customer Maintenance ##");
        System.out.println();
        System.out.println("1. list customers");
        System.out.println("2. find a customer");
        System.out.println("3. add a customer");
        System.out.println("4. delete a customer");
        System.out.println("5. update a customer");
        System.out.println("6. back to main menu");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("-> Type your choice: ");
            int choice = sc.nextInt();

            if (choice >= 1 || choice <= 6)
                return choice;
        }
    }
}
