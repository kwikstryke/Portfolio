import java.util.Scanner;
public class Zad_2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj wysokość choinki:");
        int ilosc = klawiatura.nextInt();
        String gwiazdka = "*";
        String spacja;
        int licznik = ilosc - 1; // licznik okresla ilosc spacji dla pierwszej ilteracji z zalezoski
        for (int i = 1 ; i <= ilosc; i++) {
            spacja = "";
            for (int j = 1 ; j<= licznik; j++) { // liczymy ilość spacji dla każdej iteracji
                spacja = spacja + " ";
            }
            System.out.println(spacja + gwiazdka);
            gwiazdka = gwiazdka + "**" ;
            licznik--;
        }
    }
}