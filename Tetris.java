package CodeForces;
import java.util.*;
public class Tetris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m,flag=0,num=0;
        n = sc.nextInt();
        m = sc.nextInt();
//        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            count.add(0);
        }
        for (int i = 0; i < m; i++) {
            num=sc.nextInt();
//            a1.add(num);
            count.set(num-1,count.get(num-1)+1);
//            if(count.contains(n+1)){
//                break;                     // SIZE LIMIT OF BOX IS NOT REQUIRED HERE
//            }
//            System.out.println(count);
            if(!count.contains(0)){
                flag++;
                for(int j=0;j<n;j++){
                    count.set(j,count.get(j)-1);
                }
//                System.out.println(count);
//                System.out.println("flag= "+flag);
            }
        }
        System.out.println(flag);

    }
}

