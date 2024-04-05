public class BooleanMethod {
    public static void main(String args[]) {
        System.out.println(isEven(20));
        System.out.println(isEven(24));
        System.out.println(isEven(209));
        System.out.println(isEven(130));
    }

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
}
