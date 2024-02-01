package LeetCodeCategories.Math_Geometry;

public class L_2028_FindMissingObservations {
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int totalMean = mean * (rolls.length+n);
        int[] result = new int[n];
        for (int i=0;i<rolls.length;i++) {
            totalMean -= rolls[i];
        }
        if(totalMean < n || totalMean > n*6) return new int[] {};
        for (int i=0;i<n;i++) {
            if(totalMean > (n-i)*5) {
                result[i] = 6;
                totalMean-=result[i]; continue;
            }
            if(totalMean > (n-i)*4) {
                result[i] = 5;
                totalMean-=result[i]; continue;
            }

            if(totalMean > (n-i)*3) {
                result[i] = 4;
                totalMean-=result[i]; continue;
            }

            if(totalMean > (n-i)*2) {
                result[i] = 3;
                totalMean-=result[i]; continue;
            }
            if(totalMean > (n-i)) {
                result[i] = 2;
                totalMean-=result[i]; continue;
            }
            result[i] = 1;
            totalMean-=result[i];
        }
        return result;
    }
}
