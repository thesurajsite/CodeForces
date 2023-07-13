package CodeForces;
import java.util.*;
public class GoldRush {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int n,x=1,m,flag=0;
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            if(n==m) {
                flag++;
              //  System.out.println("yes");
            }
            int temp=0,temp2=0;
            while(n>m)
            {
               // System.out.println("workinh");
                if(n%3==0 || x%3==0)
                {
                    //System.out.println("hiii");
                    temp=(n/3)*2;
                    temp2=n/3;
                    n=temp;
                    x=temp2;
                }
                else break;
                if(n==m || x==m)
                {
                    flag++;
                    //System.out.println("yes");
                    break;
                }
            }
            System.out.println("flag ="+flag);

            if(flag==1)
            {
                System.out.println("YES");
            }
            else System.out.println("NO");
            flag=0;
        }
    }
}
