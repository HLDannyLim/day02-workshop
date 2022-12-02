package cart;

public class Orange extends Item {    
    private String type;
    public Orange (){
        // this must be the first line of Item class got constructor. must name super(...)
        super("Orange", "orange");
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }





}


