package CodeForces;
import java.sql.SQLOutput;
import java.util.*;
public class TilesComeback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a1 = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int abc = sc.nextInt();
                a1.add(abc);

            }
         //   System.out.println(a1);

            int num1,num2;
            num1=a1.get(0);
            num2=a1.get(n-1);
            int count1=0,count2=0;
          for(int i=0;i<n;i++){
              if(a1.get(i)==num1)
              {
                  count1++;
              }
              if(a1.get(i)==num2 && count1>=k)
              {
                  count2++;
              }
              if(num1==num2){
                  count2=count1;
              }

          }

          if(count1>=k && count2>=k){
              System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }



        }
    }
}
