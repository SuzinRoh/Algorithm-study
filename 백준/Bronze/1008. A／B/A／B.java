import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String [] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    double []number = Arrays.stream(br.readLine().strip().split(" "))
            .filter(s -> !s.isEmpty())
            .mapToDouble(Double::parseDouble)
            .toArray();

    System.out.print(number[0]/number[1]);
  }
}