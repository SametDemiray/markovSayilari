package org.example;
/*
Markov sayıları, Rus matematikçi Andrey Markov'un adını taşıyan özel bir sayı dizisidir. Bu sayı dizisi, üç pozitif
tam sayının karelerinin toplamının, aynı sayının üç katına eşit olduğu sayıları içerir.Markov sayıları, homojen simetri
gruplarının teorisinde ve Arnold diffüzyonları gibi matematiksel konularda önemlidir. Ayrıca, bunlar bazı algoritmik ve
sayısal analiz problemlerinde de karşımıza çıkabilir.

Bu program, kullanıcının belirlediği bir üst sınırda Markov sayılarını bulur. Markov sayıları, x²+y²+z² = 3xyz  denkleminin
pozitif tamsayı olan x, y ve z şeklindeki çözümleridir.Program, üç iç içe döngü kullanarak tüm x, y ve z değerlerini tarar.
Ardından, her bir kombinasyon için verilen denklemi kontrol eder ve denklemi sağlayan pozitif tamsayıları Markov sayısı olarak
kabul eder.Bulunan Markov sayıları ekrana yazdırılır ve kullanıcıya sunulur.
Bu program, verilen bir üst sınır altında bulunan tüm Markov sayılarını etkili bir şekilde bulur ve listeler.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir üst sınırı girin: ");
        int ustSinir = scanner.nextInt();
        ArrayList<Integer[]> markovSayilari = new ArrayList<>();

        System.out.println("Markov sayıları:");
        for (int x = 1; x <= ustSinir; x++) {
            for (int y = x; y <= ustSinir; y++) {
                for (int z = y; z <= ustSinir; z++) {
                    if (isMarkov(x, y, z)) {
                        Integer[] markov = {x, y, z};
                        markovSayilari.add(markov);
                        System.out.println("(" + x + ", " + y + ", " + z + ")");
                    }
                }
            }
        }
    }

    // Verilen x, y, ve z için Markov sayısı olup olmadığını kontrol eden metod
    public static boolean isMarkov(int x, int y, int z) {
        return (x * x + y * y + z * z) == (3 * x * y * z);
    }
}