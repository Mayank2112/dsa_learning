import java.util.Scanner;
// Problem Statement: Given an integer N, return true if it is a palindrome else return false.
// A palindrome is a number that reads the same backward as forward. For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.

public class CheckPalindrome {
  static boolean checkPalindrome(long n) {
    long num = n;
    long rev = 0;
    while (num > 0) {
      rev = (rev * 10) + num % 10;
      num = num / 10;
    }
    return n == rev;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    System.out.println(checkPalindrome(num));
  }
}
