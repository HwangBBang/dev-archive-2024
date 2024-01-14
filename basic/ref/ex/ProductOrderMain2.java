package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");int n = sc.nextInt();
        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < n ; i++) {
            System.out.println((i+1) +"번째 주문 정보를 입력하세요.");
            sc.nextLine();
            System.out.print("상품명: ");String inputName = sc.nextLine();
            System.out.print("가격: ");int inputPrice = sc.nextInt();
            System.out.print("수량: ");int inputQuantity = sc.nextInt();

            orders[i] = createOrder(inputName, inputPrice, inputQuantity);
        }

        printOrders(orders);
        System.out.println("총 가격은 " + getTotalPrice(orders) + "원");
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (int i = 0; i <orders.length ; i++) {
            System.out.print("| 상품명 : "+ orders[i].productName);
            System.out.print(" | 가격 : "+orders[i].price+ "원");
            System.out.println(" | 수량 : "+orders[i].quantity + "개 |");
        }
    }

    static int getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += order.price * order.quantity;
        }
        return totalPrice;
    }
}
