class Solution {
    public int[] sortArray(int[] nums){
        mergeSort(nums);
        return nums;
    }
    public void mergeSort(int[] nums){
        int n = nums.length;
        if(n==1) return ;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int ind = 0;
        for(int i=0; i<a.length; i++){
            a[i] = nums[ind++];
        } 
        for(int j=0; j<b.length; j++){
            b[j] = nums[ind++];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a, b, nums);
    }
    public void merge(int[] a, int[] b, int[] c){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k] = a[i];
                k++;
                i++;
            }
            else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            c[k] = a[i];
            k++;
            i++;
        }
        while(j<b.length){
            c[k] = b[j];
            k++;
            j++;
        }
    }
}