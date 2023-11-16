package org.example;

import java.util.Scanner;

public class Main {

    public static int[] getAlphabatCount(String str) {
        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++)
            count[str.charAt(i) - 'a']++;

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] countA = getAlphabatCount(a);      // bread [ 1, 1, 0, 1, 1, .. ]
        int[] countB = getAlphabatCount(b);      // dared [ 1, 0, 0, 2, 1, .. ]
        int ans = 0;

        for(int i = 0; i < 26; i ++) {
            ans += Math.abs(countA[i] - countB[i]);
        }

        System.out.println(ans);

    }

}