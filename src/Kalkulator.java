import java.util.ArrayList;

public class Kalkulator {

    private static int nwd(int a,int b){
        while (b!=0){
            int r = a%b;
            a =b;
            b =r;
        }
        return a;
    }
    public static int nwdDowolnych(ArrayList<Integer> liczby){
        int x = nwd(liczby.get(0),liczby.get(1));
        for(int i=2;i<liczby.size();i++){
            x = nwd(x,liczby.get(i));
        }
        return x;
    }
    private static int pierwiast(int n) {
        int i = 1;
        while (i * i < n) {
            i++;
        }
        return i;
    }
    public static  boolean czyLiczbaPierwsza(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=pierwiast(n);i++){
            if (n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> sitoEratostenesa(int n){
        ArrayList<Integer> liczbyPierwsze  = new ArrayList<>();
        //pierwsza liczba nieskreslona w danym zakresie jest
        //liczbą pierwszą i wyrzucamy jej wielokrotnosci
        ArrayList<Integer> pomocnicza = new ArrayList<>();
        for(int i=0; i<n;i++){
            pomocnicza.add(1);
        }
        pomocnicza.set(0,0);
        pomocnicza.set(1,0);
        for(int i = 2;i<n;i++){
            if (pomocnicza.get(i) == 1){
                liczbyPierwsze.add(i);
                //zmieniamy na 0 wielokrotnosci i
                for(int k=i*2;k<n;k=k+i){
                    pomocnicza.set(k,0);
                }

            }
        }
        //0 0 1 1 0 1 0 1
        //0 1 2 3 4 5 6 7
        //2 3
        return liczbyPierwsze;
    }
}
