package CodeForces;
import java.util.*;
public class MorningSandwich {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int b,c,h,fill=0;
            b=sc.nextInt();
            c=sc.nextInt();
            h=sc.nextInt();
            fill=c+h;

            if(b>=2 && c>=1){
                if(fill>=b){
                    System.out.println(b+(b-1));
                }
                else{
                    System.out.println(fill+(fill+1));
                }
            }
            else{
                System.out.println("0");
            }



        }

    }
}
