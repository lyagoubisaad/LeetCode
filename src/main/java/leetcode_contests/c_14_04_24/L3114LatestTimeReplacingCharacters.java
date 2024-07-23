package leetcode_contests.c_14_04_24;

public class L3114LatestTimeReplacingCharacters {

    public String findLatestTime(String s) {
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(0) == '?') {
            if(sb.charAt(1) == '?' || sb.charAt(1) - '0' < 2) {
                sb.replace(0,1,"1");
            } else sb.replace(0,1,"0");
        }
        if(sb.charAt(1) == '?') {
            if(sb.charAt(0) == '0') {
                sb.replace(1,2,"9");
            } else {
                sb.replace(1,2,"1");
            }
        }
        if(sb.charAt(3) == '?') sb.replace(3,4, "5");
        if(sb.charAt(4) == '?') sb.replace(4,5, "9");
        return sb.toString();
    }

}
