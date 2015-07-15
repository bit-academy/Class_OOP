class A {
	int i;
	static int si;

	void m() {
		System.out.println(si);
		System.out.println(i);
		System.out.println(this.si);
		System.out.println(this.i);
	}

	static void sm() {
		System.out.println(si);
		// System.out.println(i);
		// System.out.println(this.si);
		// System.out.println(this.i);
		// m();
	}
}

public class StaticTest {
	public static void main(String[] args) {
		A a1, a2;
		a1 = new A();
		a2 = new A();
		A.sm();
		// A.m();
		a1.sm();
		a1.m();
		a2.m();
	}
}