public class Zad

{
    public static void main(String[] args) {
        int[] tablica;
        tablica = new int[5];
        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 13;
        tablica[3] = 4;
        tablica[4] = 5;
        int suma = 0;
        int maks =tablica[0];

        for (int x:tablica){
            suma = x + suma;
            if (x > maks){
                maks = x;
            }
            x++;


        } System.out.println(suma);
        System.out.println(maks);

    }
}
