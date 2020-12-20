import java.util.*;
public class arrayof0 {
    /*Check if all elements of the given array can be made 0 by decrementing value in pairs
        
        Given an array arr[] consisting of positive integers, the task is to check if all elements of the given array can be made 0 by performing the following operation:

        Choose two indices i and j such that i != j and subtract 1 from both arr[i] and arr[j]
        The above operation can be performed any number of times*/
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        //System.out.println(Check(arr[i],n));
        check(a,n);
    }
    static void check(int[] a,int n){
        int max=a[0];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            if(a[i]>max){
                max=a[i];
            }
        }
        if(sum%2==1||max>sum-max||n==1)
        {
            System.out.println("No");
        }
        else{
        System.out.println("yes");
        }
    }
}
