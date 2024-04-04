public class AndConditionalExpression {
    public static void main (String args[]) {
        double grade = 3.75;

        if(grade == 4.0){
            System.out.println("Your grade is A+");
        } else if(grade >= 3.5 && grade < 4.0){
            System.out.println("Your grade is A");
        } else if(grade >= 3.0 && grade < 3.5){
            System.out.println("Your grade is B+");
        } else if(grade >= 2.5 && grade < 3.0){
            System.out.println("Your grade is B");
        } else if(grade >= 2.0 && grade < 2.5){
            System.out.println("Your grade is C");
        } else {
            System.out.println("You failed the class");
        }
    }
}
