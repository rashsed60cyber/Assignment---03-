import java.util.Scanner;

public class AreaOfQuadrilaterals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area (except square):");
        System.out.println("1. Rectangle");
        System.out.println("2. Parallelogram");
        System.out.println("3. Rhombus");
        System.out.println("4. Trapezium");
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        double area = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter width: ");
                double width = input.nextDouble();
                System.out.print("Enter height: ");
                double height = input.nextDouble();
                area = width * height;
                System.out.println("Area of Rectangle = " + area);
                break;

            case 2:
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                System.out.print("Enter height: ");
                double h = input.nextDouble();
                area = base * h;
                System.out.println("Area of Parallelogram = " + area);
                break;

            case 3:
                System.out.print("Enter first diagonal: ");
                double d1 = input.nextDouble();
                System.out.print("Enter second diagonal: ");
                double d2 = input.nextDouble();
                area = (d1 * d2) / 2;
                System.out.println("Area of Rhombus = " + area);
                break;

            case 4:
                System.out.print("Enter base1: ");
                double a = input.nextDouble();
                System.out.print("Enter base2: ");
                double b = input.nextDouble();
                System.out.print("Enter height: ");
                double heightT = input.nextDouble();
                area = 0.5 * (a + b) * heightT;
                System.out.println("Area of Trapezium = " + area);
                break;

            default:
                System.out.println("Invalid choice! Please choose between 1 to 4.");
        }

        input.close();
    }
}
