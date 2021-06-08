import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjun1110 {

	public static void main(String[] args) throws IOException{
		BufferedReader rd = new BufferedReader(
				new InputStreamReader(System.in));
		int cnt =0;
		String n = rd.readLine();
		
		if(n.length() < 2) {
			n = "0"+n;
		}
		String tmp ="";
		
		while(true) {
	
			int a = Integer.parseInt(n.substring(0,1));
			int b = Integer.parseInt(n.substring(1,2));
			tmp = (a+b)+"";
			tmp = b + tmp;
			System.out.println(tmp);
			if(tmp.equals(n)) break;
			cnt++;
		}
		
	}

}
