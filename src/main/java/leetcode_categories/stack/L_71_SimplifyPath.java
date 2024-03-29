package leetcode_categories.stack;

public class L_71_SimplifyPath {
    public static String simplifyPath(String path) {
        StringBuilder res = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for (int i=0;i<path.length();i++) {
            if(path.charAt(i) == '/') {
                int j=i+1;
                while (j<path.length() && path.charAt(j) != '/') j++;
                tmp.append(path, i+1, j);
                i=j-1;
                if(tmp.length() !=0 ) canonical(res, tmp);
                tmp.setLength(0);
            }
        }
        if(res.length() != 0) res.deleteCharAt(res.length()-1);
        res.insert(0, '/');
        return res.toString();
    }

    private static void canonical(StringBuilder res, StringBuilder tmp) {
        if(tmp.toString().equals(".")) return;
        if(tmp.toString().equals("..")) {
            if(res.length() > 1) {
                res.deleteCharAt(res.length()-1);
                while (res.length()> 0 && res.charAt(res.length()-1) != '/') res.deleteCharAt(res.length()-1);
            }
            return;
        }
        res.append(tmp);
        res.append("/");
    }
}
