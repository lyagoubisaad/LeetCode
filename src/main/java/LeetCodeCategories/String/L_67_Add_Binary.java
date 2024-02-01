package LeetCodeCategories.String;

public class L_67_Add_Binary {
    public static String addBinary(String a, String b) {
        String s ="";
        String first = "";
        String second = "";
        int retenu = 0;
        if(a.length() > b.length()) {
            first = a.substring(0,a.length()-b.length());
            second =  a.substring(a.length()-b.length(), a.length());
            s = addBoth(second,b);
            if(s.charAt(0) == '0') retenu = 0; else retenu = 1;
            s = s.substring(1,s.length());
            if (retenu == 0) {
                s = first + s;
            } else {
                for(int i=first.length()-1;i>=0;i--) {
                    if(first.charAt(i) == '1' && retenu == 1) {
                        s = "0" + s;
                        retenu = 1;
                    } else if(first.charAt(i) == '0' && retenu == 0){
                        s = "0" + s;
                        retenu = 0;
                    } else{
                        s = "1" + s;
                        retenu = 0;
                    }
                }
            }
        }
        else if(b.length() > a.length()) {
            first = b.substring(0,b.length()-a.length());
            second =  b.substring(b.length()-a.length(), b.length());
            s = addBoth(second,a);
            if(s.charAt(0) == '0') retenu = 0; else retenu = 1;
            s = s.substring(1,s.length());
            if (retenu == 0) {
                s = first + s;
            } else {
                for(int i=first.length()-1;i>=0;i--) {
                    if(first.charAt(i) == '1' && retenu == 1) {
                        s = "0" + s;
                        retenu = 1;
                    } else if(first.charAt(i) == '0' && retenu == 0){
                        s = "0" + s;
                        retenu = 0;
                    } else{
                        s = "1" + s;
                        retenu = 0;
                    }
                }
            }
        } else {
            s = addBoth(a,b);
            if(s.charAt(0) == '0') retenu = 0; else retenu = 1;
            s = s.substring(1,s.length());
        }
        if(retenu == 1) s = '1' + s;
        return s;
    }

    public static String addBoth(String a, String b) {
        String s = "";
        int retenu = 0;
        for(int i=b.length()-1;i>=0;i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (retenu == 0) s = "0" + s; else s = "1" + s;
                retenu = 1;
            } else if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (retenu == 0) s = "0" + s; else s = "1" + s;
                retenu = 0;
            } else {
                if(retenu == 1 ) {
                    s = "0" + s;
                } else {
                    s = "1" + s;
                }
            }
        }
        s = retenu + s;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("101111", "10"));
    }
}
