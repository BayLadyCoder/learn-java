public class StaticMethod {
    public static void main(String args[]) {
        nameOfDog("Toby");
        bark();
        bark();
    }

    public static void nameOfDog(String name) {
        System.out.println("My name is: " + name);
    }

    public static void bark() {
        System.out.println("I am barking!");
    }
}
