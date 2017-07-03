package tw.aaa.myproject.OOP.Inheritance;

public class equals2 {

	public static void main(String[] args) {
		// hello:ns->0x3456

				// str1:0x1234
				 String str1 = new String("hello");
				// str1: 0x3456
				//String str1 = "hello";

				// str2:0x2345
				String str2 = new String("hello");
				// str2: 0x3456
				//String str2 = "hello";
				System.out.println("str1==str2="+(str1==str2));
				System.out.println("str1.equals(str2)="+(str1.equals(str2)));
				
				 String str3 ="hello";
				 String str4 ="hello";
				 System.out.println("str3==str4="+(str3==str4));
					System.out.println("str3.equals(str4)="+(str3.equals(str4)));
	}

}
