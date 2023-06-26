package CodeForces;
import java.util.*;
public class ValeraAndPlates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,k;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        int count=0,flag=0,bartan=0;
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a1.add(sc.nextInt());
        }
        for(int j=0;j<n;j++)
        {
            if(a1.get(j)==1)
            {
                if(m<=0)
                {
//                    System.out.println("bartan dhooo");
                    bartan++;
                }
//                System.out.println("m="+m);
                m--;
                count++;
//                System.out.println("m="+m);

            }
            if(a1.get(j)==2)
            {
                if(k!=0)
                {
//                    System.out.println("k="+k);
                    k--;
                    count++;
//                    System.out.println("k="+k);

                }
                else {
                    if(m<=0)
                    {
//                        System.out.println("bartan dhooo");
                        bartan++;

                    }
//                    System.out.println("m="+m);
                    m--;
                    count++;
//                    System.out.println("m="+m);

                }
            }
            if(m==-1 || k==-1)
            {
                flag=1;

            }


        }
//
        System.out.println(bartan);

    }
}
