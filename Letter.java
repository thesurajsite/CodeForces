package CodeForces;
import java.util.*;
public class Letter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> a1=new ArrayList<>();
        String []letter=new String[n];

        int flag=0,minindex=m,maxindex=0;
        for(int c=0;c<n;c++)
        {
            String line=sc.next();
            int index1=line.indexOf('*');
            int index2=line.lastIndexOf('*');
            if(index1!=-1) {
                minindex = Math.min(minindex, index1);
            }
            maxindex=Math.max(maxindex,index2);

            if(line.contains("*"))
            {
                flag=1;
            }
            if(flag==1)
            {
                a1.add(line);
            }

        }

        for(int i=a1.size()-1;i>=0;i--)
        {
            if(!a1.get(i).contains("*"))
            {
                a1.remove(i);
            }
            else{
                break;
            }
        }

//        System.out.println(minindex);
//        System.out.println(maxindex);


        for(int i=0;i<a1.size();i++)
        {
                System.out.println(a1.get(i).substring(minindex,maxindex+1));

        }




    }
}
