public class Square extends Rectangle {
    public Square(int side){
        super(side, side);
    }
    public String toString(){
        return super.toString() + " [Square]";
    }
    public static void main(String[] args) {
        Quadrilateral[] shapes = {new Rectangle(2,6), new Square(4)};
        System.out.println(shapes[0]);
        System.out.println(shapes[0].calcArea());
        System.out.println(shapes[1]);
        System.out.println(shapes[1].calcArea());
    }
}
