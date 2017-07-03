package tw.aaa.myproject.OOP.Inheritance;

class fish {
	String name = "abc";

	public fish() {
		System.out.println("default action");
	}

	public fish(String name) {
		this.name = name;
	}

	public void swim() {
		System.out.println("swim " + name);
	}
}

class Shark extends fish {
	public Shark() {
		super("Dolly");
	}
}

public class Inheritance_super {

	public static void main(String[] args) {
		Shark a = new Shark();
		a.swim();
		System.out.println("finished");
	}

}
