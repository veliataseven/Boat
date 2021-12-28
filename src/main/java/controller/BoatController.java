package controller;

import model.BoatList;
import view.boatview.*;


public class BoatController {

    public static int choice;

    public BoatList boatList;

    public BoatController(BoatList boatList) {
        this.boatList = boatList;
    }

    public void execute() {

        BoatListView boatListView = new BoatListView(boatList);
        BoatFindView boatFindView = new BoatFindView(boatList);
        BoatCreateView boatCreateView = new BoatCreateView(boatList);
        BoatDeleteView boatDeleteView = new BoatDeleteView(boatList);
        BoatUpdateView boatUpdateView = new BoatUpdateView(boatList);

        outer:
        while(true) {
            choice = BoatMenuView.get();
            switch (choice){
                case 1:
                    boatListView.get();
                    break;
                case 2:
                    boatFindView.get();
                    break;
                case 3:
                    boatCreateView.get();
                    break;
                case 4:
                    boatDeleteView.get();
                    break;
                case 5:
                    boatUpdateView.get();
                    break;
                case 6:
                    break outer;
            }
        }
    }

    @Override
    public String toString() {
        return "BoatController{" +
                "boatList=" + boatList +
                '}';
    }
}
