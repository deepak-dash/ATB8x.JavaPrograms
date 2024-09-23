package Sept.ex23092024;

public class Lab053_Switch {
    public static void main(String[] args) {
      //Switch condition
      //multiway branch statement
        //Days - 1 to 7
        int day =1;
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea");
                break;
        }
        System.out.println("Out of the loop");


    }
}
