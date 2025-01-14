import java.util.*;

class first_last{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                System.out.println(i);
                break;
            }
        }
    }
}