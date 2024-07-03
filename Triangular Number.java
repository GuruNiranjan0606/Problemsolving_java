import java.util.Scanner;

class Main{
    static void triangular(int n){
        int sum=1;
        for(int i=2;i<=n;i++){
            sum=sum+i;
            if(sum==n){
                System.out.println("YES");
                return;
            }
            else if(sum>n){
                System.out.println("NO");
                return;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        triangular(n);
    }
}