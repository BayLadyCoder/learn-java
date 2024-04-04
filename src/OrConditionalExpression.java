public class OrConditionalExpression {
    public static void main (String args[]) {
        double account_balance = 50_000.84;
        int age = 65;

        if(account_balance >= 1_000_000 || age >= 65) {
            System.out.println("You can retire now. Good luck!");
        } else {
            System.out.println("You still need to save money for retirement.");
        }
    }
}
