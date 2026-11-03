
package Model;


public class Meal {
    private int mealId;
    private String nutritionalInfo;
    private String mealname;
    private int caloriesIn;
    
    

  public Meal(int mealId, String nutritionalInfo, String mealname, int caloriesIn) {
        this.mealId = mealId;
        this.nutritionalInfo = nutritionalInfo;
        this.mealname = mealname;
        this.caloriesIn = caloriesIn;
    }
    public int getmealId() { return mealId; }
    public void setmealId(int mealId) { this.mealId = mealId; }
    
    public String getnutritionalInfo() { return nutritionalInfo; }
    public void setnutritionalInfo(String nutritionalInfo) { this.nutritionalInfo = nutritionalInfo; }
    
    public String getmealname() { return mealname; }
    public void setmealname(String mealname) { this.mealname = mealname; }
    
    public int getcaloriesIn() { return caloriesIn; }
    public void setcaloriesIn(int caloriesIn) { this.caloriesIn = caloriesIn; }

}