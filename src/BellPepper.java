public class BellPepper extends Vegetable{
    public BellPepper(){
        super("Bell Pepper", "Nightshade");
        String str = "Plant seeds about 1/4-inch deep+\n";
        str += "Water one to two inches per week+\n";
        str += "Fertilize after first fruit set+\n";
        str += "Harvest as soon as peppers reach desired size or color+\n";
        str += "Use a sharp knife or scissors to cut peppers clean off the plant+\n";
        setInstructions(str);
    }
    public String feed(){
        return "Mmm! Thank you, kind sir";
    }
    public String water(){
        return "Slurp, slurp, schlup!";
    }
    public String harvest(){
        return "Wait... where's the water? What are you doing with that— AAAAHH!";
    }

    public static void main(String[] args) {
        BellPepper bp = new BellPepper();
        System.out.println(bp.getInstructions());
        System.out.println(bp.feed());
        System.out.println(bp.water());
        System.out.println(bp.harvest());
    }
}
