public class DoubleMethod {
    public static void main(String args[]) {
        System.out.println(add(1, 2));
        System.out.println(add(19.11, 22.45));
        System.out.println(add(35.129, 988.199));
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}
