package CodeForces;
import java.util.*;
public class TenWordsOfWisdom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
           // ArrayList<Integer> a1=new ArrayList<>();
            int n=sc.nextInt();
            int quality=0,temp=0,index=0;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                if(num<=10){
                    quality=sc.nextInt();
                    if(quality>temp){
                        temp=quality;
                        index=i;
                    }
                }
                else{
                    int garbage=sc.nextInt();
                }

            }
            System.out.println(index+1);

        }
    }
}
