
public class IT26102740Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;
        double length;
        double width;

        length = perimeter / (2 * (1 + 0.75));
        width = 0.75 * length;

        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}
