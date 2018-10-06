/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		ps3.dateFashion(2, 8);
		ps3.fizzString("abc");
		ps3.squirrelPlay(95, true);
		ps3.fizzStringAgain(15);
		ps3.makeBricks(3, 2, 10);
		ps3.loneSum(3, 3, 3);
		ps3.luckySum(1, 13, 3);
		ps3.factorialWithFor(5);
		ps3.factorialWithWhile(5);
		ps3.isPrime(144);
	}
		
	public void dateFashion(int you, int date) {
		if(you <= 2 || date <= 2) {
			System.out.println("NO");
		}
		else if(you >= 8 || date >= 8) {
			System.out.println("YES");
		}
		else {
			System.out.println("MAYBE");
		}
	}
	
	public void fizzString(String str) {
		if(str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
			System.out.println("FIZZBUZZ");
		}
		else if(str.charAt(0) == 'f') {
			System.out.println("FIZZ");
		}
		else if(str.charAt(str.length() - 1) == 'b') {
			System.out.println("BUZZ");
		}
		else {
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		int upLim = (isSummer == true) ? 100 : 90;
		if(temp >= 60 && temp <= upLim) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void fizzStringAgain(int n) {
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("FIZZBUZZ!");
		}
		else if(n % 3 == 0) {
			System.out.println("FIZZ!");
		}
		else if(n % 5 == 0) {
			System.out.println("BUZZ!");
		}
		else {
			System.out.println(n + "!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		int totalLen = (small * 1) + (big * 5);
		if(totalLen >= goal && ((totalLen - goal) % 3 == 0 || (totalLen - goal) % 5 == 0)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if(a == b && a == c && b == c) {
			System.out.println(0);
		}
		else if(a == b) {
			System.out.println(c);
		}
		else if(a == c) {
			System.out.println(b);
		}
		else if(b == c) {
			System.out.println(a);
		}
		else {
			System.out.println(a + b + c);
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if(a == 13) {
			System.out.println(0);
		}
		else if(b == 13) {
			System.out.println(a);
		}
		else if(c == 13) {
			System.out.println(a + b);
		}
		else {
			System.out.println(a + b + c);
		}
	}
	
	public void factorialWithFor(int n) {
		int fact = 1;
		for(int x = n; x > 0; x--) {
			fact *= x;
		}
		System.out.println(n + "! = " + fact);
	}
	
	public void factorialWithWhile(int n) {
		int fact = 1;
		int c = n;
		while(c > 0) {
			fact *= c;
			c--;
		}
		System.out.println(n + "! = " + fact);
	}
	
	public void isPrime(int n) {
		boolean isPrime = true;
		if(n == 1) {
			isPrime = false;
		}
		else {
			for(int x = n - 1; x >= 2; x--) {
				if(n % x == 0) {
					isPrime = false;
				}
			}
		}
		if(isPrime == true) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("NOT PRIME");
		}
	}
}