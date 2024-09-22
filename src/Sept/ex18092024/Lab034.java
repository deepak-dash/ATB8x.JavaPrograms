package Sept.ex18092024;

public class Lab034 {
    public static void main(String[] args) {
        //Type casting
        //widening
        //narrowing

        byte b = 10;
        int a = b; //valid implicit casting JVM
        int a1 =(int)b; //explicit casting JVM

        int val =300;
        byte b2 = (byte)val;
        System.out.println(b2);
    }
}
