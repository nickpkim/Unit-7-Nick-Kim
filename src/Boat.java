public class Boat {
    private boolean hasMotor;
    private int topSpeed;
    private int length;

    public Boat(){
        this.hasMotor = false;
        topSpeed = 0;
        length = 0;
    }
    public Boat(boolean hasMotor, int topSpeed, int length){
        this.hasMotor = hasMotor;
        this.topSpeed = topSpeed;
        this.length = length;
    }
    public String move(int nm){
        if (hasMotor){
            return "The boat moved "+nm+" nautical miles";
        } else {
            return "The boat took forever to move "+nm+" nautical miles";
        }
    }
    public String sink(){
        if (length > 10){
            return "The boat sank in "+(length*2 + 9)/1.4+" minutes";
        } else {
            return "The boat sank instantly";
        }
    }
    public int getTopSpeed(){
        return topSpeed;
    }
    public int getLength(){
        return length;
    }
    public void setTopSpeed(int topSpeed){
        this.topSpeed = topSpeed;
    }
    public void setLength(int length){
        this.length = length;
    }
    public String toString(){
        return "Boat - \n\t Motor: "+hasMotor+"\n\tTop speed: "+topSpeed+" knots\n\tLength: "+length+" ft.";
    }

    public static void main(String[] args) {
        Boat b = new Boat();
        Boat myBoat = new Boat(true, 28, 44);

        System.out.println("Default boat: \n"+b);
        System.out.println("My boat \n"+myBoat);
    }
}
