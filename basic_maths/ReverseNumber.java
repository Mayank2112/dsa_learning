import java.util.Scanner;

public class ReverseNumber {
  static long reverseNumber(long num) {
    long rev = 0;
    while (num > 0) {
      rev = (rev * 10) + num % 10;
      num = num / 10;
    }
    return rev;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    System.out.println(reverseNumber(num));
  }
}
