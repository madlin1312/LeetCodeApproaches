class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        int n=numBottles;
        while(n>=numExchange){
            sum+=n/numExchange;
            int rem=n%numExchange;
            n=n/numExchange;
            n=n+(rem);
        }return sum;
    }
}