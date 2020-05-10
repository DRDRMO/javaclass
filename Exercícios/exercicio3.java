/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhadeexercicios.exercicio01;

import java.util.Scanner;

/**
 *
 * @author Escola
 */
public class exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o número da tabuada que deseja obter: ");
        numero = teclado.nextInt();
        
        a1 = numero*1;
        a2 = numero*2;
        a3 = numero*3;
        a4 = numero*4;
        a5 = numero*5;
        a6 = numero*6;
        a7 = numero*7;
        a8 = numero*8;
        a9 = numero*9;
        a10 = numero*10;
        
        System.out.println("A tabuada do número"+numero+"é: "+a1+", "+a2+", "+a3+", "+a4+", "+a5+", "+a6+", "+a7+", "+a8+", "+a9+", "+a10);
    }
       
        
    
}
