package CodeForces;
import java.util.*;
public class NotePad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t,n;
        String s="", s2="";
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            n=sc.nextInt();
            s=sc.next();

            HashSet<String> hs=new HashSet<>();
            HashSet<String> hs2=new HashSet<>();
            for(int j=0;j<n-1;j++){
                hs.add(s.substring(j,j+2));
//                System.out.println(s.substring(j,j+2)+" added");
            }
//            System.out.println(hs);

            for(int j=0;j<n-2;j++){
                if(s.charAt(j)==s.charAt(j+1) && s.charAt(j+1)==s.charAt(j+2)){
                    hs2.add(s.substring(j,j+3));
                   // System.out.println(s.substring(j,j+3));
                }
            }

//            System.out.println(hs.size());
            if(hs.size()<n-1-hs2.size()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            hs.clear();
        }
    }
}
