public abstract class Quadrilateral {
    public static final int NUM_SIDES = 4;
    public static final int INT_ANGLE_SUM = 360;
    private int[] sides;
    private int[] angles;
    public Quadrilateral(int[] sides, int[] angles){
        this.sides = sides;
        this.angles = angles;
    }
    public int getSide(int index){
        return sides[index];
    }
    public int calcPerimeter(){
        int perimeter = 0;
        for (int s : sides){
            perimeter += s;
        }
        return perimeter;
    }
    public abstract double calcArea();

    public String toString(){
        String str = "Quadrilateral: ";
        for (int s : sides){
            str += s + " ";
        }
        return str;
    }
}
