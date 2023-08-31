package CodeForces;
import java.util.*;
public class PrimeDeletion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int num = sc.nextInt();
            int temp = num;
            ArrayList<Integer> a1 = new ArrayList<>();

            while (temp > 0) {
                int rem = temp % 10;
                a1.add(rem);
                temp = temp / 10;

            }

           // System.out.println(a1);

            if (a1.indexOf(1) > a1.indexOf(3)) {
                System.out.println(13);
            } else if (a1.indexOf(1) > a1.indexOf(7)) {
                System.out.println(17);
            } else if (a1.indexOf(1) > a1.indexOf(9)) {
                System.out.println(19);
            } else if (a1.indexOf(2) > a1.indexOf(3)) {
                System.out.println(23);
            } else if (a1.indexOf(2) > a1.indexOf(9)) {
                System.out.println(29);
            } else if (a1.indexOf(3) > a1.indexOf(1)) {
                System.out.println(31);
            } else if (a1.indexOf(3) > a1.indexOf(7)) {
                System.out.println(37);
            } else if (a1.indexOf(4) > a1.indexOf(1)) {
                System.out.println(41);
            } else if (a1.indexOf(4) > a1.indexOf(3)) {
                System.out.println(43);
            } else if (a1.indexOf(4) > a1.indexOf(7)) {
                System.out.println(47);
            } else if (a1.indexOf(5) > a1.indexOf(3)) {
                System.out.println(53);
            } else if (a1.indexOf(5) > a1.indexOf(9)) {
                System.out.println(59);
            } else if (a1.indexOf(6) > a1.indexOf(1)) {
                System.out.println(61);
            } else if (a1.indexOf(6) > a1.indexOf(7)) {
                System.out.println(67);
            } else if (a1.indexOf(7) > a1.indexOf(1)) {
                System.out.println(71);
            } else if (a1.indexOf(7) > a1.indexOf(3)) {
                System.out.println(73);
            } else if (a1.indexOf(7) > a1.indexOf(9)) {
                System.out.println(79);
            } else if (a1.indexOf(8) > a1.indexOf(3)) {
                System.out.println(83);
            } else if (a1.indexOf(8) > a1.indexOf(9)) {
                System.out.println(89);
            } else if (a1.indexOf(9) > a1.indexOf(7)) {
                System.out.println(97);
            } else {
                System.out.println(-1);
            }
        }




    }
}
