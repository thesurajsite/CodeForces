package CodeForces;
import java.util.Scanner;
public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) {
            num[i] = sc.nextInt();
        }
        int i=0,flag=0;
        long sum=0,money=0;
        int n1=1;
        int n2=num[i];
        while(1<2){
            if(n1<=n2){
                money=n2-n1;
                sum=sum+money;
                flag++;
                //System.out.println(sum);
                n1=n2;
                i++;
                if(flag>=m){
                    break;
                }
                n2=num[i];
            }
            else if(n1>n2)
            {
                money=n-(n1-n2);
                sum=sum+money;
                flag++;
               // System.out.println(sum);
                n1=n2;
                i++;
                if(flag>=m){
                    break;
                }
                n2=num[i];
            }

        }
        System.out.println(sum);
    }
}
