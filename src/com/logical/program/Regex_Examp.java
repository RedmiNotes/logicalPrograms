package com.logical.program;

public class Regex_Examp {
	public static void main(String[] args) {
	String s1 = "J2345646587!@#@!a2343v234@$#$@@a";
	String s2 = s1.replaceAll("[^A-Za-z]", "");
	System.out.println(s2);
	}
}