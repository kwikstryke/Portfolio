import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {

        Scanner klawiatura1 = new Scanner(System.in);
        System.out.println("Podaj a:");
        int a = klawiatura1.nextInt();


            Scanner klawiatura2 = new Scanner(System.in);
            System.out.println("Podaj b:");
            int b = klawiatura2.nextInt();

            Scanner klawiatura3 = new Scanner(System.in);
            System.out.println("Podaj c:");
            int c = klawiatura3.nextInt();

            double delta, x1, x2;

            delta = (b * b) -(4 * a) * c;
            if (delta==0) {
                x1 = -b/ (2 * a);
                System.out.println("x= " + x1);
            }
            else  if (delta>0){
                 x1 = (- b - Math.sqrt(delta)) /(2 * a);
                 x2 = (- b + Math.sqrt(delta))/(2 * a);
                 System.out.println("x1 =" + x1);
                 System.out.println("x2 ="+ x2);

            }
            else if (delta<0){
                System.out.println("Równanie nie ma pierwiastów!");
            }






    }
}
