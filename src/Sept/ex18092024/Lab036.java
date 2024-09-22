package Sept.ex18092024;

public class Lab036 {
    public static void main(String[] args) {
        //GST =18.45;
        int course = 100;
        float gst = 18.45F;
      //  float total_price=course + gst; //narrowing //implicit //JVM invalid
       // System.out.println(total_price);

        int total_price= course + (int)gst;

        System.out.println(total_price); //narrowing explicit - Loss



    }
}
