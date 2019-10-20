package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] korpaArtikala = new Artikl[50];
    int brojArtikala = 0;
    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala == 50){
            System.out.println("U korpi se ne može nalaziti više od 50 artikala");
            return false;
        }
        else{
            korpaArtikala[brojArtikala] = a;
            brojArtikala++;
            return true;
        }


    }

    public Artikl[] getArtikli() {
        return korpaArtikala;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl ar = null;
        for (int i = 0; i < brojArtikala; i++) {
            if (korpaArtikala[i].getKod().equals(kod)){
                ar = korpaArtikala[i];
                for (int j = i; j < brojArtikala; j++)
                    korpaArtikala[j] = korpaArtikala[j + 1];
                break;
            }
        }
        brojArtikala--;
        return ar;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for (int i = 0; i < brojArtikala; i++){
            ukupnaCijena += korpaArtikala[i].getCijena();
        }
        return ukupnaCijena;
    }
}
