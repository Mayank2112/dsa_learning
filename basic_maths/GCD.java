import java.util.Scanner;

public class GCD {
  static long findGCD(long num1, long num2) {
    if (num2 < num1) {
      long t = num1;
      num1 = num2;
      num2 = t;
    }
    long t = num1;
    int count = 1;
    while (t > 0) {
      if (num1 % t == 0 && num2 % t == 0) return t;
      count += 1;
      t = (num1 / count) >= t ? t - 1 : (num1 / count);
    }
    return 1;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter first number: ");
      long num1 = sc.nextLong();
      System.out.print("Enter second number: ");
      long num2 = sc.nextLong();
      System.out.println(findGCD(num1, num2));
    }
  }
}
