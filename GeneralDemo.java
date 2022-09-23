package Practice;

interface Base {
	void println();
}

class Derived implements Base {
	public void println() {
		System.out.println("println");
	}
}

public class GeneralDemo {
	public static void main(String[] args) {
		Base object = new Derived();
		object.println();
	}
}
