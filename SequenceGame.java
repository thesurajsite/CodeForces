package CodeForces;
import java.util.*;
public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n = sc.nextInt();
            int[] num = new int[n];
            ArrayList<Integer> a1=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }

            for (int i = 1; i < n; i++) {
                if (num[i - 1] <= num[i]) {
                    a1.add(num[i-1]);
                   // System.out.print(num[i - 1] + " ");
                } else {
                    a1.add(num[i-1]);
                    a1.add(num[i]);
                   // System.out.print(num[i - 1] + " " + num[i] + " ");
                }

            }
            a1.add(num[n-1]);
          //  System.out.print(num[n - 1]+" ");

            System.out.println(a1.size());
            for(int j=0;j<a1.size();j++)
            {
                System.out.print(a1.get(j)+" ");
            }
            System.out.println();

        }



     //   System.out.println();
    }
}
