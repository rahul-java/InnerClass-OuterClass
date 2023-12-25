package Outer;

public class Outer {

	void outerMethod() {
		Inner inner = new Inner();
		inner.innerMethod();
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod();
	}
	
	class Inner{
		//hiding this class from other classes then we create inner class only outer class can access this class
		void innerMethod() {
			System.out.println("innerMethod() called...");
		}
	}
}
