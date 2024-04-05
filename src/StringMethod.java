public class StringMethod {
    public static void main(String args[]) {
        System.out.println(greet("Bay"));
        System.out.println(greet("Taylor"));
        System.out.println(greet("Katniss"));
    }

    // Method that returns String value
    public static String greet(String name) {
        return String.format("Hello, %s! Welcome to Java course!", name);
    }
}
