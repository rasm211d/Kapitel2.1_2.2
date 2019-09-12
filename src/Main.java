import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("2.1");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles: ");
        double miles = input.nextDouble();
        System.out.println("Is the same as " + miles * 1.6 + "km");

        System.out.println("2.2");
        System.out.println("Enter a side of an equilateral triangle: ");
        double side = input.nextDouble();
        double area = Math.sqrt(3) / 4 * Math.pow(side, 2);
        double volume = area * side;

        System.out.println("The area is: " + area + " and the volume is " + volume);
    }
}
