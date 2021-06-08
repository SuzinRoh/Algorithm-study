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

		int a = Integer.parseInt(n.substring(0,1)); 
		int b = Integer.parseInt(n.substring(1,2));

		while(true) {
			tmp = (a+b)+"";
			if(a+b > 9) {
				tmp = a+b+"";
				tmp = tmp.substring(1,2);
			}
			tmp = b + tmp;
			if(!tmp.equals(n)) {
				a = Integer.parseInt(tmp.substring(0,1));
				b = Integer.parseInt(tmp.substring(1,2));
				tmp= "";
			} else {
				cnt++;
				break;
			}
			cnt++;
		}			
		System.out.println(cnt);
	}

}
