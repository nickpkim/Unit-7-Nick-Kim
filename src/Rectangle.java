public class Rectangle extends Quadrilateral {
    public static final int[] RECT_ANGLES = {90,90,90,90};
    public Rectangle(int s1, int s2){
        super(new int[]{s1,s1,s2,s2}, RECT_ANGLES);
    }
    public double calcArea(){
        return getSide(0) * getSide(3);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,5);
        System.out.println(r.calcArea());
    }
}

