package tw.aaa.myproject.OOP.Inheritance;

class car {
	String a = "java";

	public void drive() {
		System.out.println("drive " + a + " car");
	}
}

public class equals {

	public static void main(String[] args) {
		car car1 = new car();
		car car2 = new car();
		System.out.println("(car1==car2)=" + (car1 == car2));
		System.out.println("car1.equals(car2)=" + (car1.equals(car2)));

		car1 = car2;

		System.out.println("(car1==car2)_1=" + (car1 == car2));
		System.out.println("car1.equals(car2)_1=" + (car1.equals(car2)));
	}
}
