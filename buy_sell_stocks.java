
class Buy{
    public static void main(String[] args) {
        int prices[]= new int[]{7,6,5,4,3,2};
       int result= maxProfit(prices);
       System.out.println(result);
    }
    public static int maxProfit(int[] prices){
        int maxProfit=0;
        int mini=prices[0];

        for(int ele:prices){
            int curProfit=ele-mini;
            maxProfit=Math.max(curProfit,maxProfit);
            mini=Math.min(mini,ele);
        }
        return maxProfit;
    }
}