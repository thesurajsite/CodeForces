package CodeForces;
import java.util.*;
public class DigitsSequenceDividing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n,flag=0;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            String st,s1="",s2="";
            st=sc.next();
            if(n==2)
            {
//                System.out.println(st.charAt(0));
//                System.out.println(st.charAt(1));
//                if(st.charAt(0)<st.charAt(1))
//                    System.out.println("yes");

                if(st.charAt(0)<st.charAt(1))
                {
                   // System.out.println("done");
                    s1=st.substring(0,1);
                    s2=st.substring(1,2);
                   // System.out.println(flag);
                }
                else
                {
                //    System.out.println("flag=1");
                    flag=1;
                }
            }
            if(n%2==0 && n!=2)
            {
                s1=st.substring(0,(n/2)-1);
                s2=st.substring((n/2)-1,n);
            }
            if(n%2!=0)
            {
                s1=st.substring(0,(n/2));
                s2=st.substring((n/2),n);
            }
           if(flag==1)
           {
               System.out.println("NO");
               flag=0;
           }
           else{
               System.out.println("YES");
               System.out.println("2");
               System.out.print(s1+" "+s2);
               System.out.println();
               flag=0;
           }


        }

    }
}
