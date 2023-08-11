package CodeForces;
import java.util.*;
public class Destroyer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++) {
            int n = sc.nextInt();
            ArrayList<Integer> a1 = new ArrayList<>();
            ArrayList<Integer> a2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a1.add(sc.nextInt());
            }

            Collections.sort(a1);
            int max = a1.get(n - 1);

            for (int i = 0; i <= max; i++) {
                int index1 = a1.indexOf(i);
                int index2 = a1.lastIndexOf(i);
                int diff = 0;
                if (index1 != -1) {
                    diff = index2 - index1 + 1;
                } else {
                    diff = 0;
                }
                a2.add(diff);
                // System.out.println(diff);
            }
            int flag = 0;
            for (int i = 1; i < a2.size(); i++) {

                if (a2.get(i) > a2.get(i - 1)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
