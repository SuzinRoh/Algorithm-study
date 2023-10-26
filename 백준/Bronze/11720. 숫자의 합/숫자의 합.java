import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bf.readLine());
    String number = bf.readLine();

    int sum = 0;
    for (int i=0; i<n; i++) {
      sum += Character.getNumericValue(number.charAt(i));
    }
    System.out.println(sum);
  }
}