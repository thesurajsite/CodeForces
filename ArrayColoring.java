package CodeForces;
import java.util.*;
public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int counter=0;
            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                int num=sc.nextInt();
                if(num%2!=0){
                    counter++;
                }
            }
            if(counter%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
