import java.util.Scanner;
public class NilaiMahasiswa {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String nama;
 long nim;
 int utsMatkul1, uasMatkul1, tugasMatkul1;
 int utsMatkul2, uasMatkul2, tugasMatkul2;
 double average1, average2;
 String statusMatkul1,statusMatkul2;
 String nilaiHuruf1, nilaiHuruf2;
 double finalAverage;
 String statusSemester;
 System.out.println("===== INPUT DATA MAHASISWA =====");
 System.out.print("Nama: ");
 nama = sc.nextLine();
 System.out.print("NIM: ");
 nim = sc.nextLong();
 System.out.println();
 System.out.println("--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
 System.out.print("Nilai UTS : ");
 utsMatkul1 = sc.nextInt();
 System.out.print("Nilai UAS : ");
 uasMatkul1 = sc.nextInt();
 System.out.print("Nilai Tugas : ");
 tugasMatkul1 = sc.nextInt();
 System.out.println();
 average1 = (utsMatkul1 * 0.3) + (uasMatkul1 * 0.4) +
(tugasMatkul1 * 0.3);
 if (average1 >= 60 ) {
 statusMatkul1 = "Lulus";
 }else {
 statusMatkul1 = "Tidak Lulus";
 }

 if (average1 <= 100 && average1 > 80) {
 nilaiHuruf1 = "A ";
 } else if (average1 <= 80 && average1 > 73) {
 nilaiHuruf1 = "B+";
 } else if (average1 <= 73 && average1 > 65) {
 nilaiHuruf1 = "B ";
 } else if (average1 <= 65 && average1 > 60) {
 nilaiHuruf1 = "C+";
 } else if (average1 <= 60 && average1 > 50) {
 nilaiHuruf1 = "C ";
 } else if (average1 <= 50 && average1 > 39) {
 nilaiHuruf1 = "D ";
 } else {
 nilaiHuruf1 = "E ";
 }

 System.out.println("--- Mata Kuliah 2: Struktur Data ---");
 System.out.print("Nilai UTS : ");
 utsMatkul2 = sc.nextInt();
 System.out.print("Nilai UAS : ");
 uasMatkul2 = sc.nextInt();
 System.out.print("Nilai Tugas : ");
 tugasMatkul2 = sc.nextInt();
 average2 = (utsMatkul2 * 0.3) + (uasMatkul2 * 0.4) +
(tugasMatkul2 * 0.3);
 if (average2 >= 60 ) {
 statusMatkul2 = "Lulus";
 }else {
 statusMatkul2 = "Tidak Lulus";
 }

 if (average2 <= 100 && average2 > 80) {
 nilaiHuruf2 = "A ";
 } else if (average2 <= 80 && average2 > 73) {
 nilaiHuruf2 = "B+";
 } else if (average2 <= 73 && average2 > 65) {
 nilaiHuruf2 = "B ";
 } else if (average2 <= 65 && average2 > 60) {
 nilaiHuruf2 = "C+";
 } else if (average2 <= 60 && average2 > 50) {
 nilaiHuruf2 = "C ";
 } else if (average2 <= 50 && average2 > 39) {
 nilaiHuruf2 = "D ";
 } else {
 nilaiHuruf2 = "E ";
 }

 finalAverage = (average1 + average2) / 2;
 if (statusMatkul1.equalsIgnoreCase("Lulus") &&
statusMatkul2.equalsIgnoreCase("Lulus")) {
 if (finalAverage >= 70) {
 statusSemester = "Lulus";
 }else {
 statusSemester = "Tidak Lulus";
 }
 } else {
 statusSemester = "Tidak Lulus";
 }
 System.out.println("==================== HASIL PENILAIANAKADEMIK ======================");
 System.out.println("Nama: " + nama);
 System.out.println("NIM: " + nim);
 System.out.println();
 System.out.println("Mata Kuliah UTS UASTugas Nilai Akhir Nilai Huruf Status");
 System.out.println("---------------------------------------------------------------------------------------------------");
 System.out.println("Algoritma Pemrograman " + utsMatkul1
+ " " + uasMatkul1 + " "+ tugasMatkul1 + " " +
average1 + " " + nilaiHuruf1 + " "+
statusMatkul1 );
 System.out.println("Struktur Data " +
utsMatkul2+ " " + uasMatkul2 + " "+ tugasMatkul2 + " " + average2 + " " + nilaiHuruf2 + " "+
statusMatkul2 );
 System.out.println();
 System.out.println("Rata-rata Nilai Akhir : " +
finalAverage);
 System.out.println("Status Semester : " +
statusSemester + " (Rata-rata < 70)");
 sc.close();
 }
}
