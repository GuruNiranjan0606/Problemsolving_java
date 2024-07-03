import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char ch='a';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
                if(j==26){
                    ch='a';
                }
            }
            System.out.println();
        }
    }
}