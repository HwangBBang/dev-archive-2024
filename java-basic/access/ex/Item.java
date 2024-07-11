package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;
    private int totalPrice ;
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

     public String getName() {
         return this.name;
    }
    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
    // 본인의 데이터는 본인이 계산하는 것이 가장 좋다!
    public int getEachPrice() {
        return this.quantity * this.price;
    }

}
