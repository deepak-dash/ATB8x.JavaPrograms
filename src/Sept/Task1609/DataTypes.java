package Sept.Task1609;

public class DataTypes {
    public static void main(String[] args) {
        //   Difference between = and  ==?
             // = assigns value to the variable and  == compares between two values

        //   byte b = 10; long l = 10l; → How much Byte will be used. - For Byte 10 1 byte in memory is used and for long 10L 8byte will be used
            //out put in 9 byte

        //   Another byte b = 10; byte c = 10;  What is the answer if to perform b+c, What is the data type it will give in result.

        byte b = 10,c = 10;
        System.out.println("Output of b+c:"+(b+c));


        short s = 10;
        char d = 'A'; //65
        int ss = s + d;
        System.out.println(ss); //output is 75
    }
}
