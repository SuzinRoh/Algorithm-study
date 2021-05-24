import java.util.Scanner;
public class ApluBmin3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case
		int T  = sc.nextInt();
		// 0 <= A, B < 10 
		int A = 0;
		int B = 0;
		int[] result = new int[T];
		
		for(int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			result[i] = A + B;
		}
		sc.close();
		
		for(int i = 0; i < result.length; i++) System.out.println(result[i]);
		
	}

}
