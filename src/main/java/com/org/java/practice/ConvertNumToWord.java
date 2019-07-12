package com.org.java.practice;

public class ConvertNumToWord {

	private static String ones[] = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ",
			"nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen", "sixteen ", "seventeen ", "eighteen ",
			"ninteen " };

	private static String tens[] = { " ", " ", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ",
			"eighty ", "ninty " };

	public static void main(String[] args) {
		int number = 999999999;
		System.out.println(parseNumberToWords(number));
	}

	private static String parseNumberToWords(int number) {
		String toWords = "";
		if (number == 0) {
			return "zero";
		}
		if ((number / 1000000) > 0) {
			toWords += parseNumberToWords(number / 1000000) + "million ";
			number %= 1000000;
		}
		if ((number / 1000) > 0) {
			toWords += parseNumberToWords(number / 1000) + "thousand ";
			number %= 1000;
		}
		if ((number / 100) > 0) {
			toWords += parseNumberToWords(number / 100) + "hundred ";
			number %= 100;
		} 
		if (number > 0) {
			if (number < 20) {
				toWords += ones[number];
			} else {
				toWords += tens[number / 10];
				if ((number % 10) > 0) {
					toWords += ones[number % 10];
				}
			}
		}
		return toWords;
	}
}
