
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String [] str = br.readLine().strip().split(" ");
    int wordCount = 0;
    for (String s : str) {
      if (!s.isEmpty()) wordCount++;
    }

    System.out.printf("%d",wordCount);
  }
}