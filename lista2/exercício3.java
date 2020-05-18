package lista2;

import java.util.Scanner;



public class exercício3 {

    
    
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
       String nome;
       double n1, n2, media, soma;
       
        System.out.println("Olá, digite o seu nome: ");
        nome = teclado.nextLine();
        
        System.out.println("Digite sua primeira nota: ");
        n1 = teclado.nextDouble();
        
        System.out.println("Digite sua segunda nota: ");
        n2 = teclado.nextDouble();
        
        soma = n1 + n2;
        media = soma/2;
        
             if (media < 4) { System.out.println(" Nome: " + nome +"; Média: " + media +"; Situação: Reprovado"); 
        } 
         else
             if ((media >=4) && ( media <6 )) { System.out.println (" Nome: " + nome +"; Média: " + media +"; Situação: Recuperação");
        }
         else {System.out.println("Nome: " + nome +"; Média: " + media +"; Situação: Aprovado");     
        }   
    }
    
}
