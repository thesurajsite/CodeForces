package CodeForces;
import java.util.*;
public class Greed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0,cola;
        for(int i=0;i<n;i++)
        {
            cola=sc.nextLong();
            sum=sum+cola;
        }
        ArrayList<Long> a1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a1.add(sc.nextLong());
        }
        Collections.sort(a1);
        Long vol=a1.get(n-1)+a1.get(n-2);
        if(vol>=sum)
        {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
