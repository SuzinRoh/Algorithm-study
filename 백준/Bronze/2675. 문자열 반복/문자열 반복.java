
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer sb = new StringBuffer();
    int roof = Integer.parseInt(br.readLine());

    while (roof-- > 0) {

      String [] line = br.readLine().split(" ");

      for (byte val : line[1].getBytes()) {
        int cnt = Integer.parseInt(line[0]);
        while (cnt-- > 0) {
          sb.append((char)val);
        }
      }
      sb.append("\n");
    }
    System.out.print(sb.toString());

  }
}