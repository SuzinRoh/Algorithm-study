import java.util.Scanner;
public class Gugudan {

	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N <= 1 || N > 9){
            System.out.println("wrong number range");
            N = sc.nextInt();
        }
        for(int i = 1; i <= 9; i++){
            System.out.println(N + " * " + i + " = " + N*i );
        }
	}

}
