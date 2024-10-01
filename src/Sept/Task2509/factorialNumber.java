package Sept.Task2509;

public class factorialNumber {
    public static void main(String[] args) {
        int n =5;
        int factorial=1;

        for (int i = 1; i <= 8; i++) {
            factorial *= i;

        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
