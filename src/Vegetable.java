public abstract class Vegetable implements Growable {
    private String name, type, instructions;
    public Vegetable(String name, String type){
        this.name = name;
        this.type = type;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getInstructions(){
        return instructions;
    }
    protected void setInstructions(String instructions){
        this.instructions = instructions;
    }
    public String getType(){
        return type;
    }
}
