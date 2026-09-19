class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0;
        count += numBottles;
        while(numBottles >= numExchange){
            int temp = numBottles / numExchange;
            int rem = numBottles % numExchange;
            count += temp;
            numBottles /= numExchange;
            numBottles += rem;
        }
        return  count;
    }
}