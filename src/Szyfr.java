public class Szyfr {
    private String slowo;

    public Szyfr(String slowo) {
        this.slowo = slowo;
    }

    private int pierwiastek(int n) {
        int i = 1;
        while (i * i < n) {
            i++;
        }
        return i;
    }

    public String szyfrKwadratem() {
        String szyfr = "";
        int bok = pierwiastek(slowo.length());
        for (int k = 0; k < bok; k++) {
            for (int i = k; i < bok * bok; i = i + bok) {
                if (i >= slowo.length()) {
                    szyfr = szyfr + " ";
                } else {
                    szyfr = szyfr + slowo.charAt(i);
                }
            }
        }
        return szyfr;
    }

    /**
     * szyfrPrzestawieniowy
     * Metoda przestawia dwie sąsiadujące litery
     *
     * @return
     */
    public String szyfrPrzestawieniowy() {
        String szyfr = "";
        for (int i = 0; i < slowo.length() - 1; i = i + 2) {
            szyfr = szyfr + slowo.charAt(i + 1) + slowo.charAt(i);
        }
        if (slowo.length() % 2 == 1) {
            szyfr = szyfr + slowo.charAt(slowo.length() - 1);
        }
        return szyfr;
    }

    public String szyfrujCezarem(int klucz) {
        String szyfr = "";
        //klucz większy od długości alfabetu
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(alfabet.length());
        klucz = klucz % alfabet.length();
        System.out.println("klucz" + klucz);
        //klucz dodatni
        String szyfrowane = "";
        if (klucz > 0) {
            szyfrowane = alfabet.substring(klucz)
                    + alfabet.substring(0, klucz);

        } else {
            szyfrowane =
                    alfabet.substring(alfabet.length()
                            + klucz)
                            + alfabet.substring(0, alfabet.length() + klucz);

        }
        for (int i = 0; i < slowo.length(); i++) {
            szyfr = szyfr +
                    szyfrowane.charAt(alfabet
                            .indexOf(slowo.charAt(i)));

        }

        //klucz ujemny


        return szyfr;
    }

}
