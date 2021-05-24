import java.util.Scanner;
public class Backjun8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int n = sc.nextInt();
		if(n < 1 || n > 10000) n = sc.nextInt();

		sc.close();
		
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		
		System.out.println(result);
	}

}
