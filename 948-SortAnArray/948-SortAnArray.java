// Last updated: 6/16/2026, 8:51:42 AM
class Solution {
    public int[] mergesort(int arr[],int start,int end){
        if(start==end){
            int ans[]=new int[1];
            ans[0]=arr[start];
            return ans;
        }
        int mid=(start+end)/2;
        int []x=mergesort(arr,start,mid);
        int []y=mergesort(arr,mid+1,end);

        return marge(x,y);
    }

    public static int[] marge(int arr1[],int arr2[]) {
        int n=arr1.length;
        int m=arr2.length;
        int ans[]=new int[n+m];
        int i=0,j=0,k=0;
        while (i<n && j<m) {
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while (i<n) {
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while (j<m) {
            ans[k]=arr2[j];
            k++;
            j++;
        }
        return ans;
    }
    public int[] sortArray(int[] nums) {
        int a[]=mergesort(nums,0,nums.length-1);
        return a;
    }
}