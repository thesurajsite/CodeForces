package CodeForces;
import java.util.*;
public class VikaAndHerFriends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++){
            int a,b,k;
            a=sc.nextInt();
            b=sc.nextInt();
            k=sc.nextInt();
            int [][]num=new int[k+1][2];
            for(int i=0;i<k+1;i++){
                for(int j=0;j<2;j++){
                    num[i][j]=sc.nextInt();
                }
            }

//            for(int i=0;i<k+1;i++){
//                for(int j=0;j<2;j++){
//                    System.out.print(num[i][j]);
//                }
//                System.out.println();
//            }

            int flag=0;
            for(int i=1;i<k+1;i++){
                int diff1=Math.abs(num[i][0]-num[0][0]);
                int diff2=Math.abs(num[i][1]-num[0][1]);
                int dis=diff1+diff2;
//                System.out.println(diff1+" "+diff2);
                if(dis%2==0){
                    flag=1;
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
