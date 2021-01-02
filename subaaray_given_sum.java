import java.util.*;
public class subaaray_given_sum {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum=s.nextInt();
        s.close();

        int sum1=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(sum1<sum){
                    sum1=sum1+a[j];
                }
                if(sum1==sum){
                    System.out.println("yes sum exsists between "+i+" and "+j);
                    break;
                }
            }
            sum1=0;
        }
    }
}
