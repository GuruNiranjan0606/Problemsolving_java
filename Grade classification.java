import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("GRADE CLASSIFICATION:");
       System.out.println("ENTER YOUR MARKS:");
       int marks=scanner.nextInt();
       if(marks<=100&&marks>=50){
           if(marks>=50&&marks<=75){
               System.out.println("AVERAGE");
           }
           else{
               System.out.println("EXCELLENT");
           }
       }
       else{
           System.out.println("FAILED");
       }
    }
}