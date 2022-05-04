public class AuthApp {

	public static void main(String[] args) {
	
		System.out.println(args[0]);
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		System.out.println("Hi!");
		String inputPass = args[1];

		//		if(inputId==id)
//		if(inputId.equals(id)) 
//		{
//			if(inputPass.equals(pass)) {
//				System.out.println("Wellcome MASTER!");
//			}
//			else {
//				System.out.println("Worng PASSWARD");
//		}
//		
//		}
//		else {
//			System.out.println("Who are you?");
//		}

		if(inputId.equals(id) && inputPass.equals(pass)) {
				System.out.println("Wellcome MASTER!");
		}else {
			System.out.println("Who are you?");
		}
		
		
	}
}
