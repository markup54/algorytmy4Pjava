import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String slowo="abcdef";
        Szyfr szyfr = new Szyfr(slowo);
        System.out.println(szyfr.szyfrujCezarem(-30));
        System.out.println(szyfr.szyfrPrzestawieniowy());
        System.out.println(szyfr.szyfrKwadratem());
        System.out.println("Obliczenia");
        if(Kalkulator.czyLiczbaPierwsza(18))
        {
            System.out.println("Liczba pierwsza");
        }
        else{
            System.out.println("Liczba złożona");
        }
        System.out.println(Kalkulator.sitoEratostenesa(100));
        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(10);
        liczby.add(20);
        liczby.add(150);
        liczby.add(8);
        System.out.println(Kalkulator.nwdDowolnych(liczby));
    }
}