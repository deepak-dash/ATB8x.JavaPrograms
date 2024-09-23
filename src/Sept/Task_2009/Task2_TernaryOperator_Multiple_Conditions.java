package Sept.Task_2009;

public class Task2_TernaryOperator_Multiple_Conditions {
    public static void main(String[] args) {
       // Ternary Operators to handle multiple conditions.
      // Input → int score = 85
      // String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C

        char Grade = 'A';
        int score = 95;
        if (score >= 90 && score <= 100) {
            Grade = 'A';
        } else if (score >= 80 && score <= 89) {
            Grade = 'B';
        } else if (score >= 70 && score <= 79) {
            Grade = 'C';
        } else if (score >= 60 && score <= 69) {
            Grade = 'D';
        } else if (score < 0 || score > 100) {
            Grade = 'O';
            System.out.println("You are Great !!!");
        }else{
            Grade = 'F';
        }
        System.out.println("Your Grade is " + Grade);
    }
    }


