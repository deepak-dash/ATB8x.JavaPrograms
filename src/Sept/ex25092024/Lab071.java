package Sept.ex25092024;

public class Lab071 {
    public static void main(String[] args) {
        //Print even and odd from 0 to 50
        for (int i = 0; i <= 50; i++) {

            if(i % 2 ==0){
                System.out.println("Even" + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
