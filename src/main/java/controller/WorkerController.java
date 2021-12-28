package controller;

import model.WorkerList;

public class WorkerController {
    public WorkerList workerList;

    public WorkerController() {}

    public WorkerController(WorkerList workerList) {
        this.workerList = workerList;
    }

    public void execute() {}

    @Override
    public String toString() {
        return "WorkerController{" +
                "workerList=" + workerList +
                '}';
    }
}
