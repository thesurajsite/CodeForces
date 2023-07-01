package CodeForces;
import java.util.*;
public class SocialNetwork_EasyVersion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k,flag=0;
        n=sc.nextInt();
        k=sc.nextInt();
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            a1.add(0);
        }
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
           for(int j=0;j<k;j++)
           {
               if(a1.get(j)==x) {
                   flag = 1;
                   break;
               }
           }
           if(flag!=1)
           {
               a1.add(0,x);
           }
           flag=0;
//            System.out.println(a1);
        }

        int count=0;
        for(int i=0;i<k;i++)
        {
            if(a1.get(i)!=0)
                count++;
            else {
                break;
            }
        }
        System.out.println(count);
        for(int z=0;z<count;z++)
        {
            System.out.print(a1.get(z)+" ");
        }


    }
}
