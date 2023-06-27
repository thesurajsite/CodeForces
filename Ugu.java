package CodeForces;
import java.util.*;
public class Ugu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++) {
            int n = sc.nextInt();
            String st = sc.next();
            int count = 1;
            for (int i = 0; i < n - 1; i++) {
                if (st.charAt(i) != st.charAt(i + 1)) {
                    count++;

                }
            }
           // System.out.println(count);
//            if(st.charAt(0)=='1')
//                System.out.println(count-1);
            if(st.charAt(0)=='0' && (count-2)!=-1)
                System.out.println(count-2);
            else System.out.println(count-1);
        }

    }
}
