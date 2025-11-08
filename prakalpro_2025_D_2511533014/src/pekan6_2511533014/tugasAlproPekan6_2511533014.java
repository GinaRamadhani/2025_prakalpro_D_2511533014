package pekan6_2511533014;

import java.util.Scanner;
import java.util.Random;

public class tugasPekan6_2511533014 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Random random = new Random();
	        
	        int percobaan = 0;
	        boolean menang = false;
	        String jawab;

	        do {
	            // lempar dua dadu
	            int dadu1 = random.nextInt(6) + 1; // nilai 1–6
	            int dadu2 = random.nextInt(6) + 1;
	            int hasil = dadu1 + dadu2;
	            percobaan++;

	            // tampilkan hasil lemparan
	            System.out.println(dadu1 + " + " + dadu2 + " = " + hasil);

	            // misalnya angka benar adalah 7 (target)
	            if (hasil == 7) {
	                System.out.println("Tebakan Anda Benar");
	                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
	                menang = true;
	                break;
	            } else {
	                System.out.println("Tebakan Anda Salah");
	            }

	            // tanya pengguna apakah ingin lanjut
	            System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
	            jawab = input.nextLine().toLowerCase();

	            if (jawab.equals("tidak")) {
	                break;
	            }

	        } while (true);

	        if (!menang) {
	            System.out.println("Anda gagal menang");
	        }

	        input.close();
	    }
	}



