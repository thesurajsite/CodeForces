package CodeForces;
import java.util.*;
public class CandyBags {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int j=1,start=1;
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=n/2;j++)
            {
                System.out.print(start+" ");
                System.out.print(sq+" ");
                start++;
                sq--;
            }
            System.out.println();
        }
    }
}
