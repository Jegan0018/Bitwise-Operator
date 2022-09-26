package Practice;

class Base {
	public void print() {
		  println();
	}

	public void println() {
		System.out.println("Base Class");
	}
}

class Derived extends Base {
	public void println() {
		System.out.println("println");
	}
}

public class GeneralDemo {
	public static void main(String[] args) {
		Base object = new Derived();
		object.print();
	}
}
