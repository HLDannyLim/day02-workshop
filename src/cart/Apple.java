package cart;

public class Apple extends Item {    
    private String type;
    public Apple (){
        // this must be the first line of Item class got constructor. must name super(...)
        super("Apple", "apple");
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }





}


