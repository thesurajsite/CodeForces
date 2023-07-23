package CodeForces;
import java.util.*;
public class DrazilAndDate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a,b,steps;
        a=sc.nextLong();
        b=sc.nextLong();
        steps=sc.nextLong();

        long distance=Math.abs(a)+Math.abs(b);

        if(steps<distance){
            System.out.println("No");
        }
        else if(steps==distance){
            System.out.println("Yes");
        }
        else{
            if((steps-distance)%2==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
