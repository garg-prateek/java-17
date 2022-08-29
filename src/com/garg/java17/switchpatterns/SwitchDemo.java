package com.garg.java17.switchpatterns;

public class SwitchDemo {

	public static double getPerimeter(Shape shape) {

		if (shape instanceof Circle c) {
			return 2 * Math.PI * c.radius();
		} else if (shape instanceof Rectangle r) {
			return 2 * (r.length() + r.width());
		} else {
			throw new IllegalArgumentException();
		}

	}

	public static void main(String[] args) {
		System.out.println(getPerimeterUsingSwitch(new Circle(20)));
	}

	public static double getPerimeterUsingSwitch(Shape shape) {

		return switch (shape) {
		case Circle c -> 2 * Math.PI * c.radius();
		case Rectangle r -> 2 * (r.length() + r.width());
		default -> throw new IllegalArgumentException("Unexpected value: " + shape);
		};

	}
}
