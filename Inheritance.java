package tw.aaa.myproject.OOP.Inheritance;

class Employee{
	String name="mary";
	String address="taipei";
	String phone="123456789";
int salary = 22000;

public void getDetails(){
	System.out.println("name:" + name);
	System.out.println("address:" + address);
	System.out.println("phone:" + phone);
}
public int getSalary()
{return salary;
	}
}
class engineer extends Employee{
	public void program(){
		System.out.println("I can write Java Cold(Code).");
	}
}

public class Inheritance {

	
	public static void main(String[] args) {
		engineer a=new engineer();
		a.name="aaa";
		a.address="home";
		a.phone="0123";
		a.salary=50000;
		a.getDetails();
		int salary=a.getSalary();
		System.out.println("Salary:"+salary);
		a.program();
	}

}
