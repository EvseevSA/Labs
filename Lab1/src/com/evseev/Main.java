package com.evseev;

public class Main {

    public static void main(String[] args) {
	Primes.getPrimes();
	System.out.println();
	Palindrome.identify(new String[]{"madam", "racecar", "apple", "kayak",
            "song", "noon"});
    }
}
