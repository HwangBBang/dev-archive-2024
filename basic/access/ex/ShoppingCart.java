package access.ex;

public class ShoppingCart {

    Item [] carts = new Item[10];

    private int i = 0;
    private int totalPrice = 0;

    public void addItem(Item item) {
        if (carts.length <= i) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        carts[i] = item;
        i++;
    }
    public void displayItems() {
        System.out.println("[장바구니 상품 출력]");
        for (int j = 0; j < i; j++) {
            Item cart = carts[j];

            System.out.print("상품명 : " + cart.getName());
            System.out.print(" | 가격 : " + cart.getPrice());
            System.out.print(" | 수량 : " + cart.getQuantity());
            System.out.println(" | 합계 : " + cart.getEachPrice());

        }
        System.out.println("전체 가격 : " + getTotalPrice());

    }
    private int getTotalPrice() {
        for (int j = 0; j < i  ; j++) {
            Item cart = carts[j];
            totalPrice += cart.getEachPrice();
        }
        return totalPrice;
    }


}
