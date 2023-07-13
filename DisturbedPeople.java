package CodeForces;
import java.util.*;
public class DisturbedPeople {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []num=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            if(num[i]==1 && num[i+1]==0 && num[i+2]==1)
            {
                count++;
                num[i+2]=0;
            }
        }
        System.out.println(count);
    }
}
