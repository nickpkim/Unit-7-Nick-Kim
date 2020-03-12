import java.sql.Ref;

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
    public boolean equals(Refreshment refreshment){
        if (this == refreshment){
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        if (!exists){
            return "I have been CONSUMED.";
        } else {
            return "Calories: "+calories+", Tasty Level: "+tastyLevel;
        }
    }

    public static void main(String[] args) {
        Refreshment r1 = new Refreshment(50, 30);
        Refreshment r2 = new Refreshment(300, 80);
        System.out.println(r1);
        System.out.println(r2);
        r1.beConsumed();
        System.out.println(r1);
    }
}
