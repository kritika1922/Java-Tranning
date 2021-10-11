 

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeImpl implements Shape {
	double area;
	double perimeter;

	public void rectangle(double length, double width) {
		area = length * width;
		perimeter = 2 * (length + width);
	}

	public void circle(double redius) {
		area = (22 * redius * redius) / 7;
		perimeter = (22 * 2 * redius) / 7;
	}

	public void triangle(double a, double height, double base) {
		area = base * height / 2;
		perimeter = a + height + base;
	}

	public void square(double side) {
		area = side * side;
		perimeter = 4 * side;
	}

	public static void main(String arg[]) {
		try {
			Scanner sc = new Scanner(System.in);
			String shape;
			System.out.println("Enter Shape");
			shape = sc.nextLine();
			ShapeImpl shapeImpl = new ShapeImpl();

			while (true) {

				switch (shape) {
				case "Circle":
					System.out.println("Enter the radius:");
					double radius = sc.nextDouble();
					shapeImpl.circle(radius);
					System.out.println("Area of Circle is: " + shapeImpl.area);
					System.out.println("Perimeter of Circle] is: " + shapeImpl.perimeter);
					break;
				case "Rectangle":
					System.out.println("Enter the height and weight:");
					double length = sc.nextDouble();
					double weight = sc.nextDouble();
					shapeImpl.rectangle(length, weight);
					System.out.println("Area of Circle is: " + shapeImpl.area);
					System.out.println("Perimeter of Circle] is: " + shapeImpl.perimeter);
					break;
				case "Triangle":
					System.out.println("Enter the base and height:");
					double base = sc.nextDouble();
					double height = sc.nextDouble();
					double a = sc.nextDouble();
					shapeImpl.triangle(base, height, a);
					System.out.println("Area of Circle is: " + shapeImpl.area);
					System.out.println("Perimeter of Circle] is: " + shapeImpl.perimeter);
					break;
				case "Square":
					System.out.println("Enter the Side:");
					double side = sc.nextDouble();
					shapeImpl.square(side);
					System.out.println("Area of Circle is: " + shapeImpl.area);
					System.out.println("Perimeter of Circle] is: " + shapeImpl.perimeter);
					break;

				case "NO":
					System.exit(0);
				default:
					System.out.println("Invalid grade\n");
					break;

				}

				System.out.println("do you want to again press whatever you want");
				shape = sc.nextLine();
			}
		} catch (InputMismatchException e ) {
			System.out.print("That’s not " + "an String. Try again: ");
		}

	}

}

