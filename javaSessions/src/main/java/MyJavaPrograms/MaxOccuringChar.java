package MyJavaPrograms;

import java.util.HashMap;

public class MaxOccuringChar {
    public static void main(String[] args) {
        String str = "Welcome in Java";
        getMaxOccurringChar(str);
        System.out.println(getMaxOccurringChar(str));
    }

    public static char getMaxOccurringChar(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        //to store length of string
        int n = str.length();
        System.out.println(n);
        char ans = 0;
        int snt = 0;
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
            if (snt < mp.get(c)) {
                ans = c;
                snt = mp.get(c);

            }

        }
        return ans;
    }




}
