class Circle2 {
	private double radius = 0;

	public Circle2 setRadius(double radius) {
		this.radius = radius;
		return this;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public Circle2 display() {
		System.out.println("Areas of circle with radius " + radius + " = "
				+ getArea());

		return this;
	}
}

public class ThisTest {
	public static void main(String args[]) {
		Circle2 circle1 = new Circle2();

		(((circle1.setRadius(3)).display()).setRadius(5)).display();
		circle1.setRadius(3).display().setRadius(5).display();
	}
}

