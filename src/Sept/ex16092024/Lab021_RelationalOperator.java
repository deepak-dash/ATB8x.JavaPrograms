package Sept.ex16092024;

public class Lab021_RelationalOperator {
    public static void main(String[] args) {
        //< > >= ,<= , true or false

        int a = 30;
        int b = 20;
        boolean c =a < b;
        System.out.println(c);

        int age_deep = 30;
        int age_test= 30;
        //boolean result = age_deep < age_test;
        boolean result = age_test <= age_deep;
        System.out.println(result);

    }
}
