
import java.util.Scanner;

public class suhu {

    public static void main(String[] args) {
        double celcius, fahrenheit, reamur, kelvin;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius : ");
        
        celcius = input.nextInt();

        fahrenheit = celcius * 9 / 5 + 32;

        reamur = celcius * 4 / 5;

        kelvin = celcius + 273;

        System.out.println("Hasil konversi suhu dari celcius ke Fahrenheit : " + fahrenheit);
        System.out.println("Hasil konversi suhu dari celcius ke Reamur : " + reamur);
        System.out.println("Hasil konversi suhu dari celcius ke kelvin : " + kelvin);
    }
}
