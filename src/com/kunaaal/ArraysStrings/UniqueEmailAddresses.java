package com.kunaaal.ArraysStrings;

import java.util.HashSet;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String [] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            String [] divide = email.split("@");
            String local = divide[0];
            String str = "";

            for (int j = 0; j < local.length(); j++) {
                if (local.charAt(j) == '.'){
                    continue;
                } else if (local.charAt(j) == '+'){
                    break;
                } else {
                    str += local.charAt(j);
                }
            }

            str += "@" + divide[1];

            set.add(str);

        }

        return set.size();

    }
}
