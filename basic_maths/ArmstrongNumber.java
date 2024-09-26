import java.util.Scanner;

// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
// An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

public class ArmstrongNumber {
  static boolean isArmstrong(int num) {
    int len = Integer.toString(num).length();
    int dummy = num;
    int res = 0;
    while(dummy > 0) {
      int rem = dummy % 10;
      dummy = dummy / 10;
      res += Math.pow(rem, len);
    }
    return num == res;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(isArmstrong(num));
  }
}
