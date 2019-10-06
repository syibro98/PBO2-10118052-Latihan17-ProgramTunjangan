/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan17.programtunjangan;

import java.util.Scanner;

/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk mengetahui berapa gaji
 * pokok tunjangan setelah menikah.
 * 
 */
public class PBO210118052Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=========== Program Tunjangan ===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Double gapok = scanner.nextDouble();
        Double tunjangan = 0.0;
        System.out.print("Status Anda? (Menikah/Belum): ");
        if(scanner.next().equals("Menikah")) {
            tunjangan = gapok * 0.35;
        }
        System.out.println();
        System.out.println("=========== Hasil Perhitungan Gaji Anda "
                + "===========");
        System.out.println("Gaji Pokok\t\t: Rp." + gapok);
        System.out.printf("Tunjangan\t\t: Rp.%7.1f%n", tunjangan);
        System.out.println("Total Gaji\t\t: Rp." + (gapok+tunjangan));
        System.out.println("(Developed by : Bagus Syibro Malisi)");
    }
    
}
