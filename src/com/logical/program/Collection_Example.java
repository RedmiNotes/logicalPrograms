package com.logical.program;
import java.util.*;
public class Collection_Example extends HashSet<String> {
	public static void main(String[] args) {
		Collection_Example set = new Collection_Example();
		set.add("A");
		set.add("A");
		set.add("C");
		set.add("D");
		set.add("A");
		System.out.println(set);
	}
}