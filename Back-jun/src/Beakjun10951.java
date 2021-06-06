import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjun10951 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String tmp = "";
		while((tmp = br.readLine()) != null ) {
			st = new StringTokenizer(tmp, " ");
			sb.append(Integer.parseInt(st.nextToken())
					+Integer.parseInt(st.nextToken())
					).append("\n");
		}
		System.out.print(sb);
	}

}
