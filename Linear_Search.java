import java.util.*;
public class Main{

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element is the target
            if (array[i] == target) {
                // Return the index of the target
                return i;
            }
        }
        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        // Example array and target
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter Elements of an array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter Target to find in an Array");
        int target = sc.nextInt();

        // Perform the linear search
        int result = linearSearch(array, target);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
