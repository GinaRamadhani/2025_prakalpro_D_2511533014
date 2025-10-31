package pekan3;

import java.util.Scanner;

public class tugasAlproPekan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();

        // Proses
        double volume = 3.14 * r * r * t;

        // Output
        System.out.println("Volume tabung = " + volume);

        input.close();
    }
}



