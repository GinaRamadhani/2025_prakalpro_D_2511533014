package tugasAlproPekan4_2511533014;

import java.util.Scanner;
public class PembelianTiketBioskop {

    // Fungsi untuk format mata uang Rupiah tanpa desimal
    private static String formatRupiah(long amount, NumberFormat nf) {
        return nf.format(amount);
    }

    // Fungsi untuk format persentase (menambahkan tanda + atau -)
    private static String formatPercent(double p) {
        int pct = (int) Math.round(p * 100);
        return (pct >= 0 ? "+" + pct + "%" : pct + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale id = new Locale("id", "ID");
        NumberFormat nf = NumberFormat.getCurrencyInstance(id);
        nf.setMaximumFractionDigits(0); // Tanpa desimal

        final int BASE_PRICE = 50000; // Harga dasar per tiket

        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.print("Nama Pembeli : ");
        String nama = sc.nextLine().trim();

        // Input jumlah tiket dengan validasi
        int jumlahTiket = 0;
        while (true) {
            System.out.print("Jumlah Tiket : ");
            if (!sc.hasNextInt()) {
                System.out.println("Input tidak valid. Masukkan angka bulat > 0.");
                sc.next(); // buang input tidak valid
                continue;
            }
            jumlahTiket = sc.nextInt();
            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket harus lebih dari 0. Ulangi.");
            } else break;
        }

        // Input hari
        int hari = 0;
        while (true) {
            System.out.print("Hari (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu) : ");
            if (!sc.hasNextInt()) {
                System.out.println("Pilihan hari harus angka 1..3.");
                sc.next();
                continue;
            }
            hari = sc.nextInt();
            if (hari < 1 || hari > 3) {
                System.out.println("Pilihan hari tidak valid. Masukkan 1..3.");
            } else break;
        }

        // Input waktu tayang
        int waktu = 0;
        while (true) {
            System.out.print("Waktu Tayang (1=Pagi 10:00-12:00, 2=Siang 12:00-17:00, 3=Malam 17:00-22:00) : ");
            if (!sc.hasNextInt()) {
                System.out.println("Pilihan waktu harus angka 1..3.");
                sc.next();
                continue;
            }
            waktu = sc.nextInt();
            if (waktu < 1 || waktu > 3) {
                System.out.println("Pilihan waktu tidak valid. Masukkan 1..3.");
            } else break;
        }

        // Input jenis studio
        int studio = 0;
        while (true) {
            System.out.print("Jenis Studio (1=Regular, 2=Deluxe, 3=Premium) : ");
            if (!sc.hasNextInt()) {
                System.out.println("Pilihan studio harus angka 1..3.");
                sc.next();
                continue;
            }
            studio = sc.nextInt();
            if (studio < 1 || studio > 3) {
                System.out.println("Pilihan studio tidak valid. Masukkan 1..3.");
            } else break;
        }

        // Menentukan label dan persentase berdasarkan pilihan
        String hariLabel;
        double dayPct;
        switch (hari) {
            case 1 -> { hariLabel = "Senin-Kamis"; dayPct = 0.0; }
            case 2 -> { hariLabel = "Jumat"; dayPct = 0.10; }
            default -> { hariLabel = "Sabtu-Minggu"; dayPct = 0.30; }
        }

        String waktuLabel;
        double timePct;
        switch (waktu) {
            case 1 -> { waktuLabel = "Pagi 10:00-12:00"; timePct = -0.10; }
            case 2 -> { waktuLabel = "Siang 12:00-17:00"; timePct = 0.0; }
            default -> { waktuLabel = "Malam 17:00-22:00"; timePct = 0.20; }
        }

        String studioLabel;
        double studioPct;
        switch (studio) {
            case 1 -> { studioLabel = "Regular"; studioPct = -0.10; }
            case 2 -> { studioLabel = "Deluxe"; studioPct = 0.0; }
            default -> { studioLabel = "Premium"; studioPct = 0.30; }
        }

        // Perhitungan harga tiket
        double multiplier = 1.0 + dayPct + timePct + studioPct;
        long hargaPerTiket = Math.round(BASE_PRICE * multiplier);
        long subtotal = hargaPerTiket * jumlahTiket;

        // Diskon berdasarkan jumlah tiket
        double diskonPct = 0.0;
        if (jumlahTiket >= 5) diskonPct = 0.20;
        else if (jumlahTiket >= 3) diskonPct = 0.10;

        long diskonAmount = Math.round(subtotal * diskonPct);
        long totalBayar = subtotal - diskonAmount;

        // Output hasil pembelian
        System.out.println("------------------------------------");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Jumlah Tiket : " + jumlahTiket);
        System.out.println("Hari         : " + hariLabel);
        System.out.println("Waktu Tayang : " + waktuLabel);
        System.out.println("Jenis Studio : " + studioLabel);
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar   : " + formatRupiah(BASE_PRICE, nf) + " /tiket");
        System.out.println("Biaya Hari    : " + formatPercent(dayPct));
        System.out.println("Biaya Waktu   : " + formatPercent(timePct));
        System.out.println("Biaya Studio  : " + formatPercent(studioPct));
        System.out.println("Harga per Tiket : " + formatRupiah(hargaPerTiket, nf));
        System.out.println("Subtotal        : " + formatRupiah(subtotal, nf));
        System.out.println("Diskon (" + (int) Math.round(diskonPct * 100) + "%) : " + formatRupiah(diskonAmount, nf));
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR : " + formatRupiah(totalBayar, nf));
        System.out.println("------------------------------------");
        System.out.println("Terima kasih telah membeli tiket!");
        
        sc.close();
    }
}

