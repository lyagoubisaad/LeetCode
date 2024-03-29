package leetcode_categories.arrays_hashings;

import java.util.HashMap;

public class L_1396_DesignUndergroundSystem {
    HashMap<Integer, String> checkInOut = new HashMap<>();
    HashMap<String, Integer> storeNbrTimes = new HashMap<>();
    HashMap<String, Integer> storeTotTimes = new HashMap<>();

    public L_1396_DesignUndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        checkInOut.put(id, stationName + "," + t);
    }

    public void checkOut(int id, String stationName, int t) {
        String info = checkInOut.get(id);
        String first = info.split(",")[0];
        t -= Integer.parseInt(info.split(",")[1]);
        checkInOut.remove(id);
        storeNbrTimes.put(first+"+"+stationName, storeNbrTimes.getOrDefault(first+"+"+stationName, 0)+1);
        storeTotTimes.put(first+"+"+stationName, storeTotTimes.getOrDefault(first+"+"+stationName, 0)+t);
    }

    public double getAverageTime(String startStation, String endStation) {
        return (double) storeTotTimes.get(startStation+"+"+endStation)/storeNbrTimes.get(startStation+"+"+endStation);
    }
}
