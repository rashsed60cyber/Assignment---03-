public class RectangleInput {
    public static void main(String[] args) {
        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
