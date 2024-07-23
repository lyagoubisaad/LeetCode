package leetcode_categories.arrays_hashings;

import java.util.HashSet;

public class L929UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();
        for (String email: emails) {
            String local = email.substring(0, email.indexOf('@'));
            if(local.indexOf('+')!= -1) {
                local = local.substring(0, local.indexOf('+'));
            }
            StringBuilder input = new StringBuilder();
            for (int i=0;i<local.length();i++) {
                if(local.charAt(i) == '.') continue;
                input.append(local.charAt(i));
            }
            uniqueEmails.add(input + email.substring(email.indexOf('@')));
        }
        return uniqueEmails.size();
    }
}
