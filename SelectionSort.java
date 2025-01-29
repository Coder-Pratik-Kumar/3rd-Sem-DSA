// import java.util.*;
// class SelectionSort{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int[] arr= new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println(Arrays.toString(arr));

//         for(int i=0;i<arr.length-1;i++){
//             int min=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             }
//             if(min!=i){
//             int temp=arr[i];
//             arr[i]=arr[min];
//             arr[min]=temp;
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

import java.util.Arrays;

class Selction{
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[start]){
                    start=j;
                }
                int temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}