package cart;

public class Item {
    private String name ; // string if never put value will be "null"
    private String code ;
    private Float price = 0f ;
    private Integer quantity = 0 ;


    public String getName() {
        return name;
    }   
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float totalPrice(){
        return this.price*this.quantity ;
    }
    public Item(String name, String code) { //this is call overloading
        this.name = name;
        this.code = code ;
    }


    
}
