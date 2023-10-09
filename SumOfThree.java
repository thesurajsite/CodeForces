package CodeForces;
import java.util.Scanner;
public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int valid = n - 3;
            if (valid > 2 && valid % 3 != 0) {
                System.out.println("YES");
                System.out.println("1 2 " + valid);
            }
            else {
                valid=n-5;
                if (valid > 1 && valid != 4 && valid % 3 != 0) {
                    System.out.println("YES");
                    System.out.println("1 4 " + valid);
                } else {
                    System.out.println("NO");
                }
            }
        }
        //
    }
}
