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
public class exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes, dias;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o número de mês(es) a ser convertido: ");
        mes = teclado.nextInt();
        dias = mes*30;
        System.out.println("A quantidade de dias é: "+dias);
        
    }
    
}
