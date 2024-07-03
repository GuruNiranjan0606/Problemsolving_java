import java.util.*;
class main{

    static boolean is_leap(int year){
        if(year%4==0&&((year%100!=0)||(year%400==0))){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year=sc.nextInt();
        System.out.println("Enter the month : ");
        int month=sc.nextInt();
        int n1=31;
        int n2=30;
        int leap_feb=29;
        int feb=28;
        System.out.println("The days in the month "+month+" of year "+year+" is : ");
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println(n1);
        }
        else if(month==4||month==6||month==9||month==11){
            System.out.println(n2);
        }
        else{
            if(is_leap(year)){
                System.out.println(leap_feb);
            }
            else{
                System.out.println(feb);
            }
        }

    }

}