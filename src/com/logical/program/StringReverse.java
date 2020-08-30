package com.logical.program;

public class StringReverse {

	public String Reverse_01() {
		String s1 = "Java";
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--) {
			s2+=s1.charAt(i);
		}
		System.out.println("String Reverse : " + s2);
		return s2;
	}

	public void Reverse_02() {
		String s1 = "Program";
		StringBuffer sb = new StringBuffer(s1);
		StringBuilder sbu = new StringBuilder(s1);
		sb.reverse();
		sbu.reverse();
		System.out.println("StringBuffer : " + sb);
		System.out.println("StringBuilder : " + sbu);
	}
	public void Reverse_03() {
		String s1 = "Java Program";
		char ch[] = s1.toCharArray();
		String s2 = "";
		for(int i=ch.length-1;i>=0;i--) {
			s2+= ch[i];
		}
		System.out.println("String Reverse using char Array : " + s2);
	}
	public void Reverse_04() {
		String s1 = "Java is a Object Orient Program";
		String s2[] = s1.split(" ");
		String s3 = "";
		for(int i=0;i<=s2.length-1;i++) {
			String s4 = s2[i] + " ";
			for(int j=s4.length()-1;j>=0;j--) {
				s3+=s4.charAt(j);
			}
		}
		System.out.println(s3.trim());
	}
	public void spacetrim() {
		String s1 = "                                                                                        Java";
		System.out.println(s1.trim());
	}
	public static void main(String[] args) {
		StringReverse sr = new StringReverse();
		//sr.Reverse_01();
		//sr.Reverse_02();
		//sr.Reverse_03();
		sr.Reverse_04();
		//sr.spacetrim();
	}
}