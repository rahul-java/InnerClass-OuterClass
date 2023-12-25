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
	
	private class Inner{
		//hiding this class from other classes then we create inner class only outer class can access this class
		//we can use private / protected modifier for inner class
		// but we can not use private / protected modifier for outer class
		
		void innerMethod() {
			System.out.println("innerMethod() called...");
		}
	}
}
