package leetcode_categories.string;

public class L_168_ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int a = columnNumber;
        char a1, b1;
        while (a>26) {
            a = a/26;
        }
        a1 = (char) (a+64);
        sb.append(a1);
        int b = columnNumber%26;
        b1 = (char) (b+64);
        sb.append(b1);
        return sb.toString();
    }

    public static void main(String[] args) {
        convertToTitle(701);
    }
}
