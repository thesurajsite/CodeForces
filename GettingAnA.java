package CodeForces;
import java.util.*;
public class GettingAnA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        int n=sc.nextInt();
        int sum=0,count=0;
        double need=0,sum2,diff;
        for(int i=0;i<n;i++)
        {
            a1.add(sc.nextInt());
            sum=sum+a1.get(i);
        }
        Collections.sort(a1);

//        System.out.println(a1); /////////

        sum2=(4.5)*n;
        diff=sum2-(double)sum;

//        System.out.println("sum1= "+sum);
//        System.out.println("sum2= "+sum2);
//        System.out.println("diff= "+diff);

        need=0;
        if(sum2>sum) {
            for (int j = 0; j < n; j++) {
                count++;
                need = need + (5 - a1.get(j));
                if (need >= diff)
                    break;
            }
        }
        System.out.println(count);

    }
}
