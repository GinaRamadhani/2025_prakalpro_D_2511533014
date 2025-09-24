package pekan3;
import java.util.Scanner;
public class OperatorLogika2 {
	 public static void main(String[] args) {
	        boolean A1;
	        boolean A2;
	        boolean C;
	        Scanner keyboard = new Scanner(System.in);
	        System.out.print("Input nilai boolean-1 (true / false): ");
	        A1 = keyboard.nextBoolean();
	        System.out.print("Input nilai boolean-2 (true / false): ");
	        A2 = keyboard.nextBoolean();
	        keyboard.close();
	        
	        System.out.println("A1 = " + A1);
	        System.out.println("A2 = " + A2);
	        
	        System.out.println("Konjungsi");
	        C = A1 && A2;
	        System.out.println("true and false = " + C);
	        
	        System.out.println("Disjungsi");
	        C = A1 || A2;
	        System.out.println("true or false = " + C);
	        
	        System.out.println("Negasi");//
	        C = !A1;
	        System.out.println("bukan true = " + C);//
	        
	 	}
	}


