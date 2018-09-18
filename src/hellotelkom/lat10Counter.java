package hellotelkom;


import java.util.Scanner;

public class lat10Counter {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("masukkan batas bilangan :");
        int batas = masukan.nextInt();
        int hasil = 0;
        for (int i = 1; i <= batas; i++) {
            hasil += i;
        }
        System.out.println("total jumlahnya adalah : " + hasil);
    }
}
