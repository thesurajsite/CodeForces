package CodeForces;
import java.util.*;
public class GenerousKefa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        String col=sc.next();

        ArrayList<Character> a1=new ArrayList<Character>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a1.add(col.charAt(i));
        }
        Collections.sort(a1);
      //  System.out.println(a1);
        int count=1;
        int in=0;
        for(int i=1;i<n;i++)
        {
           char temp=a1.get(in);
           if(temp==a1.get(i))
           {
               count++;
           }
           else{
               in=i;
               a2.add(count);
               count=1;
           }
        }
        a2.add(count);
        Collections.sort(a2);
       // System.out.println(a2);
        if(a2.get(a2.size()-1)<=k)
        {
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}
