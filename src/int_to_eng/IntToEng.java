package int_to_eng;

import java.util.Scanner;

public class IntToEng {
	public static int m;

	// メインメソッド
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		System.out.println(translateEng(input));

	}

	// 数値を英訳する変換するメソッド
	static String translateEng(int n) {
		String eng = "";
		int t;
		m = n;
		if (m > 1000000) {
			return "This number is too big.";
		} else if (m == 1000000) {
			return "one million";
		} else if (m > 9) { // 10以上

			t = m / 100000;
			if (t > 0) { // 六桁
				eng += hunthousands(t);
			}

			t = m / 1000;
			if (t > 0) { // 四桁
				eng += thousands(t);
			}

			t = m / 100;
			if (t > 0) { // 三桁
				eng += hunds(t);
			}
			if (10 <= m && m <= 19) { // ティーン
				eng += teens[m % 10];
				return eng;
			}

			int tensInt = m / 10; // 二桁
			if (tensInt > 1)
				eng += tens[tensInt];
			if (m % 10 != 0) {
				eng = eng + " " + ones[m - tensInt * 10];
			}

		} else { // 一桁
			eng += ones[m];
		}
		return eng;
	}

	static String[] ones = { "", "one", "two", "three", "four", "five", "six",
			"seven", "eight", "nine", "" };

	static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninety" };

	static String[] teens = { "ten", "eleven", "twelve", "thirteen",
			"fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	/*
	 * static String ones(int n) { if (n == 1) return "one"; if (n == 2) return
	 * "two"; if (n == 3) return "three"; if (n == 4) return "four"; if (n == 5)
	 * return "five"; if (n == 6) return "six"; if (n == 7) return "seven"; if
	 * (n == 8) return "eight"; if (n == 9) return "nine"; return ""; }
	 * 
	 * static String tens(int n) { if (n == 2) return "twenty"; if (n == 3)
	 * return "thirty"; if (n == 4) return "forty"; if (n == 5) return "fifty";
	 * if (n == 6) return "sixty"; if (n == 7) return "seventy"; if (n == 8)
	 * return "eighty"; if (n == 9) return "ninety"; return ""; }
	 * 
	 * static String teens(int n) { if (n == 11) return "eleven"; if (n == 12)
	 * return "twelve"; if (n == 13) return "thirteen"; if (n == 14) return
	 * "fourteen"; if (n == 15) return "fifteen"; if (n == 16) return "sixteen";
	 * if (n == 17) return "seventeen"; if (n == 18) return "eighteen"; if (n ==
	 * 19) return "nineteen"; return "ten"; }
	 */

	static String hunds(int h) {
		String eng = ones[h] + " hundred";
		if (m % 100 != 0)
			eng += " ";
		m = m - h * 100;
		return eng;
	}

	static String thousands(int h) {
		int t = h / 10;
		int x = h % 10;
		String eng = "";
		if (t >= 2) {
			eng = eng + tens[t] + " ";
			if (x > 0)
				eng = eng + ones[x] + " ";
		} else if (t == 1) {
			eng = eng + teens[x] + " ";
		} else if (x > 0) {
			eng = eng + ones[x] + " ";
		}
		eng += "thousand";
		if (m % 1000 != 0)
			eng += " ";
		m = m - h * 1000;
		return eng;
	}

	static String hunthousands(int h) {
		int t = h / 10;
		int x = h % 10;
		String eng = "";
		if (t > 0)
			eng = eng + tens[t] + " ";
		eng = eng + ones[x] + " hundred";
		if (m % 10000 != 0)
			eng += " ";
		m = m - h * 100000;
		return eng;
	}
}