import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, total = 0, count = 0;


        Scanner input = new Scanner(System.in);     // sayıyı iste
        System.out.println("Sorgulamak istediğiniz sayıyı giriniz :");
        number = input.nextInt();       // aldığın sayıyı sisteme kaydet

        for (int i = 1; i <= number; i++) {         // 1'den istenilen sayıya kadar olan sayıları belirle
            if (i % 3 == 0 || i % 4 == 0) {         // sadece 4 veya 3 'e bölnünen sayıları yazdır
                System.out.println(i);
                total += i;                         // yazılan i leri topla
                count++;                            // kaç kere yazıldığını say

            }
        }
        if (count > 0) {            // yazılan sayıların adetini kaydet
            int avarage = total / count;        // toplam / adet = ortlama
            System.out.println("Yazdırılan sayıların ortalaması : " + avarage);
        }
    }
}// Ali Eren KÖSE   24/02/2024 16:16