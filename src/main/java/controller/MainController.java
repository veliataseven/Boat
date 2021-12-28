package controller;

import model.Model;
import view.MainMenuView;

public class MainController {

    public Model model;

    public MainController() {
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void execute() {
        model = Model.readModel();

        BoatController boatController = new BoatController(model.boatList);
        CustomerController customerController = new CustomerController(model.customerList);
        WorkerController workerController = new WorkerController(model.workerList);
        ReservationController reservationController = new ReservationController(model.reservationList);

        outer:
        while (true) {
            int choice = MainMenuView.get();
            switch (choice) {
                case 1:
                    boatController.execute();
                    break;
                case 2:
                    customerController.execute();
                    break;
                case 3:
                    reservationController.execute();
                    break;
                case 4:
                    workerController.execute();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Doei!");
                    break outer;
            }
        }
        //Model.writeModel();
    }

    @Override
    public String toString() {
        return "MainController{" +
                "model=" + model +
                '}';
    }
}
