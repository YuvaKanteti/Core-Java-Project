package com.excelr.java.practice;

public class Stringcountm2 {
public static void main(String[] args) {
	String str ="Hi my name is yuva 2001";
	
	int vowelcount=0;
	int constantcount=0;
	int digitcount =0;
	int spacecount=0;
	
	str =str.toLowerCase();
	
	for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowelcount++;
        } else if (Character.isDigit(c)) {
            digitcount++;
        } else if (c >= 'a' && c <= 'z') { // only consonants (ignore space/special)
        	constantcount++;
        } else if (c==' ') {
        	spacecount++;
        }
    }
	System.out.println(vowelcount);
	System.out.println(digitcount);
	System.out.println(constantcount);
	System.out.println(spacecount);
}

}
