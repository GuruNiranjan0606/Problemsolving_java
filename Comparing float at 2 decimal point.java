import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float n1=sc.nextFloat();
        float n2=sc.nextFloat();
        String format1=String.format("%.2f",n1);
        String format2=String.format("%.2f",n2);
        float ans1=Float.parseFloat(format1);
        float ans2=Float.parseFloat(format2);
//        if(ans1==ans2){
//            System.out.print("Equals");
//        }
//        else{
//            System.out.print("Not Equals");
//
//        }
        String ans=(ans1==ans2)?"Equals":"Not Equals";
            System.out.print(ans);


    }
}