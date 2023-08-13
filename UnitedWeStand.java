package CodeForces;
import java.util.*;
public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
            ArrayList<Integer> a1=new ArrayList<>();
            ArrayList<Integer> a2=new ArrayList<>();
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                a1.add(sc.nextInt());
            }
            Collections.sort(a1);

            int max,index1,index2;
            max=a1.get(n-1);
            index1=a1.indexOf(max);
            index2=a1.lastIndexOf(max);
//            System.out.println(a1);
//            System.out.println("indexes are:= "+index1+" "+index2);

            int loop=index2-index1+1;
            for(int i=1;i<=loop;i++)
            {
                a2.add(a1.get(a1.size()-1));
                a1.remove(a1.size()-1);
              //  System.out.println(a1);
            }

//            System.out.println(a1);
//            System.out.println(a2);

            //PRINTING THE OUTPUT

            if(a1.size()==0 || a2.size()==0)
            {
                System.out.println("-1");
            }
            else{
                System.out.println(a1.size()+" "+a2.size());
                for(int i=0;i<a1.size();i++)
                {
                    System.out.print(a1.get(i)+" ");
                }
                System.out.println();
                for(int i=0;i<a2.size();i++)
                {
                    System.out.print(a2.get(i)+" ");
                }
                System.out.println();
            }

        }
    }
}
