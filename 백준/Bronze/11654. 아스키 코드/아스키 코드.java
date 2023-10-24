import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String [] strArr = bf.readLine().split(" ");

    for (String str : strArr) {
      char c = str.charAt(0);
      System.out.println((int)c);
    }
  }
}