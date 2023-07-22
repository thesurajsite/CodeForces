package CodeForces;
import java.util.*;
public class PolycarpRecoversThePermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            ArrayList<Integer> a1=new ArrayList<>();
           // ArrayList<Integer> a2=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                a1.add(sc.nextInt());
            }
          //  System.out.println("input completed");

           if(a1.get(0)==n || a1.get(n-1)==n){
               for(int j=n-1;j>=0;j--){
                   System.out.print(a1.get(j)+" ");
               }
               System.out.println();
           }
           else{
               System.out.println("-1");
           }
        }
    }
}
