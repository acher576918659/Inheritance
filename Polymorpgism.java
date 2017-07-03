package tw.aaa.myproject.OOP.Inheritance;

public class Polymorpgism {
	public void processAction(mammal m) {// Mammal m = garField; -> Mammal m =new Cat();						 
		m.sleep();                       // Mammal m = new Dog();
		if (m instanceof cat) {
			cat c1 = (cat) m;
			c1.jumpAway();
		}
		if (m instanceof dog) {
			dog d1 = (dog) m;
			d1.bite();
		}
	}

	public static void main(String[] args) {
		Polymorpgism a = new Polymorpgism();
		cat garField = new cat();
		a.processAction(garField);
		a.processAction(new dog());

	}

}
