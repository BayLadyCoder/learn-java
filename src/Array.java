public class Array {
    public static void main (String args[]) {
        String[] studentNames = new String[] {"John", "David", "Henry", "Bob", "Victor"};
        int[] studentAges = new int[] {25, 32, 29, 39, 40};
        double[] studentGrades = new double[] {4.0, 3.25, 3.0, 2.9, 3.5};

        String[] studentSubjects = new String[5];
        studentSubjects[0] = "Computer Science";
        studentSubjects[1] = "Sociology";
        studentSubjects[2] = "History";
        studentSubjects[3] = "Biology";
        studentSubjects[4] = "English";

        System.out.println(studentNames[0]);
        System.out.println(studentNames[2]);
        System.out.println(studentNames[4]);
        System.out.println(studentAges[0]);
        System.out.println(studentAges[4]);
        System.out.println(studentGrades[3]);
        System.out.println(studentSubjects[4]);
    }
}
