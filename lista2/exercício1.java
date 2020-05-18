package lista2;

import java.util.Scanner;



public class exercício1 {

    
    
    public static void main(String[] args) {
        int num;
       Scanner teclado = new Scanner (System.in);
    
       System.out.println("digite um número: ");
       num = teclado.nextInt ();
       
        if (num %2 == 0) {System.out.println("o número é par!");
                       }
        else {System.out.println("O número é impar!");
             }
    }
    
}
