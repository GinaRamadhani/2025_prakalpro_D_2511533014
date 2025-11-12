package pekan7_2511533014;

import java.util.Scanner;
public class String2_2511533014 {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.print("Nama Depan:");
		String firstname= input.nextLine();
		System.out.print("Nama Belakang: ");
		String lastname= input.nextLine();
		String txt1 = "Dosen\"intelektual\" kampus";
		System.out.println("Nama Lengkap: "+firstname + " "+ lastname);
		System.out.println("Nama Lengkap: "+firstname.concat(lastname));
		System.out.println(txt1);
		int x =10;
		int y = 20;
		int z = x + y;
		System.out.println("x+ y= "+z);
		String a = "10";
		String b = "20";
		String c = a + b;
		System.out.println ("String a + string b ="+c);
		String v = a + y;
		System.out.println("String a + integer y ="+v);
		
		
				
		
	}

}
