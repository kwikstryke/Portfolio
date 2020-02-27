public class Zad_5 {
    public static void main(String[] args) {
        double suma = 0;
        int [] Tablica;
        Tablica = new int[10];
        for(int i=0;i<=9 ;i++) {

            Tablica[i] = (int) (Math.random() * 20-10);

        }
        for(int i=0;i<=9 ;i++) {

            suma = suma + Tablica[i];
            System.out.println(Tablica[i]);
        }
        System.out.println("średnia: " + suma/10);
    }
}
