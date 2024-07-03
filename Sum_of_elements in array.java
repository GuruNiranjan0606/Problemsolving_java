import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //declaring size of an array
        int n=sc.nextInt();
        int arr[]=new int[n];
        //getting elements of an array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //calling sum_of_array method for printing output
        System.out.println(sum_of_array(arr,n));

    }
    static int sum_of_array(int arr[],int n){
        int count=0;
        for (int i=0;i<n;i++){
            count+=arr[i];
        }
        return count;
    }
    
}