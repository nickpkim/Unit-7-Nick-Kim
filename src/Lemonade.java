public class Lemonade extends Beverage implements Comparable {
    private static final int CALORIES = 100;
    private static final int TASTY_LEVEL = 87;
    private static final int TEMP = 40;
    public Lemonade(String container){
        super(CALORIES, TASTY_LEVEL, TEMP, container);
    }
    public int compareTo(Object other){
        Object other = new Lemonade();
        return this - lemon;
    }
    public boolean equals(Beverage drink){
        if (this == drink){
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return "Lemonade in a "+super.getContainer()+", it is "+TASTY_LEVEL+" in tasty";
    }
}
