import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String [] numberOfSum = bf.readLine().split("");

    int sum = 0;
    for (String str : numberOfSum) {
      if (n-- < 0) break;
      sum += Integer.parseInt(str);
    }
    System.out.println(sum);
  }
}