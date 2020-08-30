package com.logical.program;

public class Pattens {

	public void patten_01() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println(); 
		}
	}
	public void pattern_02() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void pattern_03() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void pattern_04() {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public void patten_05() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||j==1||i==5||j==5||i==j||i+j==5+1) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public void pattern_06() {
		char n = 65;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)n + " ");
				n++;
			}
			System.out.println();
		}
	}
	public void pattern_07() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" * ");
			}
			for(int l=i-1;l>=1;l--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattens pattern = new Pattens();
		//		pattern.patten_01();
		//		pattern.pattern_02();
		//		pattern.pattern_03();
		//		pattern.pattern_04();
		//pattern.patten_05();
		pattern.pattern_06();
		pattern.pattern_07();
	}
}