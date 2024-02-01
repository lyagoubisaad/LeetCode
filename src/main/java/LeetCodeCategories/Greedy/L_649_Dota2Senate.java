package LeetCodeCategories.Greedy;

public class L_649_Dota2Senate {
    public static String predictPartyVictory(String senate) {
        int slayR = 0;
        int slayD = 0;
        StringBuilder sb = new StringBuilder(senate);
        int i=0;
        boolean seenR = false;
        boolean seenD = false;
        while (sb.length() > 1){
            if(i >= sb.length()) {
                if(!(seenD && seenR)) break;
                seenR = false;
                seenD = false;
                i=0;
            }
            if(sb.charAt(i) == 'R') {
                if(slayD > 0) {
                    slayD--;
                    sb.deleteCharAt(i);
                    i--;
                }
                else {
                    seenR = true;
                    slayR++;
                }
            } else {
                if(slayR > 0) {
                    slayR--;
                    sb.deleteCharAt(i);
                    i--;
                }
                else {
                    seenD = true;
                    slayD++;
                }
            }
            i++;
        }
        return sb.charAt(0) == 'R' ? "Radiant": "Dire";
    }
}
