package CodeForces;
import java.util.*;
public class EscalatorConversations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0;z<t;z++)
        {
            int n, m, k, h, hmax, diff, counter = 0;
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            h = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = sc.nextInt();
            }

            hmax = (m - 1) * k;
            for (int i = 0; i < n; i++) {
                diff = Math.abs(h - height[i]);
                if (diff % k == 0 && diff <= hmax && diff!=0) {
                    counter++;
                    //System.out.println("Number found: " + height[i]);
                }
            }

            System.out.println(counter);

        }

    }
}
