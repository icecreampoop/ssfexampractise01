package pck.selfprac1.exampractise.models;

public class Cart {
    private String item;
    private int quantity;

    public Cart(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String cartAttrToStr(){
        return String.format("%s,%d", item,quantity);
    }

    public static Cart stringToCart(String stringVariables) {
        String[] x = stringVariables.split(",");

        Cart newCartItem = new Cart(x[0], Integer.parseInt(x[1]));
        return newCartItem;
    }
    
}
