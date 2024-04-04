public class ForLoopInArray {
    public static void main (String args[]) {
        double[] numList = {121.9, 400.9, 304.4, 312.5};

        // Print all the array elements
        for(int i=0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }

        // Sum all the numbers in the array
        double sum = 0;
        for(int i=0; i < numList.length; i++) {
            sum = sum + numList[i];
        }
        System.out.println("Sum is: " + sum);

        // Find the largest number of the array
        double max = numList[0];
        for(int i=1; i < numList.length; i++) {
            if(numList[i] > max) {
                max = numList[i];
            }
        }
        System.out.println("Largest number in the array is: " + max);
    }
}
