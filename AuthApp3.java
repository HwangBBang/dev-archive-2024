public class AuthApp3 {

	public static void main(String[] args) {
		
//		String []users = {"BH" , "PP", "TI"};
		
		String [][]users = {
				{"BH" ,"3737",},
				{"PP","3738"},
				{"TI","7956"}
		};
		String inPutid = args[0];
		String inPutpass = args[1];
	boolean isLogined =false;
	for(int i = 0;i<users.length;i++) {
			
		String currentId = users[i][];
		if(currentId.equals(inPutid)) {
			System.out.println("LogIn");
			isLogined = true;
			break;
			}
	
		
		}
	if(isLogined) {
		System.out.println("HI, MASTER.");
	}else {
		System.out.println("WHO ARE YOU?");
		}
	} 

}
