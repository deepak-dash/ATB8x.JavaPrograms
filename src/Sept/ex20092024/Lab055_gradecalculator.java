package Sept.ex20092024;

public class Lab055_gradecalculator {
    public static void main(String[] args) {
        //grade calculator
        char grade = 'F';
        int score = 89;

        if (score >= 90 && score <= 100){
            System.out.println("A");
        } else if (score >= 80 && score <=89) {
            System.out.println("B");
            
        }else  if((score >= 70 && score <=79)) {
            System.out.println("C");
        } else if (score >= 60 && score <=59) {
            System.out.println("D");

        }else {
            System.out.println("F");
        }
        System.out.println("your grade is :" + grade);
    }
}
