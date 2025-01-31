package FullCourse;

public class DataType {
    public static void main(String[] args) {

        //integer types
        byte singleByte = 10; // -128 to 127    8 bits
        short smallNumber = 20000; // -32,768 to 32,767    16 bits
        int integerNumber = 123654; // -2,147,483,648 to 2,147,483,647    32bits
        long longNumber = 212321321332131112L; //  64bits

        //decimal types
        double doubleNumber = 1.113231; //upto 16 decimal digits
        float floatNumber = 3.31F;  // upto 7 decimal digits

        //boolean
        boolean isWeekend = true;   // true or false
        boolean isWorkday = false;

        //characters
        char copySy = '\u00A9';
        System.out.println(copySy);

    }
}
