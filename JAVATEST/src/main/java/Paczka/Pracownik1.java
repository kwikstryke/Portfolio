package Paczka;

import Paczka.Pracownik;

public class Pracownik1 {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik();
        pracownik1.setImie("Adam");
        pracownik1.setNazwisko("Kowalski");
        pracownik1.setStanowisko("Palacz");
        pracownik1.setZarobki(2500);
        pracownik1.wyswietlImieINazwisko();
        System.out.println(pracownik1.getZarobki());
        System.out.println(pracownik1.getImie());
        System.out.println(pracownik1.getNazwisko());
        System.out.println(pracownik1.getStanowisko());
        Pracownik pracownik2 = new Pracownik("Maciej", "Janeczko", "Palacz", 4000);



        System.out.println(pracownik2.getZarobki());

        Boss boss1 = new Boss ("Andrzej", "Psikuta", "Boss", 2550, 5000);
        boss1.wyswietlImieINazwisko();


    }

}
