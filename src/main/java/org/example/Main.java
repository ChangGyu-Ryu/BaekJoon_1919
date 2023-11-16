package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] countA = new int[26]; // bread [ 1, 1, 0, 1, 1, .. ]
        int[] countB = new int[26]; // dared [ 1, 0, 0, 2, 1, .. ]
        int ans = 0;

        for(int i = 0; i < a.length(); i++)
            countA[a.charAt(i) - 'a']++;
        for(int i = 0; i < b.length(); i++)
            countB[b.charAt(i) - 'a']++;

        for(int i = 0; i < 26; i ++) {
            if(countA[i] > countB[i])
                ans += countA[i] - countB[i];
            else if (countA[i] < countB[i])
                ans += countB[i] - countA[i];
        }

        System.out.println(ans);

    }

}