package Sept.Task_2009;

import java.util.Scanner;

public class Fizzbuzz_ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N");
        int n = sc.nextInt();

        for (int i = 0; i <= 100 ; i++) {
            if (i % 3 ==0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            } else if (i % 3 ==0 ) {
                System.out.println("Fizz");

            } else if (i % 5 ==0 ) {
                System.out.println("Buzz");

            }else
                System.out.println("i");

        }
    }

}
