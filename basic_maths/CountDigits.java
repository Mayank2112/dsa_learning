// Problem Statement: Given an integer N, return the number of digits in N.

import java.util.Scanner;

public class CountDigits {
  static int bruteForce(long num) {
    int count = 0;
    while(num > 0) {
      count += 1;
      num = num / 10;
    }
    return count;
  }

  static int optimal(long num) {
    return (int)Math.log10(num) + 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    long n = sc.nextLong();
    System.out.println(bruteForce(n));
    System.out.println(optimal(n));
  }
}
