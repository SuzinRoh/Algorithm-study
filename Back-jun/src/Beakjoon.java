import java.io.*;
public class Beakjoon {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine().trim());
		br.close();
		
		for(int i = 1; i <= n; i++) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}

}
/*
BufferedReader br = new BufferedReader
(new InputStreamReader(System.in));
//BufferedWriter bw = new BufferedWriter
//(new OutputStreamWriter(System.out));
int n = Integer.parseInt(br.readLine().trim());
br.close();
for(int i = 1; i <= n; i++) {
System.out.println(i);
}*/