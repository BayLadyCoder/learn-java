public class VoidMethod {
    public static void main (String args[]) {
        greet("Bay");
        greet("Taylor");
        greet("Katniss");
    }

    // Method that returns nothing
    public static void greet(String name) {
        System.out.println(String.format("Hello, %s", name));
    }
}
