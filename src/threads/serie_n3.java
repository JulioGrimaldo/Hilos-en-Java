package threads;

import static java.lang.System.exit;
import java.util.Scanner;

public class serie_n3 {
    private static void validar(int i, int num){
        if (i==num){
            exit(0);
        }
    }
    public static void main(String[] args) {
        int i, j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros: ");
        int num = scan.nextInt();
        for (i = 0; i < 5; i++) {
            System.out.println(i+1);
        }
        if (num <= 5) {
            exit(0);
        } else {
            do {
                j = 2;
                i++;
                System.out.println(j);
                validar(i, num);
                j = j - 1;
                i++;
                System.out.println(j);
                validar(i, num);
                j++;
                i++;
                System.out.println(j);
                validar(i, num);
                j++;
                i++;
                System.out.println(j);
                validar(i, num);
                j++;
                i++;
                System.out.println(j);
                validar(i, num);
                j++;
                i++;
                System.out.println(j);
                validar(i, num);
                j++;
                i++;
            } while (i < num);
        }
    }

}
