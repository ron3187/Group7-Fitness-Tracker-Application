package model;

import dsa.WorkoutArray;
import java.util.ArrayList;

public class UserInfo {
    private int id;
    private String name;
    private WorkoutArray workouts;
    private ArrayList<Meal> meals;

    public UserInfo(int id, String name) {
        this.id = id;
        this.name = name;
        this.workouts = new WorkoutArray(100);
        this.meals = new ArrayList<>();
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public WorkoutArray getWorkouts() { return workouts; }
    public ArrayList<Meal> getMeals() { return meals; }
}
