package practiceproject;

import java.util.Scanner;


public class GeometryAreaCalculator {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Geometry Area Calculator");
	            System.out.println("1. Calculate the Area of a Rectangle");
	            System.out.println("2. Calculate the Area of a Triangle");
	            System.out.println("3. Calculate the Area of a Circle");
	            System.out.println("4. Calculate the Area of a Square");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    calculateRectangleArea();
	                    break;
	                case 2:
	                    calculateTriangleArea();
	                    break;
	                case 3:
	                    calculateCircleArea();
	                    break;
	                case 4:
	                    calculateSquareArea();
	                    break;
	                case 5:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        } while (choice != 5);

	        scanner.close();
	    }

	    public static void calculateRectangleArea() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();
	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();
	        double area = length * width;
	        System.out.println("The area of the rectangle is: " + area);
	    }

	    public static void calculateTriangleArea() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the base of the triangle: ");
	        double base = scanner.nextDouble();
	        System.out.print("Enter the height of the triangle: ");
	        double height = scanner.nextDouble();
	        double area = 0.5 * base * height;
	        System.out.println("The area of the triangle is: " + area);
	    }

	    public static void calculateCircleArea() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();
	        double area = Math.PI * Math.pow(radius, 2);
	        System.out.println("The area of the circle is: " + area);
	    }

	    public static void calculateSquareArea() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the side length of the square: ");
	        double sideLength = scanner.nextDouble();
	        double area = sideLength * sideLength;
	        System.out.println("The area of the square is: " + area);
	    }
	}


