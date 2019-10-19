package ba.unsa.etf.rpr;

public class Supermarket {


    Artikl[] artikli =new Artikl[100];
    int brojArtikala = 0;

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl ar = null;
        for (int i = 0; i < brojArtikala; i++) {
            if (artikli[i].getKod().equals(kod))
                ar = artikli[i];
            for (int j = i; j < brojArtikala; j++)
                artikli[j] = artikli[j + 1];
            brojArtikala--;
        }
        return ar;
    }

    public void dodajArtikl(Artikl a) {
        if(brojArtikala == 100)
            System.out.println("U supermarketu se ne može nalaziti više od 100 artikala");
        else{
            artikli[brojArtikala] = a;
            brojArtikala++;
        }
    }
}
