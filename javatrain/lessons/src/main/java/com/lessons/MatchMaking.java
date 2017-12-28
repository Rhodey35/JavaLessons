package com.lessons;




public class MatchMaking {


		public static void main(String[] args) {

			String string1 = "Hello";
			String string2 = "Hello";
			String string3 = "hello";
			String part1 = "Well";
			String part2 = "hello there";
			String string4 = part1 + part2;
			String string5 = "Well hello there";

			System.out.println("compare string 1 and 2");
			if (string1 == string2) {
				System.out.println("matching");
				System.out.println(string1.hashCode() +", " + string2.hashCode());

			}else {
				System.out.println("not matching");
				System.out.println(string1.hashCode() +", " + string2.hashCode());

			}

			System.out.println("compare string 1 and 3\n");

			if (string1 == string3) {
				System.out.println("matching");
				System.out.println(string1.hashCode() +", " + string3.hashCode());

			}else {
				System.out.println("not matching");
				System.out.println(string1.hashCode() +", " + string3.hashCode());

			}

			System.out.println("compare string 4 and 5\n");
			if (string4 == string5) {
				System.out.println("matching");
				System.out.println(string4.hashCode() +", " + string5.hashCode());
			}else {
				System.out.println("matching");
				System.out.println(string4.hashCode() +", " + string5.hashCode());
			}


			System.out.println("compare string 4 and 5 second version  with the .equals match");
			if (string4.equals(string5)) {
				System.out.println("matching");
				System.out.println(string4.hashCode() +", " + string5.hashCode());
			}else {
				System.out.println("not matching");
				System.out.println(string4.hashCode() +", " + string5.hashCode());
			}

		}

	}