package co2123.hw1.domain;

public class Trainer {

    private String name;
    private String skills;
    private String expertise;
    private int duration;

    //getters and setters in same order
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSkills(String skills){
        this.skills = skills;
    }
    public String getSkills(){
        return skills;
    }
    public void setExpertise(String expertise){
        this.expertise = expertise;
    }
    public String getExpertise(){
        return expertise;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
}
