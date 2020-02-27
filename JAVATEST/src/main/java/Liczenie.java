public class Liczenie {

    public static void main(String[] args) {
        int iloscPoczatkowychLiczb = 23;
        int iloscZnalezionychLiczb = 0;
        int suma = 0;

        for( int sprawdzanaLiczba =1;iloscZnalezionychLiczb<=iloscPoczatkowychLiczb ;sprawdzanaLiczba++) {
            String sprawdzanaZmienionaLiczba = Integer.toString(sprawdzanaLiczba);
            if (sprawdzanaZmienionaLiczba.endsWith("1") || (sprawdzanaZmienionaLiczba.endsWith("3")
                    || (sprawdzanaZmienionaLiczba.endsWith("7")))){
                suma = suma + sprawdzanaLiczba;
                System.out.println(sprawdzanaLiczba);
                iloscZnalezionychLiczb++;
            }
        }
        System.out.println(suma);

    }
}
// Liczenie wszystkich liczb kończących się na 1,3,7 i podanie ich sumy