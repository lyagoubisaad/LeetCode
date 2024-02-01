package LeetCodeCategories.String;

public class L_38_CountAndSay {
    public static String countAndSay(int n) {
        String input = "1";
        for (int i=1;i<n;i++) {
            input = calc(input);
        }
        return input;
    }

    public static String calc(String input) {
        StringBuilder sb = new StringBuilder();
        char[] tab_input = input.toCharArray();
        int cpt_occ=0;
        for (int i=0;i<tab_input.length;i++) {
            while (tab_input[i] == tab_input[i+cpt_occ]) {
                cpt_occ++;
                if(i+cpt_occ == tab_input.length ) break;
            }
            sb.append(cpt_occ);
            sb.append(tab_input[i]);
            i = i+cpt_occ-1;
            cpt_occ = 0;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
