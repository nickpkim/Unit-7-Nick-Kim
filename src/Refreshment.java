public class Refreshment {
    private int calories;
    private int tastyLevel;
    private boolean exists;

    public Refreshment(int calories, int tastyLevel){
        this.calories = calories;
        this.tastyLevel = tastyLevel;
        this.exists = true;
    }
    public int getCalories(){
        return calories;
    }
    public int getTastyLevel(){
        return tastyLevel;
    }
    public void beConsumed(){
        exists = false;
    }
    public String toString(){
        return "Calories: "+calories+", Tasty Level: "+tastyLevel;
    }
}
