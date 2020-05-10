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
public class exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeUsuario;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        nomeUsuario = teclado.next();
        System.out.println("Seja bem vindo "+nomeUsuario);
        
        double a, b, c, d, soma, nota;
        System.out.println("Digite a primeira nota: ");
        a = teclado.nextInt();
        System.out.println("Digite a segunda nota: ");
        b = teclado.nextInt();
        System.out.println("Digite a terceira nota: ");
        c = teclado.nextInt();
        System.out.println("Digite a quarta nota: ");
        d = teclado.nextInt();
        soma = a+b+c+d;
        nota = soma/4;
        System.out.println("Sua média final é:"+nota);
    }
    
}
