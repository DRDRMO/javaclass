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
public class exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h, b, mult, area;
        double l, areaquad, kg, al, imc;
        
        Scanner tec = new Scanner (System.in);
        System.out.println("Cálculo da área do triangulo. digite sua altura: ");
        h = tec.nextInt() ;
        System.out.println("Digite o valor da base: ");
        b = tec.nextInt();
        mult = b*h;
        area = mult/2;
        System.out.println("A área total do triângulo é: "+area);
        
        
        System.out.println("Agora vamos calcular a área de um quadrado. Digite o valor de seu lado: ");
        l = tec.nextInt();
        areaquad = Math.pow(l,2);
        System.out.println("A área do quadrado equivale a: "+areaquad);
        
        
        System.out.println("Agora vamos calcular seu IMC. Digite seu peso: ");
        kg = tec.nextDouble();
        System.out.println("Digite sua altura:");
        al = tec.nextDouble();
        imc = kg/al;
        System.out.println("Seu imc é:"+imc);
        
    }
    
}
