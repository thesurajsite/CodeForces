package CodeForces;
import java.util.*;
public class CircleOfStudents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            int n=sc.nextInt();
            int []num=new int[n];
            for (int i=0;i<n;i++){
                num[i]=sc.nextInt();
            }
            int flag=0;
            for(int i=0;i<n-1;i++){
                int diff=num[i]-num[i+1];
                if(diff==1 || diff==-1){
                    // Do nothing
                }
                else if((diff==n-1 || diff==-(n-1)) && (num[i]==1 || num[i+1]==1) ){
                    // Do nothing
                }
                else{
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
