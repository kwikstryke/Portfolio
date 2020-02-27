public class Pudelko {
    double wysokosc;
    double szerokosc;
    double dlugosc;

   public double obliczanieObjetosci() {
       double objetosc;
        return wysokosc*szerokosc*dlugosc;


    }
    public void wyswietlObjetosc() {
       System.out.println(obliczanieObjetosci()+ "cm3");
    }
}
