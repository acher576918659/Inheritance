package tw.aaa.myproject.OOP.Inheritance;

class parent {
	public void jog() {
		System.out.println("slow");
	}

}

class child extends parent {
	public void jog() {
		System.out.println("fast");
	}
}

public class overriding {

	public static void main(String[] args) {
		child a=new child();
		a.jog();
	}

}
