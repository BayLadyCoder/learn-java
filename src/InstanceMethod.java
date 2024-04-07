class Student {
    public void name_of_student(String name) {
        System.out.println(String.format("Student name is: %s", name));
    }
    public void grade(double grade) {
        System.out.println(String.format("Student grade is: %.2f", grade));
    }
    // static method
    public static void className(String name) {
        System.out.println(String.format("Class name is: %s", name));
    }
}

public class InstanceMethod {
    public static void main(String args[]) {
        // static method can be called without instantiating a new object
        Student.className("anything!");

        // create student 1 object
        Student student1 = new Student();
        student1.name_of_student("Stacy");
        student1.grade(3.25);
        Student.className("student1");

        // create student 2 object
        Student student2 = new Student();
        student2.name_of_student("Kevin");
        student2.grade(3.75);
        Student.className("student2");

        // create student 3 object
        Student student3 = new Student();
        student3.name_of_student("Raj");
        student3.grade(3.10);
        Student.className("student3");
    }
}
