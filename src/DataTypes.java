public class DataTypes {
    public static void main (String args[]){
        byte byteData = 127; // 8 bits: -128 to 127
        short shortData= 32_767; // 16 bits: -32,768 to 32,767
        int intData = 2_147_483_647; // 32 bits: -2,147,483,648 to 2,147,483,647
        long longData = 9_223_372_036_854_775_807L; // 64 bits: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float floatData = 0.12345678f; // 32 bits: up to 7 decimal digits
        double doubleData = 0.1234567890123456; // 64 bits: up to 16 decimal digits
        boolean booleanData = true; // 1 bit: true or false
        char charData = 'A'; // 16 bits: characters representation of ASCII values, 0 to 255

        System.out.println("Byte is: " + byteData );
        System.out.println("Short is: " + shortData );
        System.out.println("Int is: " + intData );
        System.out.println("Long is: " + longData );
        System.out.println("Float is: " + floatData );
        System.out.println("Double is: " + doubleData );
        System.out.println("Boolean is: " + booleanData);
        System.out.println("Char is: " + charData );
    }
}
