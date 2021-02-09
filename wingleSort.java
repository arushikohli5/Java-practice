class Solution {
    public void wiggleSort(int[] a) {
        /*
        //if i is odd(a[i]>a[i-1]&&a[i]>a[i+1]);
        //if(a[i] is even (a[i]<a[i-1]&&a[i]<a[i+1]))
        int n=a.length;
        if(n==2){
            if(a[0]>a[1]){
                int temp=a[0];
                a[0]=a[1];
                a[1]=temp;
            }
        }
        for(int i=1;i<n-1;i++){
            if(i%2==0){
                while(a[i]>a[i+1]||a[i]>a[i-1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            if(i%2!=0){
                while(a[i]<a[i+1]||a[i]<a[i-1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }*/
        Arrays.sort(a);
        int n=a.length;
        int mid=(n-1)/2;
        int x=mid;
        int end=n-1;
        int result[]=new int[n];
        int i=0;
        while(mid>=0||end>x){
            if(i%2==0){
                result[i]=a[mid];
                mid--;
            }
            else{
                result[i]=a[end];
                end--;
            }
             i++;
        }
        
        for(i=0;i<n;i++){
            a[i]=result[i];
        }
      
        
    }
}
