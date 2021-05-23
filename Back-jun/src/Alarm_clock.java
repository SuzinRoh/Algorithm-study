import java.util.Scanner;

public class Alarm_clock {
	    public static void main(String [] args){
	        //
	        // 0:0 midnight 23:59 
	        int H = 0;// time
	        int M = 0;// minitue
	        Scanner sc = new Scanner(System.in);
	        
	        H = sc.nextInt();
	        if(H > 23 || H < 0){
	            System.out.println("error H is lager than 0 and smaller 23. ");
	            H = sc.nextInt();
	        };
	        M = sc.nextInt();
	        if(M > 59 || M < 0 ){
	            System.out.println("error M is lager than 0 and smaller 59. ");
	            M = sc.nextInt();
	        };
	        
	        if(M >= 45 ){
	            M = M - 45;
	        }else if(M < 45) {
	            if(H == 0 ){
	                H = H +23;
	            } else {
	                H--;
	            };
	            M = (M+60) - 45;
	        };
	        
	        System.out.println(H + " " + M);
	    }
	
}
