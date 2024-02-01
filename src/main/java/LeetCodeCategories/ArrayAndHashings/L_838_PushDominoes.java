package LeetCodeCategories.ArrayAndHashings;

public class L_838_PushDominoes {
    int[][] values;
    public String pushDominoes(String dominoes) {
        values = new int[dominoes.length()][2];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < 2; j++) {
                values[i][j] = 0;
            }
        }
        StringBuilder sb = new StringBuilder(dominoes);
        for (int i=0;i<sb.length();i++) {
            if(sb.charAt(i) == 'L') {
                turnInto(i, 'L', sb);
            } else if(sb.charAt(i) == 'R') {
                turnInto(i, 'R', sb);
            }
        }
        for (int i=0;i<sb.length();i++) {
            if(sb.charAt(i) == '.') {
                if(values[i][0] == 1) sb.setCharAt(i, 'L');
                else if(values[i][0] == 2) sb.setCharAt(i, 'R');
            }
        }
         return sb.toString();
    }

    private void turnInto(int i, char l, StringBuilder sb) {
        int cpt = 1;
        if(l == 'L') {
            i--;
            while (i >=0 && sb.charAt(i) == '.') {
                if(this.values[i][0] == 2) {
                    if(this.values[i][1] < cpt) break;
                    if(this.values[i][1] == cpt) {
                        this.values[i][1] = 0;
                        this.values[i][0] = 0;
                        break;
                    }
                }
                this.values[i][0] = 1;
                this.values[i][1] = cpt;
                i--;
                cpt ++;
            }
        }
        if(l == 'R') {
            i++;
            while (i <sb.length() && sb.charAt(i) == '.') {
                if(this.values[i][0] == 1) {
                    if(this.values[i][1] < cpt) break;
                    if(this.values[i][1] == cpt) {
                        this.values[i][1] = 0;
                        this.values[i][0] = 0;
                        break;
                    }
                    this.values[i][0] = 2;
                    this.values[i][1] = cpt;
                }
                this.values[i][0] = 2;
                this.values[i][1] = cpt;
                i++;
                cpt ++;
            }
        }
    }
    public static void main(String[] args) {
        new L_838_PushDominoes().pushDominoes(".L.R...LR..L..");
    }
}
