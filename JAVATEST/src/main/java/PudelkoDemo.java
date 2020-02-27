public class PudelkoDemo {
    public static void main(String[] args) {
        Pudelko pudelko1 = new  Pudelko();
        pudelko1.dlugosc = 2;
        pudelko1.szerokosc = 3;
        pudelko1.wysokosc = 10;
        pudelko1.obliczanieObjetosci();
        pudelko1.wyswietlObjetosc();

        Pudelko pudelko2 = new Pudelko();
        pudelko2.dlugosc = 12;
        pudelko2.szerokosc = 14;
        pudelko2.wysokosc = 3;
        pudelko2.obliczanieObjetosci();
        pudelko2.wyswietlObjetosc();


    }
}
