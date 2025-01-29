import java.util.*;
class PrintNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        print(n);
    }

    public static void print(int n){
        if(n>0){        
        print(n-1);
        System.out.println(n);
        }
        
    }
}  