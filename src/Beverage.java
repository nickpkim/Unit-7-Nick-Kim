public class Beverage extends Refreshment implements Comparable{
    private int temp;
    private String container;

    public Beverage(int calories, int tastyLevel, int temp, String container){
        super(calories, tastyLevel);
        this.temp = temp;
        this.container = container;
    }
    public int getTemp(){
        return temp;
    }
    public String getContainer(){
        return container;
    }
    public void setTemp(int temp){
        this.temp = temp;
    }
    public void setContainer(String container){
        this.container = container;
    }
    public int compareTo(Object obj){
        Beverage drink = (Beverage) obj;
        return temp - drink.getTemp();
    }
    public boolean equals(Beverage drink){
        if (this == drink){
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return "Temp: "+temp+", Container: "+container;
    }

    public static void main(String[] args) {
        Refreshment b1 = new Beverage(60, 70, 40, "bottle");
        Beverage b2 = new Beverage(200, 100, 30, "cup");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(((Beverage) b1).compareTo(b2));
    }
}
