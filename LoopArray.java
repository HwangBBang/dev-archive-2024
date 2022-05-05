public class LoopArray {

	public static void main(String[] args) {
		String[]user = new String[3] ;
		user[0]="BH";
		user[1]="TI";
		user[2]="PT";
		
		for(int i = 0;i<user.length;i++) {
			System.out.println("<li>"+user[i]+"</li>");
		}

	}

}
