import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double  alan, cevre, dilimformul;
        double pi=3.14;

        System.out.println("Welcome! Yapacağınız YarıÇap Girdi ile Dairenin Alanını ve Çevresini Hesaplayacağız!");
        System.out.print("Lütfen YarıÇapı Giriniz. r:  ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();

    //---------ALAN VE ÇEVRE FORMÜLLERİ HESAPLANDI------------------
        alan = (pi * r * r);
        System.out.println("Dairenin Alanı: "+alan);
        cevre = (2 * pi * r);
        System.out.println("Dairenin Çevresi: "+cevre);


        //---------ÖDEV / DAİRENİN MERKEZ AÇISININ DİLİM ALANI------------

        System.out.print("a merkez açısını giriniz:  ");
        Scanner input1 = new Scanner(System.in);
        double a = input1.nextDouble();

        dilimformul = (pi * (r * r)* a)/360;
        System.out.println("Dilim alanı: "+dilimformul);

    }
}
