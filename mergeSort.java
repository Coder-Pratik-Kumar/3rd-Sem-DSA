import java.util.Arrays;

class MergeSort{
    public static void main(String[] args) {
        int[] arr= {5,4,2,15,8,7,5};

        divide(arr,0,arr.length-1);
    }
    public static void divide(int[] arr, int low, int high){

        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);

        merge(arr,low,mid,high);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int[] arr,int low, int mid, int high){
        int [] ans= new int[high-low+1];

        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }else{
                ans[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high){
            ans[k]=arr[j];
            j++;
            k++;
        }
        for(int element=0;element<ans.length;element++){
            arr[low]=ans[element];
            low++;
        }

    }
}