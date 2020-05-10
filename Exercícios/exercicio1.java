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
public class exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeUsuario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá, informe seu nome:");
        nomeUsuario = teclado.next();
        System.out.println("Olá "+nomeUsuario+"! Seja bem vindo!");
    }
    
}
