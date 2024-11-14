package co2123.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Gym {

    private int id;
    private String classes;
    private String website;
    private List<Trainer> trainers = new ArrayList<>();

    //getters and setters in  same order
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getClasses() {
        return classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public List<Trainer> getTrainers() {
        return trainers;
    }
    public void setTrainers(List<Trainer> trainers) {
        this.trainers = trainers;
    }
}
