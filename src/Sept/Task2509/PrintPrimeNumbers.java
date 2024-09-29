package Sept.Task2509;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int num =100;

        for (int i = 2; i <= num; i++) {
           // System.out.println("i:" +i);
            boolean isPrime=true;
            for (int j = 2; j <= i / 2; j++) {
             //   System.out.println("j:" + j);
            if (i % j ==0){
                isPrime = false;
                break;
            }
            }
            if (isPrime){
                System.out.println(i + "is Prime");
            }
        }
    }
}
