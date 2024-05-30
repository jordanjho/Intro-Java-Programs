import java.util.Scanner;
public class circle_calc {
    public static class Circle {
        private double radius;

        public String toString() {
            return "Radius: " + radius;
        }
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radiusUpdate) {
            radius = radiusUpdate;
        }
        public double computeDiameter() {
            return radius * 2;
        }
        public double computeArea() {
            return (Math.PI / 4) * Math.pow(computeDiameter(), 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        
        System.out.print("Enter the radius size of circle 1: ");
        int n1 = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter the radius size of circle 2: ");
        int n2 = sc.nextInt();

        c1.setRadius(n1);
        c2.setRadius(n2);
       
        System.out.println("Area of circle one: " + c1.computeArea());
        System.out.println("Area of circle two: " + c2.computeArea());

        sc.close();    
    }
/*
Asks the user for two radius sizes
The program then uses the radius sizes to calculate diameter and area
*/
}
