
import java.util.Scanner;

public class biodata {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nama, tmplahir, jeniskel, alamat, motto;
        int nis, tglahir;

        System.out.println();
        System.out.println("---ISI BIODATA---");
        System.out.println();

        System.out.print("Nama             : ");
        nama = scan.next();

        System.out.print("NIS              : ");
        nis = scan.nextInt();

        System.out.print("Tempat lahir     : ");
        tmplahir = scan.next();

        System.out.print("Tanggal lahir    : ");
        tglahir = scan.nextInt();

        System.out.print("Jenis kelamin    : ");
        jeniskel = scan.next();

        System.out.print("Alamat di Malang : ");
        alamat = scan.next();

        System.out.print("Motto hidup      : ");
        motto = scan.next();

        System.out.println(" ");
        System.out.println("          Biodata Siswa           ");
        System.out.println(" ");
        System.out.println("Nama                 : " + nama);
        System.out.println("NIS                  : " + nis);
        System.out.println("Tempat lahir         : " + tmplahir);
        System.out.println("Tanggal lahir        : " + tglahir);
        System.out.println("Jenis Kelamin        : " + jeniskel);
        System.out.println("Alamat di Malang     : " + alamat);
        System.out.println("Motto Hidup          : " + motto);

    }
}
