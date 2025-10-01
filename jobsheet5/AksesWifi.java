import java.util.Scanner;

public class AksesWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisPengguna;
        int sks;

        System.out.print("Apakah anda dosen atau mahasiswa? ");
        jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Jika Mahasiswa berapa sks anda? ");
            sks = sc.nextInt(); 

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (Mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak !");
        }
    }
}
