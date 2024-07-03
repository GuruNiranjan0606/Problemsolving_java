import java.lang.*;
import java.util.*;
//creating class
class Main{
    public static void main(String[] args){
        //object declaration for scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an size of an array");
        int n=sc.nextInt();
        //length declaration for an array
        int arr[]=new int[n];
        System.out.println("Enter the Elements:");
        //obtaining elements for an array 
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Entered Elements are: ");
        //displaying elements in an array
            System.out.print(Arrays.toString(arr));
        
    }
}