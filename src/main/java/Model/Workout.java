
package Model;

public class Workout {
    
    private int workoutid;
    private int durationWorkout;
    private String Workname;
    private int caloriesBurn;
    

  public Workout(int workoutId, String name, int duration, int caloriesBurned) {
        this.workoutid = workoutid;
        this.Workname = Workname;
        this.durationWorkout = durationWorkout;
        this.caloriesBurn = caloriesBurn;
    }

    public int getworkoutid() { return workoutid; }
    public void setworkoutid(int workoutid) { this.workoutid = workoutid; }
    
    public String getWorkname() { return Workname; }
    public void setWorkname(String Workname) { this.Workname = Workname; }
    
    public int getdurationWorkout() { return durationWorkout; }
    public void setdurationWorkout(int duration) { this.durationWorkout = durationWorkout; }
    
    public int getCaloriesBurned() { return caloriesBurn; }
    public void setCaloriesBurned(int caloriesBurn) { this.caloriesBurn = caloriesBurn; }
}