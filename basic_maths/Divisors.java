import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {
  static void printAllDivisors(long num) {
    ArrayList<Number> al = new ArrayList<Number>();
    long n = num;
    long i = 1;
    while (i <= n) {

      if (num % i == 0) {
        System.out.print(i + " ");
        if (i < n) al.add(0, n);
      }
      i += 1;
      n = num / i;
    }
    for (Number aln: al) {
      System.out.print(aln + " ");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    printAllDivisors(num);
  }
}
