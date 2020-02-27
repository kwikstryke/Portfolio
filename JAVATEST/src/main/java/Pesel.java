import java.util.Scanner;

public class Pesel {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj PESEL:");
        String PESEL1 = klawiatura.next();
        int suma = Character.getNumericValue(PESEL1.charAt(0)*1)
                +Character.getNumericValue(PESEL1.charAt(1)*3)
                +Character.getNumericValue(PESEL1.charAt(2)*7)
                +Character.getNumericValue(PESEL1.charAt(3)*9)
                +Character.getNumericValue(PESEL1.charAt(4)*1)
                +Character.getNumericValue(PESEL1.charAt(5)*3)
                +Character.getNumericValue(PESEL1.charAt(6)*7)
                +Character.getNumericValue(PESEL1.charAt(7)*9)
                +Character.getNumericValue(PESEL1.charAt(8)*1)
                +Character.getNumericValue(PESEL1.charAt(9)*3);

       if (Character.getNumericValue(PESEL1.charAt(10)) == 10 - suma % 10) {
           System.out.println("Podany PESEL jest prawidłowy");

        }
        else System.out.println("podany numer PESEL nie jest prawidlowy");



    }
}
//Wczytaj z klawiatury pesel i sprawdz czy dziala
//83082897641