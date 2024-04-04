package leetcode_contests.c_31_03_24;

public class L_100235_WaterBottlesII {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottleDrunk = 0;
        int emptyBottles = 0;
        while (numBottles > 0) {
            bottleDrunk += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;
            while (emptyBottles >= numExchange) {
                emptyBottles -= numExchange;
                numExchange++;
                numBottles++;
            }
        }
        return bottleDrunk;
    }
}
