package CodeForces;
import java.util.*;
public class GiftCarpet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++) {
            int n, m;
            String s;

            n = sc.nextInt();
            m = sc.nextInt();
            char[][] num = new char[n][m];
            for (int i = 0; i < n; i++) {
                s = sc.next();
                for (int j = 0; j < m; j++) {
                    num[i][j] = s.charAt(j);
                }
            }

//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                System.out.print(num[i][j]+" ");
//            }
//            System.out.println();
//        }

            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                 //   System.out.println("running " + j + " " + i);
                    //  System.out.print(num[j][i] + " ");
                    if (num[j][i] == 'v' && count == 0) {
                     ///   System.out.println("v found");
                        count = 1;
                        break;
                        //i++;
                        //j=0;
                    }
                    if (num[j][i] == 'i' && count == 1) {
                     //   System.out.println("i found");
                        count = 2;
                        break;
//                    i++;
//                    j=0;
                    }
                    if (num[j][i] == 'k' && count == 2) {
                    //    System.out.println("k found");
                        count = 3;
                        break;
//                    i++;
//                    j=0;
                    }
                    if (num[j][i] == 'a' && count == 3) {
                     //   System.out.println("a found");
                        count = 4;
                        break;
//                    i++;
//                    j=0;
                    }


                }

            }

            if (count == 4) {
                System.out.println("YES");
            } else System.out.println("NO");
        }


    }
}
