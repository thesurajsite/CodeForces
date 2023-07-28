package CodeForces;
import java.util.*;
public class WordOnThePaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            for(int i=1;i<=8;i++){
                String s=sc.next();
                for(int j=0;j<8;j++){
                    if(s.charAt(j)!='.'){
                        System.out.print(s.charAt(j));
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
