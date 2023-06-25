package CodeForces;
import java.util.*;
public class Stages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        String st=sc.next();
        ArrayList<Character> a1=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a1.add(st.charAt(i));
        }
       // System.out.println(a1);
        Collections.sort(a1);
      //  System.out.println(a1);
        int sum=0;

        //System.out.println(a1.get(0));
        char temp=a1.get(0);
        sum=sum+ (int)(a1.get(0)-96);
        //System.out.println(sum);


        int counter=1;
        if(counter<k) {
            for (int i = 1; i < n; i++) {
                if (a1.get(i) - temp >= 2) {
                    //      System.out.println(a1.get(i));
                    sum = sum + (int) (a1.get(i) - 96);
                    //    System.out.println(sum);
                    counter++;
                    temp = a1.get(i);
                    if (counter == k) {
                        break;
                    }
                }

            }
        }
//        System.out.println("conter="+counter);
//        System.out.println("sum="+sum);

        if(counter ==k)
        {
            System.out.println(sum);
        }
        else System.out.println("-1");
        //System.out.println(sum);
    }
}
