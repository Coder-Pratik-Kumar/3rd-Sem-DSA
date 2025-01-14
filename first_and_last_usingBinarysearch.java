import java.util.*;
class FirstAndLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.out.println(Arrays.toString(arr));
         int target=sc.nextInt();
         int first=FirstOccurance(arr,target);
         int second=SecondOccurance(arr,target);
         System.out.println("First Occurance:= "+first);
         System.out.println("Second Occurance:- "+second);
    }
    public static int FirstOccurance(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
    public static int SecondOccurance(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==target){
                result=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
}