import java.util.Scanner;

public class Zad_3
{
    public static void main(String[] args)
    {
        Scanner klawiatura =new Scanner(System.in);
               int x= klawiatura.nextInt();

        for (int i =1; i<=x; i++){
            if (i%2==1)

            System.out.println(i);
        }

    }
}
