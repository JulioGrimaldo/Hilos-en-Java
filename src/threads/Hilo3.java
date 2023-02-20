/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author julio
 */
public class Hilo3 extends Thread {

    private static void validar(int i, int num){
        if (i==num){
            exit(0);
        }
    }
    
    @Override
    public void run() {
        int i, j;
        int num;
        
         num = 8000;
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
