package com.example.fitnesscoach;

public class User {
    private String Weight;
    private String Availability;
    private String Experience;
    private String WeightGoal;

    public User() {
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getWeightGoal() {
        return WeightGoal;
    }

    public void setWeightGoal(String weightGoal) {
        WeightGoal = weightGoal;
    }
}
