// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main{
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(2,"cradet");
        hm.put(1,"abies");

        Set<Integer>k=hm.keySet();
        for(int ans:k){
            System.out.println(ans+" : "+hm.get(ans));
        }
        hm.remove(1);
        System.out.println(hm.size());

        for(int i=1;i<=hm.size();i++){
            if (hm.containsKey(i+1)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");


            }
        }
        System.out.println(hm.get(4));
        hm.put(3,"Gow");
        System.out.println(hm);
        System.out.println(hm.size());

        for(int i=1;i<=hm.size();i++){
            if (hm.containsKey(i+1)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");


            }
        }
        System.out.println("................................");
        HashSet<Integer>hs=new HashSet<>();
        for(int i=1;i<16;i++){
            hs.add(i);

        }
        for(int hsval:hs){
            System.out.print(hsval+" ");
        }
        System.out.println();
        hs.remove(1);

        System.out.println(hs);
        System.out.println(hs.size());
        if (hs.contains(1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");


        }


    }
}