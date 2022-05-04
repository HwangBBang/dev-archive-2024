public class ArrayApp {

	public static void main(String[] args) {
		String[] usersStrings =new String[3];
		usersStrings[0] ="egoing";  //index 0번에 Element "egoing" 이 들어있음 
		usersStrings[1]= "nomuhyun";
		usersStrings[2]="lee jJJJae";
		
		System.out.println(usersStrings[1]);
		System.out.println(usersStrings.length);
		
		int[] scores = {10, 100, 97};
		System.out.println(scores[1]);
	}

}
