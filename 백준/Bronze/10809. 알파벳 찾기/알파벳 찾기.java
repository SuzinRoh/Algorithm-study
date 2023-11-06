
import java.util.Scanner;

public class Main {
  public static void main(String [] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String word = scanner.nextLine();
      StringBuilder sb = new StringBuilder();
      for (int i=97; i<=122; i++) {
        int temp = -1;
        for (char c : word.toCharArray()) {
          if (c == (char)i) {
            temp = word.indexOf(c);
            break;
          }
        }
        sb.append(temp).append(" ");
      }
      System.out.printf("%s",sb.toString());

    } catch (Exception ignore) {}
  }
}