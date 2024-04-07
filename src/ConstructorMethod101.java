public class ConstructorMethod101 {
    /*
        Constructor Method
         - Default method of the class that will be run at the time when the object is created or instantiated
         - Constructor method is used to declare default behavior for all objects
         - Constructor name MUST be the same as its class name
         - Constructor MUST have NO EXPLICIT RETURN TYPE
         - There are two types of constructors
               1. Default Constructor (no-argument constructor)
               2. Parameterized Constructor
     */
    public ConstructorMethod101() {
        System.out.println("This is constructor method");
    }

    public ConstructorMethod101(String param) {
        System.out.println("This is constructor method with parameter " + param);
    }

    public void InstanceMethod() {
        System.out.println("This is instance method");
    }
}

class ConstructorMethodExample {
    public static void main(String args[]) {
        // create object method1 with default constructor
        ConstructorMethod101 method1 = new ConstructorMethod101();
        method1.InstanceMethod();

        // create object method2 with constructor having parameter
        ConstructorMethod101 method2 = new ConstructorMethod101("constructor!");
        method2.InstanceMethod();
    }
}
