package Sept.Task_2009;

public class Task3_Triangle_Classifier {
    public static void main(String[] args) {
        // Triangle Classifier
        int side1 = 10;
        int side2 = 10;
        int side3 = 20;

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
