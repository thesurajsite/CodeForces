package CodeForces;
import java.util.*;
public class ParitySort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            ArrayList<Long> a1=new ArrayList<>();
            ArrayList<Long> a2=new ArrayList<>();

            for(int i=0;i<n;i++){
                long num=sc.nextInt();
                a1.add(num);
                a2.add(num);
            }
            int counter=0;
            Collections.sort(a2);
            for(int i=0;i<n;i++){
                if((a1.get(i)%2==0 && a2.get(i)%2==0) || (a1.get(i)%2!=0 && a2.get(i)%2!=0))
                {
                    counter++;
                }
            }

            if(counter==n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }

}
