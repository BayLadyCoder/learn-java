package com.bay;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	    // single line comment
        /*
            multiline comment
        */
        System.out.println("Hello Java!!!");
        System.out.println(10 + 10);
        System.out.println("'sout' shortcut!");

        // primitive data types (simple values)
        // boolean, byte, short, char, int, long, float, double
        // https://www.w3schools.com/java/java_data_types.asp
        int num1 = 20;
        int num2 = 30;
        int result = num1 + num2;
        System.out.println(result);
        int num3 = 1_000_000_000;
        System.out.println(num3);
        double pi = 3.14;
        double amount = 1_005.25;
        boolean hasCat = true;
        char a = 'a';

        // Java reserved keywords
        // https://www.w3schools.com/java/java_ref_keywords.asp


        // Arithmetic Operators
        System.out.println("Arithmetic Operators");

        int num4 = 10;
        int num5 = 3;

        System.out.println(num4 + num5); // 13
        System.out.println(num4 - num5); // 7
        System.out.println(num4 * num5); // 30
        System.out.println(num4 / num5); // 3
        System.out.println(num4 % num5); // 1

        // BODMAS
        // B-Brackets
        // O-Orders (powers/indices or roots)
        // D-Division
        // M-Multiplication
        // A-Addition
        // S-Subtraction
        System.out.println((2+2) * (3/1) * 2); // 24

        // Increment/Decrement Operators
        System.out.println("Increment/Decrement Operators");
        int number = 0;
        System.out.println(number++); // 0 (return and then increment)
        System.out.println(number); // 1
        System.out.println(number--); // 1 (return and then decrement)
        System.out.println(number); // 0

        System.out.println(++number); // 1 (increment and then return)
        System.out.println(number); // 1
        System.out.println(--number); // 0 (decrement and then return)
        System.out.println(number); // 0


        // Comparison Operators (return boolean)
        System.out.println("Comparison Operators");
        // less than <
        // less than or equal <=
        // greater than >
        // greater than or equal >=
        // equal ==
        // not equal !=
        System.out.println(10 > 10); // false
        System.out.println(10 >= 10); // true
        System.out.println(10 < 10); // false
        System.out.println(10 <= 10); // true
        System.out.println(10 == 10); // true
        System.out.println(10 != 10); // false

        int age = 22;
        boolean isAdult = age > 21;
        System.out.println("isAdult: "  + isAdult); // true
        float pi2 = 3.14f;


        // Shorthand Reassignment
        // https://www.javatpoint.com/shorthand-operator-in-java
        System.out.println("Shorthand Reassignment");
        /* (add, subtract, multiply, divide, mod)
            x += y is x = x + y
            x -= y is x = x - y
            x *= y is x = x * y
            x /= y is x = x / y
            x %= y is x = x % y
         */

        // Strings
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        System.out.println("Strings");

        String firstName = "Taylor";
        String lastName = "Swift";
        System.out.println(firstName + " " + lastName); // Taylor Swift
        System.out.println(firstName.toUpperCase() + " " + lastName.toLowerCase()); // TAYLOR swift
        System.out.println(firstName.substring(0,1).toUpperCase() + " " + lastName.toUpperCase()); // T SWIFT
        System.out.println("    ".isEmpty()); // false
        System.out.println("    ".isBlank()); // true
        System.out.println("  hello  ".trim()); // hello


        // Reference Types (Objects)
        Point pointA = new Point(10, 10); // store coordinates
        System.out.println("pointA = " + pointA);
        pointA.move(11,12);
        System.out.println("pointA = " + pointA);

        // Arrays
        int[] numbers =new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;
        System.out.println(Arrays.toString(numbers)); // [1, 33, 6]
        System.out.println(numbers.length); // 3


        int[] numbers2 = {11, 4, 32, 56, 77};
        System.out.println(Arrays.toString(numbers2)); // [11, 4, 32, 56, 77]
        System.out.println(numbers2.length); // 5

        String[] names = {"Bay", "Sam", "Ringo"};
        System.out.println(Arrays.toString(names));


        // Default values in Arrays
        int[] nums1 = new int[3]; // default value of int array is 0
        System.out.println(Arrays.toString(nums1)); // [0, 0, 0]
        nums1[1] = 23;
        System.out.println(Arrays.toString(nums1)); // [0, 23, 0]
        int[] nums2 = new int[3];
        Arrays.fill(nums2, 15); // override default values
        System.out.println(Arrays.toString(nums2)); // [15, 15, 15]

        boolean[] booleanArr = new boolean[3]; // default value of boolean array is false
        System.out.println(Arrays.toString(booleanArr)); // [false, false, false]

        double[] doubleArr = new double[3]; // default value of double array is 0.0
        System.out.println(Arrays.toString(doubleArr)); // [0.0, 0.0, 0.0]

        String[] stringArr = new String[3]; // default value of String array is null
        System.out.println(Arrays.toString(stringArr)); // [null, null, null]


        // Loops
        // For loop
        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

    }
}
