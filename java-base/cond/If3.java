package cond;

public class If3 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount += 1000;
            System.out.println("10000 이상 구매 할인");
        }
        if (age <= 10){
            System.out.println("10살 이하 구매 할인");
            discount += 1000;
        }
        price -= discount;
        System.out.println("총 할인 : " +  discount + "원");
        System.out.println("총 가격 : " +  price + "원");

    }
}
