public class AuthApp2 {

	public static void main(String[] args) {
	
		System.out.println(args[0]);
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		String pass2 = "2222";
		
//		System.out.println("Hi!");
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

		
		boolean isRightPass =(inputPass.equals(pass)||inputPass.equals(pass2));
		if(inputId.equals(id) && isRightPass)
				{
				System.out.println("Wellcome MASTER!");
		}else {
			System.out.println("Who are you?");
		}
		
		
	}
}
