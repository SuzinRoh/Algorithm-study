
import java.util.Scanner;

public class Main {
  public static void main(String [] args) {

    Scanner sc = new Scanner(System.in);

    int year = sc.nextInt();

    boolean leapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

    System.out.print(leapYear ? 1 : 0);

  }
}