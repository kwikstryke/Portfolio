package Paczka;

public class Pracownik {
   private String imie;
   private String  nazwisko;
   private double zarobki;
   private String stanowisko;

   Pracownik () {
       imie = " ";
       nazwisko = " ";
       stanowisko = " ";
       zarobki = 0;

   }
   Pracownik (String imie, String nazwisko, String stanowisko, double zarobki) {
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.stanowisko = stanowisko;
       this.zarobki = zarobki;
   }

    public Pracownik(String imie, String nazwisko, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
    }

    public void setZarobki(double zarobki) {
        if (zarobki >= 0) {
            this.zarobki = zarobki;
        } else System.out.println("Nie może być ujemne!");
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getZarobki () {
                return this.zarobki;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }
    public void wyswietlImieINazwisko () {
       System.out.println(imie + " " + nazwisko);

    }
}
