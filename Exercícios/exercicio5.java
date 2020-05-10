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
public class exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double km, milhas;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a distância em Km: ");
        km = teclado.nextInt();
        milhas = km/1.60934;
        System.out.println("A distância convertida para milhas é igual a: "+milhas);
        
        
    }
    
}
