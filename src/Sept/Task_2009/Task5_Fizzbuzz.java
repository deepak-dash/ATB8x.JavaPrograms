package Sept.Task_2009;

public class Task5_Fizzbuzz {
    public static void main(String[] args) {
        /*FizzBuzz Test:
        Write a program that prints numbers from 1 to 100.
        However,for multiples of 3, print "Fizz" instead of the number, and for multiples of 5,
        print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."*/

        int a = 20;
        if (a % 5 == 0 && a % 7 == 0) {
            System.out.println("FizzBuzz");
        } else if (a % 5 == 0 && a % 7 != 0) {
            System.out.println("Fizz");
        } else if (a % 5 != 0 && a % 7 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Number is not divided by 5 & 7");
        }
    }
}
