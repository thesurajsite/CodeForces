package CodeForces;
import java.util.*;
public class DaltonTheTeacher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int count=0;
            for(int j=1;j<=n;j++){
                int num=sc.nextInt();
                if(num==j){
                    count++;
                    //System.out.println("count = j");
                }
            }
           // System.out.println("count= "+count);
            if(count%2==0){
                System.out.println(count/2);
            }
            else{
                System.out.println((count+1)/2);
            }
        }
    }
}
