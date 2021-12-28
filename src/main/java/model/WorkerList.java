package model;

import java.util.ArrayList;
import java.util.List;

public class WorkerList {
    public List<Worker> workers = new ArrayList<>();

    public WorkerList(){}

    @Override
    public String toString() {
        return "WorkerList{" +
                "workers=" + workers +
                '}';
    }
}
