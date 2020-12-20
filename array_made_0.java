/*Check if given array can be made 0 with given operations performed any number of times

Given an array arr[] containing N integers, the task is to find whether all the elements of the given array can be made 0 by following operations:

Increment any element by 2.
Subtract the minimum element of the array from all elements in the array.
The above operations can be performed any number times.*/

import java.util.*;
class array_made_of_0{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        check(a,n);
    }
    static void check(int a[],int n){
        int odd=0,even=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else{
                odd++;
            }
        }
        if(odd==n||even==n)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

























