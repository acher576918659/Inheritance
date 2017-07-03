package tw.aaa.myproject.OOP.Inheritance;
class SecuritySystem1{
	private String systemuser="john",ststempwd="1234";
public boolean verifyId(String username,String userpwd){
	//equalsIgnoreCase判斷不區分大小寫
	if(systemuser.equalsIgnoreCase(username.trim())&&ststempwd.equals(userpwd.trim()))
	{return true;}
	return false;
}

}
public class equals3 {

	public static void main(String[] args) {
		SecuritySystem1 verify = new SecuritySystem1();

		if (args.length >= 2) {
			boolean status = verify.verifyId(args[0], args[1]);
			System.out.println("status:" + status);
		}

	}

}
