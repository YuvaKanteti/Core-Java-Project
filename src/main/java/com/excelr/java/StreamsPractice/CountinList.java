package com.excelr.java.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountinList {
	public static void main(String[] args) {
		 int n1= 0;
		 int n2 =1;
		 int n = 10;
		 System.out.println(n1);
		 System.out.println(n2);
		 for(int i=0;i<10;i++){
		 int n3 = n1+n2;
		 System.out.println(n3);
		n1=n2;
		n2= n3;
		 }
	}

}
