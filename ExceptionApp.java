#Touched by 202103769 HwangBBang

public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int[]scores = {10,20,30};
	
		try {
			System.out.println(2);
	
			System.out.println(scores[4]);
			System.out.println(3);
		System.out.println(2/0); //=> 브레이크 처럼 빠져 나간다.
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("잘못된 계산입니다!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지않는 값 입니다!");
		System.out.println(5);

	}

	}}
