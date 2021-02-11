class Solution {
    public int kthSmallest(int[][] m, int k) {
        int count=0,x=0;
        int r=m.length;
        int c=m[0].length;
        int a[]=new int[r*c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                /*if(count==k-1){
                    return m[i][j];
                }
                System.out.println(m[i][j]+" c"+count);
                count++;*/
                a[x]=m[i][j];
                x++;
            }
        }
        
        Arrays.sort(a);
        return a[k-1];
    }
}
