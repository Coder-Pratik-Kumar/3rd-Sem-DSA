class Main{
    public static void main(String[] args) {
        int n=3;
        Generatepare(n,0,0,"");
    }
    public static void Generatepare(int n, int op, int cl, String ans){
        if(op==n && cl==n){
            System.out.println(ans);
            return;
        }
        if(op<n){
            Generatepare(n, op+1, cl, ans+"(");
        }
        if(op>cl){
            Generatepare(n, op, cl+1, ans+")");
        }
    }
}