public class ForEachLoop {
    public static void main (String args[]) {
        String[] celebrities = {"Bruno Mars", "Taylor Swift", "Max Smith", "Eminem"};
        // For each loop
        for(String name:celebrities) {
            System.out.print(name);
            System.out.print(", ");
        }
        System.out.println();
        int[] ages = {20, 22, 24, 43};
        // For each loop
        for(int age:ages) {
            System.out.print(age);
            System.out.print(", ");
        }
    }
}
