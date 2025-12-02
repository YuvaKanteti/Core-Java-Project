package com.excelr.java.collectionframework;

public class Info13 {
	public static void main(String[] args) {
        String str = "Programming";
        str = str.toLowerCase();  // Case-insensitive counting

        int[] count = new int[26]; // For 26 lowercase letters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        // Print only characters that occurred
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char)(i + 'a') + " : " + count[i]);
            }
        }
    }

}
