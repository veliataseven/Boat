package view.workerview;

import java.util.Scanner;

public class WorkerMenuView {
    public static int get() {
        System.out.println();
        System.out.println("## Worker Maintenance ##");
        System.out.println();
        System.out.println("1. list workers");
        System.out.println("2. find a worker");
        System.out.println("3. add a worker");
        System.out.println("4. delete a worker");
        System.out.println("5. update a worker");
        System.out.println("6. back to main menu");

        Scanner sc = new Scanner(System.in);
        while(true) {
            int choice = sc.nextInt();

            if (choice >= 1 || choice <= 6)
                return choice;
        }
    }
}
