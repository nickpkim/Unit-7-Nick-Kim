public class Lemonade extends Beverage implements Comparable {
    private static final int CALORIES = 100;
    //private static final int TASTY_LEVEL = 87;
    private static final int TEMP = 40;
    public Lemonade(int tastyLevel, String container){
        super(CALORIES, tastyLevel, TEMP, container);
    }
    public int compareTo(Object obj){
        Lemonade other = (Lemonade) obj;
        return this.getTastyLevel() - other.getTastyLevel();
    }
    public boolean equals(Object obj){
        Lemonade drink = (Lemonade) obj;
        if ((this.getTastyLevel() == drink.getTastyLevel()) && (this.getContainer().equals(drink.getContainer()))){
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return "Lemonade in a "+super.getContainer()+", it is "+super.getTastyLevel()+" in tasty";
    }

    public static void main(String[] args) {
        Refreshment classic = new Lemonade(60, "bottle");
        Lemonade anotherBrand = new Lemonade(60, "bottle");
        Beverage strawberry = new Lemonade(70, "cup");
        Lemonade cherryLime = new Lemonade(80, "glass");
        System.out.println(classic);
        System.out.println(strawberry);
        System.out.println(cherryLime);
        System.out.println(classic.getTastyLevel()+" "+anotherBrand.getTastyLevel());
        System.out.println(((Lemonade) classic).getContainer()+" "+anotherBrand.getContainer());
        System.out.println(classic.equals(anotherBrand));
    }
}
