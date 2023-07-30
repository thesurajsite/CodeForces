package CodeForces;
import java.util.*;
public class LongestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++){
            long num=sc.nextLong();
//            System.out.println(num);
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);

        }
    }
}
