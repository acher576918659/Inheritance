package tw.aaa.myproject.OOP.Inheritance;

class mammal {
	public void sleep() {
		System.out.println("i can sleep");
	}
}

class cat extends mammal {
	public void sleep() {
		System.out.println("cat sleep");
	}

	public void jumpAway() {
		System.out.println("cat jumps away");
	}
}

class dog extends mammal {
	public void sleep() {
		System.out.println("dog sleep");
	}

	public void bite() {
		System.out.println("dog bites bone.");
	}

}

public class Polymorpgism1 {

	public static void main(String[] args) {
		mammal a;
		a = new cat();
		a.sleep();
		a = new dog();
		a.sleep();
	}

}