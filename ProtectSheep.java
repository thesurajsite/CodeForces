package CodeForces;
import java.util.*;
public class ProtectSheep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c,n,flag=0;
        String st=" ";
        r=sc.nextInt();
        c=sc.nextInt();
        char [][]ch=new char[r][c];
        char [][]arr=new char[r+2][c+2];

        for(int i=0;i<r;i++)
        {
            st=sc.next();
            for(int j=0;j<c;j++)
            {
                ch[i][j]=st.charAt(j);
            }
        }
       // System.out.println("done");

        for(int i=0;i<r+2;i++)
        {
            for(int j=0;j<c+2;j++)
            {
                if(i!=0 && j!=0 && i!=r+1 && j!=c+1)
                {
                    if(ch[i-1][j-1]=='.')
                    {
                        arr[i][j]='D';
                    }else {
                        arr[i][j] = ch[i - 1][j - 1];
                    }
                }
                else{
                    arr[i][j]='D';
                }
            }
        }


        for(int i=1;i<r+1;i++)
        {
            for(int j=1;j<c+1;j++)
            {
                if(arr[i][j]=='S') {
                    if (arr[i - 1][j] == 'W' || arr[i + 1][j] == 'W' || arr[i][j - 1] == 'W' || arr[i][j + 1] == 'W') {
                        flag = 1;
                        //System.out.println("flag incremented at i, j= " + i + " " + j);
                        break;
                    }
                }
            }

        }
        if(flag==0)
        {
            System.out.println("Yes");

            for(int i=1;i<r+1;i++)
            {
                for(int j=1;j<c+1;j++)
                {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("No");
        }


    }
}
