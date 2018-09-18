package hellotelkom;
import java.util.Scanner;

public class lat4inputan {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a, b;
        
        //yang pertama dan kedua akan digabung tanpa spasi atau baris baru
        System.out.print("Masukkan nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = masukan.nextInt();
        
        //yang pertama dan kedua akan digabung menggunakan enter atau pada baris selanjutnya
        System.out.println();
        System.out.println("Nilai variabel yang ada pada program :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
}
